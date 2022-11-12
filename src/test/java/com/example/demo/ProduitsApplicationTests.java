package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Produit;
import com.example.demo.repositories.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	@Test
	public void testCreateProduit() {
	Produit prod = new Produit("PC Dell",2200.500,new Date());
	produitRepository.save(prod);
	}
	@Test
	public void testFindById () {
		Produit p=produitRepository.findById(1L).get();
		System.out.println(p);
	}
	@Test
	public void testUpdateProduit() {
		Produit p=produitRepository.findById(1L).get();
		p.setPrixProd(1500.0);
		produitRepository.save(p);
	}
	@Test
	public void testDeleteProduit()
	{
	produitRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousProduits()
	{
	List<Produit> prods = produitRepository.findAll();
	for (Produit p : prods)
	{
	System.out.println(p);
	}
	}
	 @Test
	 public void testFindByNomProd()
	 {
	 List<Produit> prods = produitRepository.findByNom("PC Dell");
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void testFindByNomProduitContains ()
	 {
	 List<Produit> prods=produitRepository.findByNomContains("PC");
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 } }
	 
	 @Test
	 public void testfindByNomPrix()
	 {
	 List<Produit> prods = produitRepository.findByNomPrix("PC ", 1000.0);
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 @Test
	 public void testfindByCategorie()
	 {
	 Categorie cat = new Categorie();
	 cat.setIdCat(1L);
	 List<Produit> prods = produitRepository.findByCategorie(cat);
	 for (Produit p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void testfindByCategorieId() {
		 List<Produit> prods = produitRepository.findByCategorieIdCat(1L);
		 for (Produit p : prods)
		 {
		 System.out.println(p);
		 }
	 }

}
