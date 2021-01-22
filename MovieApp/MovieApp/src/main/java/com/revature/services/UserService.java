package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.revature.models.User;
import com.revature.repositories.UserRepo;
import com.revature.repositories.UserRepoImp;

//@Component("UserService")
public class UserService {
	
	private UserRepo userRepo;
	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@Autowired
	public UserService() {
		super();
		this.userRepo = appContext.getBean("UserRepoImp", UserRepoImp.class);
	}
	
	public UserService(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	public UserRepo getUserRepo() {
		return userRepo;
	}

	public void setUserRepo(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	public boolean login(String username, String password) {
		boolean login = false;
		User fetched = userRepo.selectByUsername(username);
		if(fetched.getPassword().equals(password)) {
			//LOG THAT LOGIN WAS SUCCESS
			login = true;
		} else {
			//LOG THAT LOGIN WAS FAILURE
			login = false;
		}
		return login;
	}

}
