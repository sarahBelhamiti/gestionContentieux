package com.inti.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Tribunal;
import com.inti.repository.TribunalRepository;
import com.inti.service.interfaces.ITribunalService;


@Service
public class TribunalService implements ITribunalService{
	@Autowired
	TribunalRepository tribunalService;

	@Override
	public List<Tribunal> findAll() {
		return tribunalService.findAll();
	}

	@Override
	public Tribunal findOne(Long id) {
		return tribunalService.findOne(id);
	}

	@Override
	public Tribunal save(Tribunal tribunal) {

		return tribunalService.save(tribunal);
	}

	@Override
	public void delete(Long id) {
		tribunalService.delete(id);
	}

}