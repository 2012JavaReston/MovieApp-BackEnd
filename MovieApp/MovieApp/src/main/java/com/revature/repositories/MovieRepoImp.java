package com.revature.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Comment;
import com.revature.models.Movie;

@Repository("MovieRepoImp")
@Transactional
public class MovieRepoImp implements MovieRepo {

	private SessionFactory sessFact;
	
	
	public MovieRepoImp(SessionFactory sessFact) {
		super();
		this.sessFact = sessFact;
	}

	@Override
	public boolean insertMovie(Movie movie) {
		sessFact.getCurrentSession().save(movie);
		return true;
	}

	@Override
	public List<Movie> selectAllMovies() {
		return sessFact.getCurrentSession().createQuery("from Movie", Movie.class).list();
	}

	@Override
	public List<Movie> getMovieByMovieId(int movieId) {
		return sessFact.getCurrentSession().createQuery("from Movie where movieID = " + movieId, Movie.class).list();
	}

	@Override
	public List<Movie> getMovieByUserId(int userId) {
		return sessFact.getCurrentSession().createQuery("from Movie where userID = " + userId, Movie.class).list();
	}

	@Override
	public boolean updateMovie(Movie movie) {
		sessFact.getCurrentSession().update(movie);
		return true;
	}

	@Override
	public boolean deleteComment(Movie movie) {
		sessFact.getCurrentSession().delete(movie);
		return true;
	}

}
