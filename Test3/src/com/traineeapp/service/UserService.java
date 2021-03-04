package com.traineeapp.service;

import com.traineeapp.dao.user.User;

public interface UserService {
	public void addUser(User user);
	public User getUser(String username, String password);
}
