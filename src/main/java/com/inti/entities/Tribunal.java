package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Tribunal implements Serializable {

	private static final long serialVersionUID = 7372915365427784724L;
	// declaration variable
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idTribunal; 
	private String adresseTribunal; 
	private double fax; 
	private double telTribunal; 
	private String region; 
	@OneToMany (mappedBy="tribunal", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private Set<Tache> taches= new HashSet<>();
	// constructeur
	public Tribunal() {
	}
	// getteur et setteur 
	public Long getIdTribunal() {
		return idTribunal;
	}
	public void setIdTribunal(Long idTribunal) {
		this.idTribunal = idTribunal;
	}
	
	public String getAdresseTribunal() {
		return adresseTribunal;
	}
	public void setAdresseTribunal(String adresseTribunal) {
		this.adresseTribunal = adresseTribunal;
	}
	public double getFax() {
		return fax;
	}
	public void setFax(double fax) {
		this.fax = fax;
	}
	
	public double getTelTribunal() {
		return telTribunal;
	}
	public void setTelTribunal(double telTribunal) {
		this.telTribunal = telTribunal;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Set<Tache> getTaches() {
		return taches;
	}
	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}
	

}
