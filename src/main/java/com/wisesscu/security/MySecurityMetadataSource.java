package com.wisesscu.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

import com.wisesscu.dao.FunctionDAO;
import com.wisesscu.dao.RoleDAO;
import com.wisesscu.pojo.Function;
import com.wisesscu.pojo.Role;
import com.wisesscu.util.UrlPathMatcher;

/**
 * �������������Դ��Ȩ�޵�ȫ����Ӧ��ϵ�ģ����ṩһ��ͨ����Դ��ȡ����Ȩ�޵ķ����� ���ȣ�����Ҳ��ģ���˴����ݿ��л�ȡ��Ϣ��
 * ����loadResourceDefine�������Ǳ����
 * �����ֻ�Ǽ������е���Դ��Ȩ�޵Ķ�Ӧ��ϵ����������������ÿ�λ�ȡȨ�޶��������ݿ⣨������ܣ���Ȼ��getAttributes���ݲ���
 * ��������url������Ȩ�޼��ϡ�
 * ���ֻ����ʵ����ʵ��һ��ȱ�㣬��ΪloadResourceDefine�����Ƿ��ڹ������ϵ��õģ���������ʵ����ֻ��web����������ʱ����һ��
 * ���Ǿ���˵loadResourceDefine����ֻ�����һ��
 * �������Դ��Ȩ�޵Ķ�Ӧ��ϵ�����������˸ı䣬��ô���������ľ��������ݣ���������ʹ�õľ��ǻ�������
 * ���Ǿͻ���Ȩ�����ˡ��������Դ��Ȩ�޶�Ӧ��ϵ�ǲ���ı�ģ����ַ������ܻ�úܶࡣ
 * ��getAttributes�����������dao������Ǽ����꣬�����Ż���õģ����Կ���ʹ��dao��
 * ��ͨ��������url��ȡ���ݿ��е�����Ȩ�ޣ���װ��Collection<ConfigAttribute>���ؾ����ˡ������򵥣�
 * 
 * @author limingxing
 * @2015-12-3 version 1.0v
 */
public class MySecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
	private static Map<String, Collection<ConfigAttribute>>	resourceMap	= null;
	@Autowired
	private FunctionDAO																			functionDAO;
	@Autowired
	private RoleDAO																					roleDAO;
	private UrlPathMatcher																	urlMatcher	= new UrlPathMatcher();
	
	/**
	 * @PostConstruct��Java EE 5�����ע�⣬ Spring�����������ܹ�Bean��ʹ��������DI����ʵ������ǰ�ܹ�Beanʱ��
	 * @PostConstructע��ķ����ᱻ�Զ��������Ӷ����һЩ��ʼ��������
	 *                                        
	 *                                        ����������Դ��Ȩ�޵Ĺ�ϵ
	 */
	//@PostConstruct
	private void loadResourceDefine() {
		resourceMap = new HashMap<String, Collection<ConfigAttribute>>();
		List<Role> roles = roleDAO.findAllEffectiveRoles();
		for (Role role : roles) {
			List<Function> functions = this.functionDAO.findAllEffectiveFunctionsbyRoleId(role.getId());
			for (Function function : functions) {
				Collection<ConfigAttribute> configAttributes = new ArrayList<ConfigAttribute>();
				ConfigAttribute configAttribute = new SecurityConfig(role.getRoleName());
				configAttributes.add(configAttribute);
				String url = function.getAction();
				if (resourceMap.containsKey(url)) {
					
					Collection<ConfigAttribute> value = resourceMap.get(url); // ȡ�����url��Ȩ�޼���
					value.add(configAttribute);
					resourceMap.put(url, value);
				} else {
					Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();
					atts.add(configAttribute);
					resourceMap.put(url, atts);
				}
			}
		}
	}
	
	public Collection<ConfigAttribute> getAllConfigAttributes() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * ������Ҫ���ʵ�url���������url��Ӧ������Ȩ�ޣ����ɫ��
	 */
	public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
		loadResourceDefine();
		// object getRequestUrl �ǻ�ȡ�û������url��ַ
		String url = ((FilterInvocation) object).getRequestUrl();
		
		// resourceMap������loadResourceDefine�������ؽ���������
		Iterator<String> ite = resourceMap.keySet().iterator();
		
		while (ite.hasNext()) {
			
			// ȡ��resourceMap�ж�ȡ���ݿ��url��ַ
			String resURL = ite.next();
			
			// �������
			// url��ַ��ͬ����ô������resourceMap�ж�Ӧ��Ȩ�޼��ϣ�Ȼ����ת��MyAccessDecisionManager�����decide���������ж�Ȩ��
			if (urlMatcher.pathMatchesUrl(url, resURL)) {
				return resourceMap.get(resURL); // ���ض�Ӧ��url��ַ��Ȩ��
				// ��resourceMap��һ������Ϊ��ַ��ֵΪȨ�޵ļ��϶���
			}
		}
		
		// ������������url��ַû��ƥ�䣬����return
		// null�����ٵ���MyAccessDecisionManager�����decide��������Ȩ����֤�������������ҳ��
		return null;
	}
	
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return true;
	}
	
}
