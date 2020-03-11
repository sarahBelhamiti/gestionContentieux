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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 8761599320138088406L;
	// declaration variable
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idUtilisateur; 
	private String email;
	private String nomUtilisateur; 
	private String prenomUtilisateur; 
	private String username; 
	private String password; 
	@ManyToMany (fetch=FetchType.EAGER)
	@JoinTable(name="Profil", joinColumns=@JoinColumn(name="id_user", referencedColumnName="idUtilisateur"), inverseJoinColumns = @JoinColumn(name="id_role", referencedColumnName="idRole"))
	private Set<Role> roles=new HashSet<>(); 
	@OneToMany (mappedBy="utilisateur", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private Set<Tache> taches= new HashSet<>();
	@OneToMany (mappedBy="utilisateur", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private Set<Tiers> tiersS= new HashSet<>();
	// constructeur
	public Utilisateur() {
	}
	// getteur et setteur 
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}
	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public Set<Tache> getTaches() {
		return taches;
	}
	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}
	public Set<Tiers> getTiersS() {
		return tiersS;
	}
	public void setTiersS(Set<Tiers> tiersS) {
		this.tiersS = tiersS;
	}
	
	


}
