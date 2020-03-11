package com.inti.entities;

import java.io.Serializable;

public class Moral extends Tiers implements Serializable {

	private static final long serialVersionUID = 4195153743388399510L;
	// declaration variable
	private String siret; 
	// constructeur
	public Moral() {
		super();
	}
	public Moral(String siret) {
		super();
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
