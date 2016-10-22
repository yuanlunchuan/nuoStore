package com.wisesscu.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.wisesscu.dao.RoleDAO;
import com.wisesscu.dao.UserDao;
import com.wisesscu.pojo.Role;
import com.wisesscu.pojo.User;

/**
 * ͨ��MyUserDetailServiceImpl�õ��û���Ϣ��authenticationManager�Ա��û������루����֤�û���
 *
 * User userdetail����ʵ�� UserDetails �ӿڣ���������֤�ɹ���ᱻ�����ڵ�ǰ�ػ���principal������ ��ö���ķ�ʽ��
 * WebUserDetails webUserDetails =
 * (WebUserDetails)SecurityContextHolder.getContext().getAuthentication().
 * getPrincipal();
 * 
 * ����JSP�У� <sec:authentication property="principal.username"/>
 * 
 * �����Ҫ�����û����������ԣ�����ʵ�� UserDetails �ӿ���������Ӧ���Լ��� Ȩ����֤��
 * 
 * @author lanyuan 2013-11-19
 * @author limingxing
 * @2015-12-2 version 1.0v
 */
public class MyUserDetailServiceImpl implements UserDetailsService {
	@Autowired
	private UserDao	userDao;
	@Autowired
	private RoleDAO	roleDAO;
	
	/**
	 * ��½��֤ʱ��ͨ��username��ȡ�û�������Ȩ����Ϣ��
	 * ������User�ŵ�spring��ȫ�ֻ���SecurityContextHolder�У��Թ���Ȩ��ʹ��
	 */
	public UserDetails loadUserByUsername(String loginName) throws UsernameNotFoundException {
		User user = null;
		List<User> list = userDao.findUserByLoginName(loginName);
		if (list != null && list.size() != 0)
			user = list.get(0);
		Collection<GrantedAuthority> grantedAuths = obtionGrantedAuthorities(user);
		org.springframework.security.core.userdetails.User userdetail = new org.springframework.security.core.userdetails.User(
		    user.getLoginName(), user.getPassword(), true, true, true, true, grantedAuths);
		return userdetail;
	}
	
	/**
	 * ȡ���û���Ȩ��
	 * 
	 * @param user
	 * @return
	 */
	private Set<GrantedAuthority> obtionGrantedAuthorities(User user) {
		List<Role> roles = roleDAO.findRolesByLoginName(user.getLoginName());
		Set<GrantedAuthority> authSet = new HashSet<GrantedAuthority>();
		for (Role res : roles) {
			// �û����Է��ʵ���Դ���ƣ�����˵�û���ӵ�е�Ȩ�ޣ� ע�⣺����"ROLE_"��ͷ
			authSet.add(new SimpleGrantedAuthority(res.getRoleName()));
		}
		return authSet;
	}
}
