package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tache implements Serializable {

	private static final long serialVersionUID = -665240014627612267L;
	// declaration variable
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idTache; 
	@Temporal (value=TemporalType.DATE)
	private Date dateCreation; 
	private String titre; 
	private String descriptionTache; 
	private boolean statutAudience;
	@ManyToOne(fetch=FetchType.EAGER)
	private Utilisateur utilisateur;
	@ManyToOne(fetch=FetchType.EAGER)
	private Affaire affaire;
	@ManyToOne(fetch=FetchType.EAGER)
	private Tribunal tribunal;	
	@OneToMany (mappedBy="tache", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private Set<Phase> phases= new HashSet<>();
	// constructeur 
	public Tache() {
	}
	// getteur et setteur 
	public Long getIdTache() {
		return idTache;
	}
	public void setIdTache(Long idTache) {
		this.idTache = idTache;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescriptionTache() {
		return descriptionTache;
	}
	public void setDescriptionTache(String descriptionTache) {
		this.descriptionTache = descriptionTache;
	}
	public boolean isStatutAudience() {
		return statutAudience;
	}
	public void setStatutAudience(boolean statutAudience) {
		this.statutAudience = statutAudience;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Affaire getAffaire() {
		return affaire;
	}
	public void setAffaire(Affaire affaire) {
		this.affaire = affaire;
	}
	public Tribunal getTribunal() {
		return tribunal;
	}
	public void setTribunal(Tribunal tribunal) {
		this.tribunal = tribunal;
	}
	public Set<Phase> getPhases() {
		return phases;
	}
	public void setPhases(Set<Phase> phases) {
		this.phases = phases;
	}
	
	
	

}
