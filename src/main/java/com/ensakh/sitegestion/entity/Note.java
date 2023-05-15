package com.ensakh.sitegestion.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="Note")
public class Note implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private float noteCc ;
	private float noteTp ;
	private float noteProjet ;
	private float noteResultat ;
	
	@OneToOne
	private Modalite modalite;
	
	
	public Note() {
		super();
	}

	public Note(float noteCc, float noteTp, float noteProjet, float noteResultat) {
		super();
		this.noteCc = noteCc;
		this.noteTp = noteTp;
		this.noteProjet = noteProjet;
		this.noteResultat = noteResultat;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getNoteCc() {
		return noteCc;
	}

	public void setNoteCc(float noteCc) {
		this.noteCc = noteCc;
	}

	public float getNoteTp() {
		return noteTp;
	}

	public void setNoteTp(float noteTp) {
		this.noteTp = noteTp;
	}

	public float getNoteProjet() {
		return noteProjet;
	}

	public void setNoteProjet(float noteProjet) {
		this.noteProjet = noteProjet;
	}

	public float getNoteResultat() {
		return noteResultat;
	}

	public void setNoteResultat(float noteResultat) {
		this.noteResultat = noteResultat;
	}
	

}
