package com.revature.services;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Lists;
import com.revature.repositories.ListsRepo;

@Service("MovieService")
public class ListsService {
	
	@Autowired
	private ListsRepo listsRepo;
	
	public List<Lists> getListsByUserID(int userID) {
		List<Lists> fetched;
		try {
			fetched = this.listsRepo.getListsByUserId(userID);
		} catch(NoResultException e) {
			fetched = null;
		}
		return fetched;
	}
	
	public List<Lists> getListsByMovieID(int movieID) {
		List<Lists> fetched;
		try {
			fetched = this.listsRepo.getListsByMovieId(movieID);
		} catch(NoResultException e) {
			fetched = null;
		}
		return fetched;
	}
	
	public boolean insertList(Lists list) {
		boolean result;
		result = listsRepo.insertList(list);
		return result;
	}
	
	public List<Lists> getLikedByUserID(int userID) {
		List<Lists> fetched;
		try {
			fetched = this.listsRepo.getLikedByUserId(userID);
		} catch(NoResultException e) {
			fetched = null;
		}
		return fetched;
	}
	
	public List<Lists> getWatchListByUserID(int userID) {
		List<Lists> fetched;
		try {
			fetched = this.listsRepo.getWatchListByUserId(userID);
		} catch(NoResultException e) {
			fetched = null;
		}
		return fetched;
	}

}
