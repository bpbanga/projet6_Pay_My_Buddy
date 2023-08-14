package com.openclassroom.Projet6PayMyBuddy.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassroom.Projet6PayMyBuddy.Repository.UtilisateurRepository;
import com.openclassroom.Projet6PayMyBuddy.model.Utilisateur;

@Service
public class UtilisateurService {
	
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	public Iterable<Utilisateur> getUtilisateurs(){
		return utilisateurRepository.findAll();
	}
	

}
