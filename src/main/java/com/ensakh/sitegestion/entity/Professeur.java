package com.ensakh.sitegestion.entity;


import org.springframework.lang.NonNull;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name="Professeur")
public class Professeur implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name="code" )
    private  int code ;
    @Column(name="nom" )
    private String nom ;
    @Column(name="prenom")
    private String prenom ;
    @Column(name="specialite")
    private String specialite ;

	@OneToMany(mappedBy = "professeur")
	private Collection<Element> elements;

    @ManyToMany
    @JoinTable(name="Prof_Etud" , joinColumns = @JoinColumn(name = "Prof_id"),
            inverseJoinColumns = @JoinColumn(name="Etud_id"))
    private Collection<Etudiant> etudiants ;

    public Collection<Element> getElements() {
        return elements;
    }

    public void setElements(Collection<Element> elements) {
        this.elements = elements;
    }

    public Professeur() {
        super();
    }


    public Professeur(int code , String nom, String prenom, String specialite) {
        super();
        this.code=code ;
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //    public Long getId() {
//        return id;
//    }
    public int getCode() {
        return code;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getSpecialite() {
        return specialite;
    }


//    public void setId(Long id) {
//        this.id = id;
//    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}

