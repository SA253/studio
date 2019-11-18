package com.music.studio.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="artists")
public class Artist {

	@Id
	private String artistId;
	private String artistName;
	
	
	private List<Album> albums;
	
	public Artist() {
		
	}

	public String getArtistId() {
		return artistId;
	}

	public void setArtistId(String artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	

	

	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}

	public Artist(String artistId, String artistName, List<Album> albums) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
		this.albums = albums;
	}

	
}
