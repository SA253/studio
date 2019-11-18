package com.music.studio.repo;

import java.util.List;

import com.music.studio.model.Studio;

public interface StudioDal {
	Studio create(Studio artist);

	Boolean delete(Studio artist);

	List<Studio> findAll();

	Studio findById(String id);
}
