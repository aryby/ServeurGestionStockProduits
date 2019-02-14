package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;

@Service
public class ProduitMockServiceImpl implements IProduitService {

	List<Produit> produits;

	public ProduitMockServiceImpl() {
		produits = new ArrayList<Produit>();
		produits.add(new Produit("Livre", 50, 20));
		produits.add(new Produit("Cahier", 100, 2.50));
		produits.add(new Produit("Stylo", 30, 1.20));
	}

	@Override
	public List<Produit> getPorduits() {
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		produits.add(produit);
	}

	@Override
	public void updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
	}

	@Override
	public void deleteProduit(String ref) {
		System.out.println("delete fonction    "+ref);
		Produit produit = new Produit();
		produit.setRef(ref);
		
		produits.remove(produit);
	}

}
