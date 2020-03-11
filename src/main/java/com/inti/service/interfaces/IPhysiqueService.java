package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Physique;

public interface IPhysiqueService {
	List<Physique> findAll();

	Physique findOne(Long id);

	Physique save(Physique physique);

	void delete(Long id);

}
