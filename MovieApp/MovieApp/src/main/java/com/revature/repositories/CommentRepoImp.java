package com.revature.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.revature.models.Comment;

@Repository("CommentRepoImp")
@Transactional
public class CommentRepoImp implements CommentRepo {
	
	private SessionFactory sessFact;

	public CommentRepoImp(SessionFactory sessFact) {
		super();
		this.sessFact = sessFact;
	}

	@Override
	public boolean insertComment(Comment comment) {
		sessFact.getCurrentSession().save(comment);
		return true;
	}

	@Override
	public List<Comment> selectAllComments() {
		return sessFact.getCurrentSession().createQuery("from Comment", Comment.class).list();
	}
	
	@Override
	public List<Comment> getCommentByUserId(int userId) {
		return sessFact.getCurrentSession().createQuery("from Comment where userID = :userId", Comment.class).setInteger("userId", userId).list();
	}

	@Override
	public boolean updateComment(Comment comment) {
		sessFact.getCurrentSession().update(comment);
		return true;
	}

	@Override
	public boolean deleteComment(Comment comment) {
		sessFact.getCurrentSession().delete(comment);
		return true;
	}

}
