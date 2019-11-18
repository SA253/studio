package com.music.studio.repo;

import java.util.List;

import com.music.studio.model.Artist;

public interface ArtistDal {

	Artist create(Artist artist);

	Boolean delete(Artist artist);

	List<Artist> findAll();

	Artist findById(String id);
}
