package com.revature.services;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Movie;
import com.revature.repositories.MovieRepo;

@Service("MovieService")
public class MovieService {
	
	@Autowired
	private MovieRepo movieRepo;
	
	public List<Movie> getMovieByUserID(int userID) {
		List<Movie> fetched;
		try {
			fetched = this.movieRepo.getMovieByUserId(userID);
		} catch(NoResultException e) {
			fetched = null;
		}
		return fetched;
	}
	
	public List<Movie> getMovieByMovieID(int movieID) {
		List<Movie> fetched;
		try {
			fetched = this.movieRepo.getMovieByMovieId(movieID);
		} catch(NoResultException e) {
			fetched = null;
		}
		return fetched;
	}
	
	public boolean insertMovie(Movie movie) {
		boolean result;
		result = movieRepo.insertMovie(movie);
		return result;
	}
	
	public List<Movie> getLikedByUserID(int userID) {
		List<Movie> fetched;
		try {
			fetched = this.movieRepo.getLikedByUserId(userID);
		} catch(NoResultException e) {
			fetched = null;
		}
		return fetched;
	}
	
	public List<Movie> getWatchListByUserID(int userID) {
		List<Movie> fetched;
		try {
			fetched = this.movieRepo.getWatchListByUserId(userID);
		} catch(NoResultException e) {
			fetched = null;
		}
		return fetched;
	}

}
