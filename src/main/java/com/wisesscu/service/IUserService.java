package com.wisesscu.service;

import java.util.ArrayList;

import com.wisesscu.pojo.User;

public interface IUserService {
	public User getUserById(int userId);
	public int save(User user);
	public ArrayList<User> all();
	public int destroy(int userId);
	public int update(User user);
}
