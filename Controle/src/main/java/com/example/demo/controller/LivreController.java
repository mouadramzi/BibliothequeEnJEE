package com.example.demo.controller;

import java.util.*;

import org.hibernate.annotations.OrderBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Livre;
import com.example.demo.service.LivreService;

@RestController
public class LivreController {
	
	@Autowired
	private LivreService service;
	
	
	
	@GetMapping("/emsi_api/livres")
	public List<Livre> findAllLivres(){
		return service.getLivres();
	}
	
	@GetMapping("/emsi_api/livre/{id}")
	public Livre findLivreById(@PathVariable int id) {
		return service.getLivreById(id);
	}
	
	@PutMapping("/update")
	public Livre updateLivre(@RequestBody Livre livre) {
		return service.updateLivre(livre);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteLivre(@PathVariable int id) {
		return service.deleteLivre(id);
	}

}
