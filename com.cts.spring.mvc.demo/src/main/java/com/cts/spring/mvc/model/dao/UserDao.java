package com.cts.spring.mvc.model.dao;

import java.util.List;

import com.cts.spring.mvc.model.beans.User;

public interface UserDao {
	public User store(User user);
	public User findUser(int id);
	public List<User> findAllUsers();
}