package com.wisesscu.service;

import com.wisesscu.pojo.User;

public interface IUserService {
	public User getUserById(int userId);
	public int save(User user);
}
