package com.mars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mars.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public void saveUser() {
		this.userDao.saveUser();
	}
	
}
