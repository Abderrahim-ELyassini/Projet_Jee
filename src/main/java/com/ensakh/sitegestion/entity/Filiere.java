package com.ensakh.sitegestion.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name="Nom" , nullable = false)
    private String nom;

	@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
	private Collection<Module> modules;
	@OneToMany
	private Collection<Etudiant> etudiants;

    public Collection<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Collection<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public Filiere() {
        super();
    }

    public Filiere(String nom) {
        super();
        this.nom=nom;
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
}
