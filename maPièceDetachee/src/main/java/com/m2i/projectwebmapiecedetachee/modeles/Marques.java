package com.m2i.projectwebmapiecedetachee.modeles;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name ="marques")
public class Marques {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column(unique =true)
	private String nom;
	
	
	@OneToMany (mappedBy = "marque", fetch=FetchType.EAGER)
	private List<Modeles> modeles;
	
	public Marques() {
		
	}
	public Marques(String nom) {
		this.nom=nom;
	}
	
	public List<Modeles> getModeles() {
		return modeles;
	}

	public void setModeles(List<Modeles> modeles) {
		this.modeles = modeles;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String marque) {
		this.nom = marque;
	}


}
