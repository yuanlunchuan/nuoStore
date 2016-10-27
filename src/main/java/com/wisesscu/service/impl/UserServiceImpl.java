package com.wisesscu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wisesscu.dao.UserDao;
import com.wisesscu.pojo.User;
import com.wisesscu.service.IUserService;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserDao userDao;

	public List<User> find(User user) {
		return this.userDao.findUser(user);
	}

	public List<User> all() {
		// TODO Auto-generated method stub
		return null;
	}

	public int destroy(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(User user) {
		// TODO Auto-generated method stub
		return 0;
	}
}
