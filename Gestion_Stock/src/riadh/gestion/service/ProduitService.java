package riadh.gestion.service;

import java.util.List;

import riadh.gestion.dao.entity.Produit;

public interface ProduitService {

	public void add(Produit p);
	public Produit edite(Produit p);
	public void delete(long id);
	public List<Produit> finAll();
	public Produit finById(long id);
}
