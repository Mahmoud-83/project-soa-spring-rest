package com.soa.projetsoa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.soa.projetsoa.model.Produit;
import com.soa.projetsoa.service.ProduitService;

@RestController
@CrossOrigin(origins = "*")
public class ProduitController {
	
	@Autowired
	ProduitService prodservice;
	
	@GetMapping("/produit")
	private List<Produit> getAllProduit(){
		return prodservice.getAllproduit();
	}
	
	
	@GetMapping("/prduit/{produitid}")
	private Produit getProd(@PathVariable("produitid") int id) {
		return prodservice.getProduitbyId(id);
		
	}
	@DeleteMapping("/produit/{produitid}")
	private void deleteProd(@PathVariable("produitid") int id) {
		prodservice.delete(id);
	}
	
	@PostMapping("/produit")
	private int saveProd(@RequestBody Produit prod) {
		prodservice.save(prod);
		return prod.getId();
	}
	
	@PutMapping("/produit")
	private Produit update(@RequestBody Produit prod) {
		prodservice.update(prod);
		return prod;
	}
	
	
	

}
