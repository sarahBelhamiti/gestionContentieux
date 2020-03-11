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
	private String adresse; 
	private double fax; 
	private double tel; 
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getFax() {
		return fax;
	}
	public void setFax(double fax) {
		this.fax = fax;
	}
	public double getTel() {
		return tel;
	}
	public void setTel(double tel) {
		this.tel = tel;
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
