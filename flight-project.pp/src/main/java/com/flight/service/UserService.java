package com.flight.service;

import java.util.List;

import com.flight.dto.User;

public interface UserService {
	//For creating:
    User createUser(User newUser);
    //Update:
    User updateUser(User newUser, long UserId);
    //Delete:
    void deleteUser(long UserId);
    //Get all:
    List<User>displayAllUser();
    //Get by id:
    User findUserById(long UserId);

}
