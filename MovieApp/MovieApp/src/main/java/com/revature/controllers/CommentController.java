package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.revature.models.Comment;
import com.revature.services.CommentService;

@Controller
@RequestMapping(value = "/comment")
@CrossOrigin(origins = "*")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	//Works in postman using get and params
	
	@ResponseStatus(value = HttpStatus.FOUND)
	@GetMapping(value = "/userID")
	public @ResponseBody List<Comment> getCommentByUserID(@RequestParam("userID") int userID) {
		return this.commentService.getCommentByUserID(userID);
		
	}
	
	//Works in postman using get and params
	
	@ResponseStatus(value = HttpStatus.FOUND)
	@GetMapping(value = "/movieID")
	public @ResponseBody List<Comment> getCommentByMovieID(@RequestParam("movieID") int movieID) {
		return this.commentService.getCommentByUserID(movieID);
		
	}
	
	//Works in postman using post and JSON
	
	@ResponseStatus(value = HttpStatus.CREATED)
	@PostMapping(value = "/insert")
	public void insertComment(@RequestBody Comment comment) {
		this.commentService.insertComment(comment);
	}

}
