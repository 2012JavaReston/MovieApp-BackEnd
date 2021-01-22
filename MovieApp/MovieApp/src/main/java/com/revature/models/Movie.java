package com.revature.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movie_table")
public class Movie {
	
	@Id
	@Column(name = "feature_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int featureId;
	
	@Column(name = "movie_id", nullable = false)
	private int movieID;
	
	@Column(name = "movie_like")
	private boolean movieLike;
	
	@Column(name = "movie_watch_list")
	private boolean movieWatchList;
	
	@Column(name = "user_id")
	private int userID;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "user_foreign_key")
	private User user;

	public Movie() {
		super();
	}

	public Movie(int featureId, int movieID, boolean movieLike, boolean movieWatchList, int userID) {
		super();
		this.featureId = featureId;
		this.movieID = movieID;
		this.movieLike = movieLike;
		this.movieWatchList = movieWatchList;
		this.userID = userID;
	}

	public int getFeatureId() {
		return featureId;
	}

	public void setFeatureId(int featureId) {
		this.featureId = featureId;
	}

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public boolean isMovieLike() {
		return movieLike;
	}

	public void setMovieLike(boolean movieLike) {
		this.movieLike = movieLike;
	}

	public boolean isMovieWatchList() {
		return movieWatchList;
	}

	public void setMovieWatchList(boolean movieWatchList) {
		this.movieWatchList = movieWatchList;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "Movie [featureId=" + featureId + ", movieID=" + movieID + ", movieLike=" + movieLike
				+ ", movieWatchList=" + movieWatchList + ", userID=" + userID + "]";
	}
	
}
