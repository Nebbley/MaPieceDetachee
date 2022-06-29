package com.m2i.projectwebmapiecedetachee.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m2i.projectwebmapiecedetachee.modeles.Modeles;
import com.m2i.projectwebmapiecedetachee.modeles.Users;
import com.m2i.projectwebmapiecedetachee.services.ServiceModele;



@RestController
@RequestMapping("api")
public class PieceDetacheeWebService {

	@Autowired
	private ServiceModele modserv;
	
	@GetMapping("/")
	public List<Modeles> heho() {
		
		List<Modeles> liste_des_modeles = modserv.getModeles();
		for (int i =0;i<liste_des_modeles.size();i++) {
			liste_des_modeles.get(i).setMarque(null);
			liste_des_modeles.get(i).setVoiture(null);
		}
		return liste_des_modeles;
	}	
}
