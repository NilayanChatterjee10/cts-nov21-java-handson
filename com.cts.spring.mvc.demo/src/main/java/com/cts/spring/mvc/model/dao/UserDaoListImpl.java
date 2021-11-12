package com.cts.spring.mvc.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.spring.mvc.model.beans.User;

// this acts like temporary database
@Repository
public class UserDaoListImpl implements UserDao {
	
	private static List<User> tempDB = new ArrayList<User>();

	@Override
	public User store(User user) {
		user.setUserId(tempDB.size() + 1); // to generate the id
		tempDB.add(user);
		return user;
	}

	@Override
	public User findUser(int id) {
		User user = tempDB.stream()
				.filter(item -> item.getUserId() == id).findAny().orElseGet(null);
		return user;
	}

	@Override
	public List<User> findAllUsers() {
		return tempDB;
	}

}