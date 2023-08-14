package com.openclassroom.Projet6PayMyBuddy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.openclassroom.Projet6PayMyBuddy.Service.UtilisateurService;
import com.openclassroom.Projet6PayMyBuddy.model.Utilisateur;

@SpringBootApplication
public class Projet6PayMyBuddyApplication implements CommandLineRunner {

	
	@Autowired
	private UtilisateurService utilisateurService;
	
	public static void main(String[] args) {
		SpringApplication.run(Projet6PayMyBuddyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Iterable<Utilisateur> utilisateurs = utilisateurService.getUtilisateurs();
		utilisateurs.forEach(utilisateur -> System.out.println(utilisateur));
		// TODO Auto-generated method stub
		
	}

}
