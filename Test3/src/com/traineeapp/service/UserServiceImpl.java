package com.traineeapp.service;

import com.traineeapp.dao.user.User;
import com.traineeapp.dao.user.UserDao;
import com.traineeapp.dao.user.UserDaoImpl;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	
	public UserServiceImpl() {
		userDao=new UserDaoImpl();
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public User getUser(String username, String password) {
		return userDao.getUser(username, password);
	}

}
