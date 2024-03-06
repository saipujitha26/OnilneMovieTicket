package com.cg.movie.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="movie_id")
	private String id;
	
	@Column(name="movie_name")
	private String name;
	
	@Column(name="movie_releaseDate")
	private String releaseDate;
	
	@Column(name="movie_genre")
	private String genre;
	
	@Column(name="movie_length")
	private int length;
	
	@Column(name="movie_language")
	private int language;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getLanguage() {
		return language;
	}
	public void setLanguage(int language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", releaseDate=" + releaseDate + ", genre=" + genre + ", length="
				+ length + ", language=" + language + "]";
	}
	public Movie(String id, String name, String releaseDate, String genre, int length, int language) {
		super();
		this.id = id;
		this.name = name;
		this.releaseDate = releaseDate;
		this.genre = genre;
		this.length = length;
		this.language = language;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
