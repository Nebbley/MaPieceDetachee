package com.m2i.projectwebmapiecedetachee.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.m2i.projectwebmapiecedetachee.modeles.Marques;
import com.m2i.projectwebmapiecedetachee.modeles.Users;

@Service
public class UserService {
	@Autowired
	private SessionFactory sessionfactory;


	@Transactional
	public void adduser(Users a) {
		
		
		Session Springsession = sessionfactory.getCurrentSession();
		Springsession.save(a);
		
			
	}
	@Transactional
	public List<String> getUserMails(){
		Session Springsession = sessionfactory.getCurrentSession();
		List<String> users =  Springsession.createQuery("select mail from Users").getResultList();
		return users;
	}
}
