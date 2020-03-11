package com.inti.entities;

import java.io.Serializable;


public class Physique extends Tiers implements Serializable {

	private static final long serialVersionUID = -8567158932786928504L;
	// declaration variable
	private String cin; 
	private String nomPhysique; 
	private String prenomPhysique; 
	// constructeur
	public Physique() {
		super();
	}
	public Physique(String cin, String nomPhysique, String prenomPhysique) {
		super();
		this.cin = cin;
		this.nomPhysique = nomPhysique;
		this.prenomPhysique = prenomPhysique;
	}
	// getteur et setteur 
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNomPhysique() {
		return nomPhysique;
	}
	public void setNomPhysique(String nomPhysique) {
		this.nomPhysique = nomPhysique;
	}
	public String getPrenomPhysique() {
		return prenomPhysique;
	}
	public void setPrenomPhysique(String prenomPhysique) {
		this.prenomPhysique = prenomPhysique;
	}
	
	
	

}
