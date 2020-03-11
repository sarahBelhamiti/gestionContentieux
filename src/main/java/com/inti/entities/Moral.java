package com.inti.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("moral") 
public class Moral extends Tiers implements Serializable {

	private static final long serialVersionUID = 4195153743388399510L;
	// declaration variable
	private String siret; 
	// constructeur
	public Moral() {
		super();
	}
	public Moral(String adresseTiers, String telTiers, Utilisateur utilisateur,String siret) {
		super(adresseTiers, telTiers, utilisateur);
		this.siret = siret;
	}
	// getteur et setteur 
	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}
	
	

}
