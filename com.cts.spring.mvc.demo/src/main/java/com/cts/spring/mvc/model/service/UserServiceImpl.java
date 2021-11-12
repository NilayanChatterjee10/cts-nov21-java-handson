package com.cts.spring.mvc.model.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.spring.mvc.model.dao.*;
import com.cts.spring.mvc.model.beans.*;

@Service
public class UserServiceImpl {
	@Autowired
	private UserDao userDao; // UserDaoListImpl instance will be injected

	public User storeUser(User user) {
		return userDao.store(user);
	}
	public User findUser(int id) {
		return userDao.findUser(id);
	}
	public List<User> findAllUsers() {
		return userDao.findAllUsers();
	}
	public List<User> findUsersByName(String username) {
		List<User> users = findAllUsers();
		return users.stream().filter(item -> item.getUsername().equals(username)).collect(Collectors.toList());
	}
	public List<User> findUsersOrderByName() {
		return findAllUsers().stream()
				.sorted((u1, u2) -> u1.getUsername().compareTo(u2.getUsername())).collect(Collectors.toList());
	}
}