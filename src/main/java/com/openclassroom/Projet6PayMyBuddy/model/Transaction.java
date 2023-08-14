package com.openclassroom.Projet6PayMyBuddy.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "transaction_id")
	private int idTransaction;
	
	

		
	
	@Column( name = "type_transaction")
	private String typeTransaction;
	
	@Column( name = "montant_demande")
	private float montantDemande;
	
	@Column( name = "montant_commision")
	private float montantCommision;

	@Column( name = "description")
	private String description;
	
	@ManyToOne( 
			cascade = CascadeType.ALL
			)
	@JoinColumn( name = "recepteur")
	private Utilisateur  destinataire;
	
	
	@ManyToOne( 
			cascade = CascadeType.ALL
			)
	@JoinColumn( name = "emmeteur")
	private Utilisateur emmeteur;
	
}
