package com.m2i.projectwebmapiecedetachee.modeles;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Voiture {
	
	@Column (name = "Modele")
	private ModeleVoiture modele;
	@Column (name = "Marque")
	private MarqueVoiture marque;
	@Column (name = "Plaque Im")
	private String im;
	
	@Column (name = "pieces")
	private List<Piece> piece;
	
	public Voiture() {
		
	}
	
	public Voiture(ModeleVoiture modele, MarqueVoiture marque, String im, List<Piece> piece) {
		super();
		this.modele = modele;
		this.marque = marque;
		this.im = im;
		this.piece = piece;
	}
	public ModeleVoiture getModele() {
		return modele;
	}
	public void setModele(ModeleVoiture modele) {
		this.modele = modele;
	}
	public MarqueVoiture getMarque() {
		return marque;
	}
	public void setMarque(MarqueVoiture marque) {
		this.marque = marque;
	}
	public String getIm() {
		return im;
	}
	public void setIm(String im) {
		this.im = im;
	}
	public List<Piece> getPiece() {
		return piece;
	}
	public void setPiece(List<Piece> piece) {
		this.piece = piece;
	}
	

}
