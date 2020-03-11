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
public class Affaire implements Serializable {

	private static final long serialVersionUID = -783234465294047048L;
	// declaration variable
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idAffaire; 
	private String reference;
	private String titre;
	private String descriptionAffaire;
	private int statut;
	@OneToMany (mappedBy="affaire", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private Set<Tache> taches= new HashSet<>();
	@OneToMany (mappedBy="affaire", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private Set<Document> documents= new HashSet<>();
	// constructeur
	public Affaire() {
	}
	// getteur et setteur 
	public Long getIdAffaire() {
		return idAffaire;
	}
	public void setIdAffaire(Long idAffaire) {
		this.idAffaire = idAffaire;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescriptionAffaire() {
		return descriptionAffaire;
	}
	public void setDescriptionAffaire(String descriptionAffaire) {
		this.descriptionAffaire = descriptionAffaire;
	}
	public int getStatut() {
		return statut;
	}
	public void setStatut(int statut) {
		this.statut = statut;
	}
	public Set<Tache> getTaches() {
		return taches;
	}
	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}
	public Set<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}
	
	

}
