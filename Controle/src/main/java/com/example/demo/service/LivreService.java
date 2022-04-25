package com.example.demo.service;

import com.example.demo.entities.Livre;
import com.example.demo.repos.LivreRepository;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

import java.util.*;

import org.hibernate.annotations.OrderBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivreService {

	@Autowired
	private LivreRepository repository;
	
	
	@OrderBy(clause = "titre ASC")
	public List<Livre> getLivres(){
		return repository.findAll();
	}
	
	public Livre getLivreById(int id){
		return repository.findById(id).orElse(null);
	}
	
	public String deleteLivre(int id) {
		repository.deleteById(id);
		return "Livre removed !! "+id;
	}
	
	public Livre updateLivre(Livre livre) {
		
		Livre existingLivre=repository.findById(livre.getId()).orElse(null);
		existingLivre.setTitre(livre.getTitre());
		existingLivre.setDate(livre.getDate());
		existingLivre.setAuteur(livre.getAuteur());
		existingLivre.setNbrpage(livre.getNbrpage());
		existingLivre.setIsbn(livre.getIsbn());
		existingLivre.setDatecons(livre.getDatecons());
		existingLivre.setDisponible(livre.isDisponible());
		
		return repository.save(existingLivre);
	}
}
