package com.wisesscu.dao;

import java.util.ArrayList;

import com.wisesscu.pojo.User;

public interface IUserDao {
	int deleteByPrimaryKey(Integer id);
	int insert(User record);
	int insertSelective(User record);
	User selectByPrimaryKey(Integer id);
	int updateByPrimaryKeySelective(User record);
	int updateByPrimaryKey(User record);
	ArrayList<User> all();
	ArrayList<User> getUserByName(String userName);
}
