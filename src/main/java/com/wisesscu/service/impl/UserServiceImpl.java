package com.wisesscu.service.impl;

import org.springframework.stereotype.Service;

import com.wisesscu.dao.IUserDao;
import com.wisesscu.pojo.User;
import com.wisesscu.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	//@Resource
	private IUserDao userDao;

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
}
