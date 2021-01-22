package com.revature.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.revature.services.UserService;

//@Controller
//@RequestMapping(value = "/user")
//@CrossOrigin(origins = "*")
public class UserController {
	
	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	private UserService userService;
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	public UserController() {
		this.userService = appContext.getBean("UserService", UserService.class);
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping(value = "/login")
	public @ResponseBody String login(HttpServletRequest req, @RequestParam("username") String username, @RequestParam("password") String password) {
		boolean login = userService.login(username, password);
		if(login) {
			HttpSession session = req.getSession();
			return "Success";
		}
		return "Failure";
	}
}
