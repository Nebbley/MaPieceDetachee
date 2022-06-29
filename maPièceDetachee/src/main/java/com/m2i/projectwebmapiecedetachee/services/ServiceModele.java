package com.m2i.projectwebmapiecedetachee.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.m2i.projectwebmapiecedetachee.modeles.Marques;
import com.m2i.projectwebmapiecedetachee.modeles.Modeles;

@Service
public class ServiceModele {

	@Autowired
	private SessionFactory sessionfactory;
	
	@Transactional
	public List<Modeles> getModeles(){
		
		Session session = sessionfactory.getCurrentSession();
		List<Modeles> lolita = session.createQuery("from Modeles", Modeles.class).getResultList();
		return lolita;
	}
	
	@Transactional
	public List<String> getModelesNames(){
		
		Session session = sessionfactory.getCurrentSession();
		List<String> lolita = session.createQuery("select nom from Modeles").getResultList();
		return lolita;
	}
}
