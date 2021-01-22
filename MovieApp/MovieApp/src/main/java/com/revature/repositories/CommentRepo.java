package com.revature.repositories;

import java.util.List;

import com.revature.models.Comment;

public interface CommentRepo {
	
	//CRUD Methods
	
	//Create
	boolean insertComment(Comment comment);
	
	//Read
	public List<Comment> selectAllComments();
	
	//Read
	public List<Comment> getCommentByUserId(int userId);
	
	//Update
	boolean updateComment(Comment comment);
	
	//Delete
	boolean deleteComment(Comment comment);

}
