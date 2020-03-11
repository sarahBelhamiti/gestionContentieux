package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Tache;

public interface TacheRepository extends JpaRepository<Tache, Long>{
	Tache findOneByTitre(String titre);
}
