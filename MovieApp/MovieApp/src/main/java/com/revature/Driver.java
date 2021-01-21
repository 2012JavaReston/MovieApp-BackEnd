package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.models.Comment;
import com.revature.models.User;
import com.revature.repositories.CommentRepoImp;
import com.revature.repositories.UserRepoImp;

public class Driver {
	
	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	private static UserRepoImp uRepoImp = appContext.getBean("UserRepoImp", UserRepoImp.class);
	private static CommentRepoImp cRepoImp = appContext.getBean("CommentRepoImp", CommentRepoImp.class);
	public static void main(String[] args) {
		
		User user = new User(0, "username", "password","user", "name" );
		uRepoImp.insertUser(user);
		
		System.out.println(uRepoImp.selectAllUsers());
		
		User user1 = new User(1, "user", "password","user", "name" );
		uRepoImp.updateUser(user1);
	
		System.out.println(uRepoImp.selectAllUsers());
		
		uRepoImp.deleteUser(user1);
		
		System.out.println(uRepoImp.selectAllUsers());
		
		Comment comment = new Comment(0, "comment", 1, 1);
		cRepoImp.insertComment(comment);
		
		System.out.println(cRepoImp.selectAllComments());
		
		Comment comment1 = new Comment(2, "comments", 1, 1);
		cRepoImp.updateComment(comment1);
		
		System.out.println(cRepoImp.selectAllComments());
		
		cRepoImp.deleteComment(comment1);
		
		System.out.println(cRepoImp.selectAllComments());
		
	}
	
}
