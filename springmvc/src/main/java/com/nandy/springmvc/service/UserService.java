package com.nandy.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nandy.springmvc.dao.UserDAO;
import com.nandy.springmvc.model.Login;
import com.nandy.springmvc.model.User;

@Service
public class UserService {
	
	@Autowired
	@Qualifier("mySqlUserDao")
	private UserDAO userDao;
	
	public void register(User user) {
		userDao.register(user);
	}
	
	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}

	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

}
