package com.wisesscu.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

/**
 * ���ȣ���½��ÿ�η�����Դ���ᱻ������������أ���ִ��doFilter����������������������invoke����������fi�ϵ���ʾ��һ��url��
 * ������д��toString�����ɣ��������滹��һЩ�����ģ�������Ҫ����beforeInvocation���������
 * �����Ȼ����MyInvocationSecurityMetadataSource���getAttributes������ȡ������url�����Ȩ��
 * ���ڵ���MyAccessDecisionManager��decide�����ж��û��Ƿ�Ȩ�ޡ�Ū����һ�оͻ�ִ����һ����������
 * ���ĵ�InterceptorStatusToken token =
 * super.beforeInvocation(fi);��������Ƕ����accessDecisionManager:decide(Object
 * object)��securityMetadataSource :getAttributes(Object object)������
 * 
 * �Լ�ʵ�ֵĹ����û������࣬Ҳ����ֱ��ʹ�� FilterSecurityInterceptor
 * AbstractSecurityInterceptor�����������ࣺ
 * FilterSecurityInterceptor��������FilterInvocation��ʵ�ֶ�URL��Դ�����ء�
 * MethodSecurityInterceptor��������MethodInvocation��ʵ�ֶԷ������õ����ء�
 * AspectJSecurityInterceptor��������JoinPoint����Ҫ�����ڶ����淽��(AOP)���õ����ء�
 * ������ֱ��ʹ��ע���Action�����������أ������ڷ����ϼӣ� @PreAuthorize("hasRole('ROLE_SUPER')")
 * 
 * @author limingxing
 * @2015-12-3 version 1.0v
 */
public class MySecurityFilter extends AbstractSecurityInterceptor implements Filter {
	// �����ļ�ע��
	@Autowired
	private FilterInvocationSecurityMetadataSource securityMetadataSource;
	
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	    throws IOException, ServletException {
		FilterInvocation fi = new FilterInvocation(request, response, chain);
		invoke(fi);
	}
	
	public void invoke(FilterInvocation fi) throws IOException, ServletException {
		// fi������һ�������ص�url
		// �������MyInvocationSecurityMetadataSource��getAttributes(Object
		// object)���������ȡfi��Ӧ������Ȩ��
		// �ٵ���MyAccessDecisionManager��decide������У���û���Ȩ���Ƿ��㹻
		InterceptorStatusToken token = super.beforeInvocation(fi);
		try {
			// ִ����һ��������
			fi.getChain().doFilter(fi.getRequest(), fi.getResponse());
		} finally {
			super.afterInvocation(token, null);
		}
	}
	
	public void init(FilterConfig arg0) throws ServletException {
	}
	
	@Override
	public Class<?> getSecureObjectClass() {
		// TODO Auto-generated method stub
		return FilterInvocation.class;
	}
	
	@Override
	public SecurityMetadataSource obtainSecurityMetadataSource() {
		// TODO Auto-generated method stub
		return this.securityMetadataSource;
	}
	
	public FilterInvocationSecurityMetadataSource getSecurityMetadataSource() {
		return securityMetadataSource;
	}
	
	public void setSecurityMetadataSource(FilterInvocationSecurityMetadataSource securityMetadataSource) {
		this.securityMetadataSource = securityMetadataSource;
	}
	
}
