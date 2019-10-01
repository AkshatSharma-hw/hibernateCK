package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Chetna Khapre
 * @version 1.0
 * @creation date 27/09/2019 4:40pm
 *@modification time 27/09/2019 4:40pm
 */

@Entity

public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int songId;
	private String songName;
	
	@ManyToOne
	@JoinColumn(name = "mid")
	private Movie movie;
	
	
	
	public Song() {
		// TODO Auto-generated constructor stub
	}

	public Song(int songId, String songName) {
		super();
		this.songId = songId;
		this.songName = songName;
	}

	
	public Song(String songName) {
		super();
		this.songName = songName;
	}

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	

	@Override
	public String toString() {
		return "Song [songId=" + songId + ", songName=" + songName + "]";
	}
	
	
}
