package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Affaire;
import com.inti.entities.Utilisateur;

@Repository
public interface AffaireRepository extends JpaRepository<Affaire, Long>{
	Affaire findOneByReference(String reference);
}
