package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Document;
@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
	Document findOneByNomDocument(String name);
}
