package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Produit;

public interface IProduitService {

	List<Produit> getPorduits();

	void addProduit(Produit produit);

	void updateProduit(Produit produit);

	void deleteProduit(String ref);

}
