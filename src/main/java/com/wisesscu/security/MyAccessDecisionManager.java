package com.wisesscu.security;

import java.util.Collection;
import java.util.Iterator;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

/**
 * ���Ҳ��Ϊ��Ȩ����ͨ����¼�û���Ȩ����Ϣ����Դ����ȡ��Դ�����Ȩ�������ݲ�ͬ����Ȩ�������ж��û��Ƿ���Ȩ�޷�����Դ�� <!--
 * �û��Ƿ�ӵ����������Դ��Ȩ�� -->
 * 
 * @author limingxing
 * @2015-12-2 version 1.0v
 */
public class MyAccessDecisionManager implements AccessDecisionManager {
	/**
	 * ����û��Ƿ�Ȩ�޷�����Դ
	 * ����authentication�Ǵ�spring��ȫ�ֻ���SecurityContextHolder���õ��ģ��������û���Ȩ����Ϣ
	 * ����object��url ����configAttributes�����Ȩ��
	 */
	public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes)
	    throws AccessDeniedException, InsufficientAuthenticationException {
		if (configAttributes == null) {
			return;
		}
		
		Iterator<ConfigAttribute> ite = configAttributes.iterator();
		while (ite.hasNext()) {
			ConfigAttribute ca = ite.next();
			String needRole = ((SecurityConfig) ca).getAttribute();
			for (GrantedAuthority ga : authentication.getAuthorities()) {
				if (needRole.equals(ga.getAuthority())) {
					
					return;
				}
			}
		}
		// ע�⣺ִ�������̨�ǻ����쳣�ģ����ǽ������ת�������access-denied-pageҳ��
		throw new AccessDeniedException(" û��Ȩ�޷��ʣ� ");
		
	}
	
	public boolean supports(ConfigAttribute arg0) {
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return true;
	}
	
}
