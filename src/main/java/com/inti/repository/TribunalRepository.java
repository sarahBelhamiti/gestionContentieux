package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Tribunal;

public interface TribunalRepository extends JpaRepository<Tribunal, Long>{
	Tribunal findOneByAdresse(String adresse);
}
