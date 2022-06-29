package com.m2i.projectwebmapiecedetachee.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m2i.projectwebmapiecedetachee.modeles.Marques;
import com.m2i.projectwebmapiecedetachee.modeles.Modeles;
import com.m2i.projectwebmapiecedetachee.modeles.Pieces;
import com.m2i.projectwebmapiecedetachee.modeles.Users;
import com.m2i.projectwebmapiecedetachee.services.ServiceMarque;
import com.m2i.projectwebmapiecedetachee.services.ServiceModele;
import com.m2i.projectwebmapiecedetachee.services.ServiceVoiture;
import com.m2i.projectwebmapiecedetachee.services.UserService;

@Controller
public class JavaController {


	@Autowired
	private ServiceMarque marques;
	@Autowired
	private UserService userservice;
	@Autowired 
	private ServiceModele modelservice;
	@Autowired
	private ServiceVoiture carserv;

	/*public List<Pieces> getPieces(Modeles a){

		List<Pieces> partsList = new ArrayList<Pieces>();
		partsList.addAll(a.getPieces());
		return partsList;
	}*/

	@RequestMapping ("/")
	public String affichageAcceuil() {




		return "Acceuil";

	}
	@RequestMapping ("/Acceuil")
	public String affichageAcceuil1( HttpServletRequest request,@ModelAttribute ("user") Users user) {
		List<String> users = userservice.getUserMails();

		if (!users.contains(user.getMail())){
			
			user.setVoiture(carserv.addVoiture(request.getParameter("model"), request.getParameter("brand")));
			userservice.adduser(user);}
		else {System.out.println("mail already registered");}
		return "Acceuil";
	}

	@RequestMapping ("/Form1")
	public String affichageFform(Model m,HttpServletRequest request) {
		List<Marques> lolita = marques.getMarques();
		Users user= new Users();
		m.addAttribute("user", user);
		List<Modeles> modelslist = modelservice.getModeles();
		request.setAttribute("modelliste", modelslist);
		request.setAttribute("marqueslistes", lolita) ;
		return "Form1";
	}
}
