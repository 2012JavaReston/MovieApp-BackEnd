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
	public List<Lists> getListsByMovieId(int movieId);
	
	//Read
	public List<Lists> getListsByUserId(int userId);
	
	//Read
	public List<Lists> getLikedByUserId(int userId);
	
	//Read
	public List<Lists> getWatchListByUserId(int userId);

	//Update
	boolean updateList(Lists movie);
	
	//Delete
	boolean deleteList(Lists movie);

}
