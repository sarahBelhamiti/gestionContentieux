package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;
	// declaration variable
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idRole; 
	private String libelle;
	// constructeur 
	public Role() {
	}
	public Role(String libelle) {
		this.libelle = libelle;
	}
	// getteur et setteur 
	public Long getIdRole() {
		return idRole;
	}
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
		

}