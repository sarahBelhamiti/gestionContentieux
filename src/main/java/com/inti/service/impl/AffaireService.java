package com.inti.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Affaire;
import com.inti.repository.AffaireRepository;
import com.inti.service.interfaces.IAffaireService;

@Service
public class AffaireService implements IAffaireService {
	@Autowired
	AffaireRepository affaireRepository;

	@Override
	public List<Affaire> findAll() {
		return affaireRepository.findAll();
	}

	@Override
	public Affaire findOne(Long id) {
		return affaireRepository.findOne(id);
	}

	@Override
	public Affaire save(Affaire affaire) {

		return affaireRepository.save(affaire);
	}

	@Override
	public void delete(Long id) {
		affaireRepository.delete(id);

	}



}
