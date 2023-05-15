package com.ensakh.sitegestion.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="Modalite")
public class Modalite implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private float cc ;
	private float tp ;
	private float projet ;

	
	public Modalite() {
		super();
	}
	public Modalite(float cc, float tp, float projet) {
		super();
	
		this.cc = cc;
		this.tp = tp;
		this.projet = projet;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public float getCc() {
		return cc;
	}
	public void setCc(float cc) {
		this.cc = cc;
	}
	public float getTp() {
		return tp;
	}
	public void setTp(float tp) {
		this.tp = tp;
	}
	public float getProjet() {
		return projet;
	}
	public void setProjet(float projet) {
		this.projet = projet;
	}
	
	
	

}
