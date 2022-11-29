package com.soa.projetsoa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soa.projetsoa.model.Produit;
import com.soa.projetsoa.repository.ProduitRepo;

@Service
public class ProduitService {
	
	@Autowired
	ProduitRepo prodrepo;
	
	
	public List<Produit> getAllproduit(){
		
		List<Produit> prod = new ArrayList<Produit>();
		prodrepo.findAll().forEach(prod1 -> prod.add(prod1));
		return prod;
		
	}
	
	
	public Produit getProduitbyId(int id) {
		return prodrepo.findById(id).get();
		
	}
	
	public void save(Produit p) {
		prodrepo.save(p);
		
	}
	
	public void delete(int id) {
		prodrepo.deleteById(id);
	}
	
	public void update(Produit p) {
		prodrepo.save(p);
	}
	

}
