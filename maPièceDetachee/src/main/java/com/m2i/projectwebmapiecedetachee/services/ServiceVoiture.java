package com.m2i.projectwebmapiecedetachee.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.m2i.projectwebmapiecedetachee.modeles.Marques;
import com.m2i.projectwebmapiecedetachee.modeles.Modeles;
import com.m2i.projectwebmapiecedetachee.modeles.Voiture;

@Service
public class ServiceVoiture {

	@Autowired
	private SessionFactory sessionfactory;
	@Autowired
	private ServiceModele modserv;
	
	@Transactional
	public Voiture addVoiture(String modele , String marque) {
		Session session =sessionfactory.getCurrentSession();
		List<Modeles> models = modserv.getModeles();
		Modeles usermodel=null;
			for (int i=0;i<models.size();i++) {
				if(models.get(i).getNom().equals(modele)) {
					usermodel = models.get(i);
				}
			}
		
		Voiture voiture = new Voiture();
		voiture.setModele(usermodel);
		session.saveOrUpdate(voiture);
		return voiture;
	}
}
