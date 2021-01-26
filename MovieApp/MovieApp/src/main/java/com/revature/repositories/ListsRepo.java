package com.revature.repositories;

import java.util.List;

import com.revature.models.Lists;

public interface ListsRepo {

	//CRUD Methods
	
	//Create
	boolean insertList(Lists list);
	
	//Read
	public List<Lists> selectAllLists();
	
	//Read
	public List<Lists> getListsByMovieId(int movieID);
	
	//Read
	public List<Lists> getListsByUserId(int userID);
	
	//Read
	public List<Lists> getLikedByUserId(int userID);
	
	//Read
	public List<Lists> getListByUserAndMovie(int userID, int movieID);
	
	//Read
	public List<Lists> getWatchListByUserId(int userID);

	//Update
	boolean updateList(Lists movie);
	
	//Update
	boolean updateLike(int userID,int movieID);
	
	//Update
	boolean updateWatchList(int userID,int movieID);
	
	//Delete
	boolean deleteList(Lists movie);

}
