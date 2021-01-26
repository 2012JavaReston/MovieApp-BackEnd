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
	
	@ResponseStatus(value = HttpStatus.FOUND)
	@GetMapping(value = "/ID")
	public @ResponseBody List<Movie> getMovieByMovieID(@RequestParam("movieID") int movieID) {
		return this.movieService.getMovieByMovieID(movieID);
	}

	@ResponseStatus(value = HttpStatus.FOUND)
	@GetMapping(value = "/all")
	public @ResponseBody List<Movie> getAllMovies() {
		return this.movieService.getAllMovies();
		
	}
	
	@ResponseStatus(value = HttpStatus.CREATED)
	@PostMapping(value = "/insert" )
	public void insertMovie(@RequestBody Movie movie) {
		this.movieService.insertMovie(movie);
	}
	
}
