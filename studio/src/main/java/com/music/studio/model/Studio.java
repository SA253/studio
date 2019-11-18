package com.music.studio.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="studios")
public class Studio {

	@Id
	private String id;
	
	@DBRef
	private List<Artist> artists;
	
	@DBRef
	private List<Album> albums;
	
	
	public Studio() {
		
	}


	public Studio(List<Artist> artists, List<Album> albums) {
		super();
		
		this.artists = artists;
		this.albums = albums;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public List<Artist> getArtists() {
		return artists;
	}


	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}


	public List<Album> getAlbums() {
		return albums;
	}


	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}
	
	
}
