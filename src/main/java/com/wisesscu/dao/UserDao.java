package com.wisesscu.dao;

import java.util.List;

import com.wisesscu.pojo.User;

public interface UserDao {
	List<User> findUser(User user);
}
