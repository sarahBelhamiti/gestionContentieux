package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Physique;
@Repository
public interface PhysiqueRepository extends JpaRepository<Physique, Long>{

}
