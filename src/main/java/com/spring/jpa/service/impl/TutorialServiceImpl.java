package com.spring.jpa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.jpa.model.Tutorial;
import com.spring.jpa.repository.TutorialRepository;
import com.spring.jpa.service.TutorialService;

@Service
@Transactional
public class TutorialServiceImpl implements TutorialService {

	@Autowired
	TutorialRepository tutorialRepository;

	@Override
	public List<Tutorial> findAll() {
		// TODO Auto-generated method stub
		return tutorialRepository.findAll();
	}

	@Override
	public List<Tutorial> findByTitleContaining(String title) {
		// TODO Auto-generated method stub
		return tutorialRepository.findByTitleContaining(title);
	}

	@Override
	public Optional<Tutorial> findById(long id) {
		// TODO Auto-generated method stub
		return tutorialRepository.findById(id);
	}

	@Override
	public Tutorial save(Tutorial tutorial) {
		// TODO Auto-generated method stub
		return tutorialRepository.save(tutorial);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		tutorialRepository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		tutorialRepository.deleteAll();
	}

	@Override
	public List<Tutorial> findByPublished(boolean b) {
		// TODO Auto-generated method stub
		return tutorialRepository.findByPublished(b);
	}

}
