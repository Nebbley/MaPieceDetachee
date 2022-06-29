package com.m2i.projectwebmapiecedetachee.services;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.m2i.projectwebmapiecedetachee.modeles.Marques;



@Service
public class ServiceMarque {

	@Autowired
	private SessionFactory sessionfactory;
	
	

	@Transactional
	public List<Marques> getMarques(){
		 
		Session Springsession = sessionfactory.getCurrentSession();
		
		
		List<Marques> lolita = Springsession.createQuery("from Marques", Marques.class).getResultList();
		
		return lolita;
	};
	

	
	public String addMarque() {
		
		return null;
	};
}
