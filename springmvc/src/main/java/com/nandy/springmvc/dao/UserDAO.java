package com.nandy.springmvc.dao;

import java.util.List;

import com.nandy.springmvc.model.Login;
import com.nandy.springmvc.model.User;

public interface UserDAO {
	
	void register(User user);
	
	User validateUser(Login login);

	List<User> getAllUsers();

}
