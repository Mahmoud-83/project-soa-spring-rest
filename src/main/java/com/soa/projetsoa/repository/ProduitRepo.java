package com.soa.projetsoa.repository;

import org.springframework.data.repository.CrudRepository;

import com.soa.projetsoa.model.Produit;

public interface ProduitRepo extends CrudRepository<Produit , Integer> {

}
