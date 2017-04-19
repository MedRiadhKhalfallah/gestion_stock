package riadh.gestion.service;

import java.util.List;

import riadh.gestion.dao.entity.Fournisseur;

public interface FournisseurService {
	
	public void add(Fournisseur f);
	public Fournisseur edite(Fournisseur f);
	public void delete(long id);
	public List<Fournisseur> finAll();
	public Fournisseur finById(long id);

}