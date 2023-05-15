package com.ensakh.sitegestion.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name="Module")
public class Module implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long code;
	@Column(name="nom" )
	private String nom ;
	@Column(name="Semester" , length = 2)
	private String semester;

	@OneToMany
	private Collection<Element> elements ;

	public Collection<Element> getElements() {
		return elements;
	}

	public void setElements(Collection<Element> elements) {
		this.elements = elements;
	}

	public Module() {
		super();
	}
	public Module(String nom , String semester) {
		super();
		this.semester = semester;
		this.nom = nom;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
}
