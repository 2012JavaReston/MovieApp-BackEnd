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

import com.revature.models.Movie;
import com.revature.services.MovieService;

@Controller
@RequestMapping(value = "/movie")
@CrossOrigin(origins = "*")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	//Works in postman using get and params
	
	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping(value = "/movieID")
	public @ResponseBody List<Movie> getMovieByMovieID(@RequestParam("movieID") int movieID) {
		return this.movieService.getMovieByMovieID(movieID);
	}
	
	//Works in postman using get and params
	
	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping(value = "/userID")
	public @ResponseBody List<Movie> getMovieByUserID(@RequestParam("userID") int userID) {
		return this.movieService.getMovieByUserID(userID);
	}
	
	//Works in postman using post and JSON
	
	@ResponseStatus(value = HttpStatus.CREATED)
	@PostMapping(value = "/insert")
	public void insertMovie(@RequestBody Movie movie) {
		this.movieService.insertMovie(movie);
	}
	
	//Works in postman using get and params
	
	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping(value = "/user/likedlist")
	public @ResponseBody List<Movie> getLikedByUserID(@RequestParam("userID") int userID) {
		return this.movieService.getLikedByUserID(userID);
	}
	//Works in postman using get and params
	
	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping(value = "/user/watchlist")
	public @ResponseBody List<Movie> getWatchListByUserID(@RequestParam("userID") int userID) {
		return this.movieService.getWatchListByUserID(userID);
	}
	
}
