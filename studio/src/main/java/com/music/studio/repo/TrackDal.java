package com.music.studio.repo;

import java.util.List;

import com.music.studio.model.Track;

public interface TrackDal {
	Track create(Track track);

	Boolean delete(Track track);

	List<Track> findAll();

	Track findById(String id);
}
