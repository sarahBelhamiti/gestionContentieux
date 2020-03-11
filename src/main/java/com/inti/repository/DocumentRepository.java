package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {
	Document findOneByName(String name);
}
