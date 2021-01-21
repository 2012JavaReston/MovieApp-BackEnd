package com.revature.repositories;

import java.util.List;

import com.revature.models.User;


public interface UserRepo {
	
	//CRUD Methods
	
	//Create
	boolean insertUser(User user);
	
	//Read
	public List<User> selectAllUsers();
	
	//Update
	boolean updateUser(User user);
	
	//Delete
	boolean deleteUser(User user);

}