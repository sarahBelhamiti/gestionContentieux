package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Moral;

public interface IMoralService {
	List<Moral> findAll();

	Moral findOne(Long id);

	Moral save(Moral moral);

	void delete(Long id);

}
