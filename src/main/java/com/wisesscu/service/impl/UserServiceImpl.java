package com.wisesscu.service.impl;

import java.util.ArrayList;

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
		return this.userDao.selectByPrimaryKey(userId);
	}

	public int save(User user){
		return this.userDao.insert(user);
	}

	public ArrayList<User> all() {
		return this.userDao.all();
	}
	public int destroy(int userId){
		return this.userDao.deleteByPrimaryKey(userId);
	}
	public int update(User user){
		return this.userDao.updateByPrimaryKeySelective(user);
	}
}
