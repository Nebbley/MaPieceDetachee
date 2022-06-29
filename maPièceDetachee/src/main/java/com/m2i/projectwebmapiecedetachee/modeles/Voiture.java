package com.m2i.projectwebmapiecedetachee.modeles;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.m2i.projectwebmapiecedetachee.doa.MarqueVoiture;
import com.m2i.projectwebmapiecedetachee.doa.ModeleVoiture;
import com.m2i.projectwebmapiecedetachee.doa.Piece;

@Entity
@Table
public class Voiture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column	
	private int id;
	
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn (name ="modele" )
	private Modeles modele;

	public Voiture(Modeles model) {
		this.modele=model;
	}
	
	public Voiture() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Modeles getModele() {
		return modele;
	}

	public void setModele(Modeles modele) {
		this.modele = modele;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	@OneToOne (mappedBy = "voiture")
	private Users user;
	

}
