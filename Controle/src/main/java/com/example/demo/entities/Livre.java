package com.example.demo.entities;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Livre")
public class Livre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 50)
	private String titre;
	
	@Column(nullable = false, updatable = false)
	private String maisonedit;
	
	@Column(nullable = false)
	private Date date;
	
	@Column(nullable = false)
	private String auteur;
	
	@Column(nullable = false)
	private int nbrpage;
	
	@Column(unique=true, nullable = false, updatable = false)
	private String isbn;
	
	@Column(nullable = false)
	private Date datecons;
	
	@Column(nullable = false)
	private boolean disponible;
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getMaisonedit() {
		return maisonedit;
	}

	public void setMaisonedit(String maisonedit) {
		this.maisonedit = maisonedit;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbrpage() {
		return nbrpage;
	}

	public void setNbrpage(int nbrpage) {
		this.nbrpage = nbrpage;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Date getDatecons() {
		return datecons;
	}

	public void setDatecons(Date datecons) {
		this.datecons = datecons;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


	

}
