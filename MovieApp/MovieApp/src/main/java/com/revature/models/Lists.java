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
@Table(name = "lists_table")
public class Lists {
	
	@Id
	@Column(name = "list_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int listID;
	
	@Column(name = "movie_id", nullable = false)
	private int movieID;
	
	@Column(name = "movie_like")
	private boolean movieLike;
	
	@Column(name = "movie_watch_list")
	private boolean movieWatchList;
	
	@Column(name = "user_id")
	private int userID;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "user_foreign_key")
	private User user;

	public Lists() {
		super();
	}

	public Lists(int featureId, int movieID, boolean movieLike, boolean movieWatchList, int userID) {
		super();
		this.listID = featureId;
		this.movieID = movieID;
		this.movieLike = movieLike;
		this.movieWatchList = movieWatchList;
		this.userID = userID;
	}

	public int getFeatureId() {
		return listID;
	}

	public void setFeatureId(int featureId) {
		this.listID = featureId;
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
		return "Movie [featureId=" + listID + ", movieID=" + movieID + ", movieLike=" + movieLike
				+ ", movieWatchList=" + movieWatchList + ", userID=" + userID + "]";
	}
	
}
