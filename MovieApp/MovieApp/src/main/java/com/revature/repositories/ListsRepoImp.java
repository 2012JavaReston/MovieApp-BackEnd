package com.revature.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Lists;

@Repository("MovieRepoImp")
@Transactional
public class ListsRepoImp implements ListsRepo {

	private SessionFactory sessFact;
	
	
	public ListsRepoImp(SessionFactory sessFact) {
		super();
		this.sessFact = sessFact;
	}

	@Override
	public boolean insertList(Lists list) {
		sessFact.getCurrentSession().save(list);
		return true;
	}

	@Override
	public List<Lists> selectAllLists() {
		return sessFact.getCurrentSession().createQuery("from Lists", Lists.class).list();
	}

	@Override
	public List<Lists> getListsByMovieId(int movieId) {
		return sessFact.getCurrentSession().createQuery("from Lists where movieID = " + movieId, Lists.class).list();
	}

	@Override
	public List<Lists> getListsByUserId(int userId) {
		return sessFact.getCurrentSession().createQuery("from Lists where userID = " + userId, Lists.class).list();
	}

	@Override
	public boolean updateList(Lists list) {
		sessFact.getCurrentSession().update(list);
		return true;
	}

	@Override
	public boolean deleteList(Lists list) {
		sessFact.getCurrentSession().delete(list);
		return true;
	}

	@Override
	public List<Lists> getLikedByUserId(int userId) {
		return sessFact.getCurrentSession().createQuery("from Lists where userID = " + userId + "and movieLike = true", Lists.class).list();
	}

	@Override
	public List<Lists> getWatchListByUserId(int userId) {
		return sessFact.getCurrentSession().createQuery("from Lists where userID = " + userId + "and movieWatchList = true", Lists.class).list();
	}

}
