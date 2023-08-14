package com.openclassroom.Projet6PayMyBuddy.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "utilisateur")
public class Utilisateur {

		
		@Id
		@Column( name = "utilisateur_id" )
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int idUtilisateur;
			
		@Column( name = "solde_commpte")
		private float soldeCompte;
			
		@Column( name = "rib")
		private String rib;
			
		@Column( name = "email")
		private String email;
		
		@Column( name = "password")
		private String password;
		
		/*
		 * @ManyToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
		 * CascadeType.MERGE } )
		 * 
		 * @JoinTable( name = "ami", joinColumns = @JoinColumn(name = "utilisateur_id"),
		 * inverseJoinColumns = @JoinColumn (name = "utilisateur_id") ) private
		 * List<Utilisateur> amis = new ArrayList<>();
		 */
		@JdbcTypeCode(SqlTypes.JSON)
		 @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
		    @JoinTable(
		            name = "ami",
		            joinColumns = @JoinColumn(
		                    name = "id_emetteur", referencedColumnName = "id_utilisateur"),
		            inverseJoinColumns = @JoinColumn(
		                    name = "id_recepteur", referencedColumnName = "id_utilisateur"))
		    private List<Utilisateur> amis = new ArrayList<>();
		
		@OneToMany(
				mappedBy ="Utilisateur",
				cascade =CascadeType.ALL,
				orphanRemoval = true)
		List<Transaction> emetteurs = new ArrayList<>();
		
		@OneToMany(
				mappedBy ="Utilisateur",
				cascade =CascadeType.ALL,
				orphanRemoval = true)
	     List<Transaction> recepteurs = new ArrayList<>();


	
	
	}
