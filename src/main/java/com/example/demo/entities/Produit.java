package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produit {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	private long idProd;
	private String nom;
	private Double prixProd;
	private Date dateCreation;
	@ManyToOne
	private Categorie categorie;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Produit(String nom, Double prixProd, Date dateCreation) {
		super();
		this.nom = nom;
		this.prixProd = prixProd;
		this.dateCreation = dateCreation;
	}

	public long getIdProd() {
		return idProd;
	}
	public void setIdProd(long idProd) {
		this.idProd = idProd;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Double getPrixProd() {
		return prixProd;
	}
	public void setPrixProd(Double prixProd) {
		this.prixProd = prixProd;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Produit [idProd=" + idProd + ", nom=" + nom + ", prixProd=" + prixProd + ", dateCreation="
				+ dateCreation + "]";
	}
	
}
