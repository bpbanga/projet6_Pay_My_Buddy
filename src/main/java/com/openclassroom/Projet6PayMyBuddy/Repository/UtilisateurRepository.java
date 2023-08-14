package com.openclassroom.Projet6PayMyBuddy.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassroom.Projet6PayMyBuddy.model.Utilisateur;


@Repository
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Integer> {

}
