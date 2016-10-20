package com.wisesscu.service;

import java.util.ArrayList;

import com.wisesscu.pojo.User;

public interface IUserService {
	User getUserById(int userId);
	int save(User user);
	ArrayList<User> all();
	int destroy(int userId);
	int update(User user);
	ArrayList<User> getUserByName(String userName);
}
