package com.music.studio.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="albums")
public class Album {

	@Id
	private String albumId;
	private String albumName;
	
	@DBRef
	private List<Track> tracks;
	
	public Album() {
		
	}

	public Album(String albumId, String albumName, List<Track> tracks) {
		super();
		this.albumId = albumId;
		this.albumName = albumName;
		this.tracks = tracks;
	}

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	
	
}
