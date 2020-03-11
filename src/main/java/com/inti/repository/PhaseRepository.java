package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Phase;
import com.inti.entities.Role;

public interface PhaseRepository extends JpaRepository<Phase, Long>{

}
