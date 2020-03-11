package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Moral;
@Repository
public interface MoralRepository extends JpaRepository<Moral, Long>{

}
