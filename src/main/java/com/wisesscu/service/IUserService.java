package com.wisesscu.service;

import java.util.List;

import com.wisesscu.pojo.User;

public interface IUserService {
	List<User> find(User user);
	List<User> all();
	int destroy(User user);
	int update(User user);
}
