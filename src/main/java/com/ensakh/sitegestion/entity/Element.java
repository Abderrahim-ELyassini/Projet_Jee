package com.ensakh.sitegestion.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name="element")
public class Element implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private String nom ;
	private int Coeff ;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Professeur professeur;

	@ManyToMany
	@JoinTable(name = "Etud_Elem" )
	private Collection<Etudiant> etudiants;

	@OneToOne
	private Note note ;

	public Professeur getProfesseur() {
		return professeur;
	}

	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}
	public Collection<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(Collection<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	public Element() {
		super();
	}
	public Element(String nom, int coeff) {
		super();
		this.nom = nom;
		Coeff = coeff;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCoeff() {
		return Coeff;
	}
	public void setCoeff(int coeff) {
		Coeff = coeff;
	}
	
	
}
