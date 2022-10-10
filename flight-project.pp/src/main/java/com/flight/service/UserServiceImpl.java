package com.flight.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flight.dao.UserDao;
import com.flight.dto.User;
import com.flight.exception.UserDataNotFoundException;

@Service

public class UserServiceImpl implements UserService {
private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	//Posting:
	@Override
	public User createUser(User newUser) {
		return userDao.save(newUser);
	}
	
	//Update by ID:
	@Override
	public User updateUser(User newUser, long UserId) {
		User existingUser = userDao.findById(UserId).orElseThrow( ()->
		new UserDataNotFoundException("User", "userId",UserId));
		existingUser.setUserName(newUser.getUserName());
		existingUser.setUserPassword(newUser.getUserPassword());
		existingUser.setUserPhone(newUser.getUserPhone());
		existingUser.setUserEmail(newUser.getUserEmail());
		userDao.save(existingUser);
		return existingUser;
	}

	//Delete by ID:
	@Override
	public void deleteUser(long UserId) {
		userDao.findById(UserId).orElseThrow(()->
		new UserDataNotFoundException("User", "userId",UserId));
				userDao.deleteById(UserId);
	}

	//Getting all:
	@Override
	public List<User> displayAllUser() {
		return userDao.findAll();
	}
	
	//Getting values by ID:
	@Override
	public User findUserById(long UserId) {
		return userDao.findById(UserId).orElseThrow( ()->
		new UserDataNotFoundException("User" , "userId" , UserId));
	}

	
	}


