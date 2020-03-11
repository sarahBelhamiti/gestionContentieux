package com.inti.entities;

import java.io.Serializable;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


public class Tiers implements Serializable {

	private static final long serialVersionUID = -665240014627612267L;
	// declaration variable
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idTiers; 
	private String adresseTiers; 
	private String telTiers; 
	@ManyToOne(fetch=FetchType.EAGER)
	private Utilisateur utilisateur;
	// constructeur
	public Tiers() {
	}
	public Tiers(String adresseTiers, String telTiers, Utilisateur utilisateur) {
		this.adresseTiers = adresseTiers;
		this.telTiers = telTiers;
		this.utilisateur = utilisateur;
	}
	// getteur et setteur
	public Long getIdTiers() {
		return idTiers;
	}
	public void setIdTiers(Long idTiers) {
		this.idTiers = idTiers;
	}
	public String getAdresseTiers() {
		return adresseTiers;
	}
	public void setAdresseTiers(String adresseTiers) {
		this.adresseTiers = adresseTiers;
	}
	public String getTelTiers() {
		return telTiers;
	}
	public void setTelTiers(String telTiers) {
		this.telTiers = telTiers;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
	
	

}
