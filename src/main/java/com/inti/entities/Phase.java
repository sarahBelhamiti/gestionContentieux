package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Phase implements Serializable {

	private static final long serialVersionUID = 4773321157513894069L;
	// declaration variable
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idPhase; 
	private String nomPhase; 
	@Temporal (value=TemporalType.DATE)
	private Date dateDebut; 
	@Temporal (value=TemporalType.DATE)
	private Date dateFin;
	@ManyToOne(fetch=FetchType.EAGER)
	private Tache tache;
	// constructeur
	public Phase() {
	}
	// getteur et setteur 
	public Long getIdPhase() {
		return idPhase;
	}
	public void setIdPhase(Long idPhase) {
		this.idPhase = idPhase;
	}
	public String getNomPhase() {
		return nomPhase;
	}
	public void setNomPhase(String nomPhase) {
		this.nomPhase = nomPhase;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Tache getTache() {
		return tache;
	}
	public void setTache(Tache tache) {
		this.tache = tache;
	}
	
	

}
