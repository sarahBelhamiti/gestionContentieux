package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Physique;
import com.inti.repository.PhysiqueRepository;
import com.inti.service.interfaces.IPhysiqueService;

@Service
public class PhysiqueService implements IPhysiqueService{
	@Autowired
	PhysiqueRepository physiqueRepository;

	@Override
	public List<Physique> findAll() {
		return physiqueRepository.findAll();
	}

	@Override
	public Physique findOne(Long id) {
		return physiqueRepository.findOne(id);
	}

	@Override
	public Physique save(Physique physique) {

		return physiqueRepository.save(physique);
	}

	@Override
	public void delete(Long id) {
		physiqueRepository.delete(id);
	}

}