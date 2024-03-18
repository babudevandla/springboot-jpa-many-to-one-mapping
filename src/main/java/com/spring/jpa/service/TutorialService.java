package com.spring.jpa.service;

import java.util.List;
import java.util.Optional;

import com.spring.jpa.model.Tutorial;

public interface TutorialService {

	List<Tutorial> findAll();

	List<Tutorial> findByTitleContaining(String title);

	Optional<Tutorial> findById(long id);

	Tutorial save(Tutorial tutorial);

	void deleteById(long id);

	void deleteAll();

	List<Tutorial> findByPublished(boolean b);


	

}
