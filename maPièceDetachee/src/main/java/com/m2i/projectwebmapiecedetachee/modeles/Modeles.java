package com.m2i.projectwebmapiecedetachee.modeles;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Modeles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String nom;
	
	@ManyToOne //(cascade = CascadeType.ALL)
	@JoinColumn (name="marque")
	private Marques marque;
	
	/*@OneToMany (mappedBy="modele")
	private List<Pieces> pieces;*/
	
	public Modeles(String nom, Marques marque) {
		this.nom=nom;
		this.marque=marque;
	}
	
	public Modeles() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Marques getMarque() {
		return marque;
	}

	public void setMarque(Marques marque) {
		this.marque = marque;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	/*public List<Pieces> getPieces() {
		return pieces;
	}

	public void setPieces(List<Pieces> pieces) {
		this.pieces = pieces;
	}*/

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	@OneToOne (mappedBy ="modele") 
	private Voiture voiture;
	
}
