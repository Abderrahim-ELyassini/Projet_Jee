package com.ensakh.sitegestion.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;


@Entity
@Table(name ="Etudiants")
public class Etudiant implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	@Column(name="cne")
	private String cne ;
	@Column(name="nom")
	private String nom ;
	@Column(name="prenom")
	private String prenom ;
	@Column(name="note" )
	private float note ;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Filiere filiere ;

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	@ManyToMany(mappedBy = "etudiants")
	private Collection<Element> elements;

	public Collection<Element> getElements() {
		return elements;
	}

	public void setElements(Collection<Element> elements) {
		this.elements = elements;
	}

	@ManyToMany
	@JoinTable(name="Prof_Etud" , joinColumns = @JoinColumn(name = "Etud_id"),
			   inverseJoinColumns = @JoinColumn(name="Prof_id"))
	private Collection<Professeur> professeurs ;
	
	public Etudiant() {
		super();
	}
	public Etudiant(String cne ,String nom , String prenom , float note) {
		super();
		this.cne = cne ;
		this.nom=nom ;
		this.prenom=prenom ;
		this.note=note;
	}


	public String getCne() {
		return cne;
	}


	public void setCne(String cne) {
		this.cne = cne;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public float getNote() {
		return note;
	}


	public void setNote(float note) {
		this.note = note;
	}
	
	
}
