package com.wisesscu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisesscu.dao.IUserDao;
import com.wisesscu.pojo.User;
import com.wisesscu.service.IUserService;

@Service(value="userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDao;

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
}
