package com.revature.repositories;

import java.util.List;

import com.revature.models.Comment;
import com.revature.models.Movie;

public interface MovieRepo {

	//CRUD Methods
	
	//Create
	boolean insertMovie(Movie movie);
	
	//Read
	public List<Movie> selectAllMovies();
	
	//Read
	public List<Movie> getMovieByMovieId(int movieId);
	
	//Read
	public List<Movie> getMovieByUserId(int userId);
	
	//Read
	public List<Movie> getLikedByUserId(int userId);
	
	//Read
	public List<Movie> getWatchListByUserId(int userId);

	//Update
	boolean updateMovie(Movie movie);
	
	//Delete
	boolean deleteMovie(Movie movie);

}
