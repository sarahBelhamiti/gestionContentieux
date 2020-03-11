package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Tiers;
@Repository
public interface TiersRepository extends JpaRepository<Tiers, Long>{

}
