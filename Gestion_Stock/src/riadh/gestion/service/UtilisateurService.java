package riadh.gestion.service;

import java.util.List;

import riadh.gestion.dao.entity.Utilisateur;

public interface UtilisateurService {
	
	public void add(Utilisateur u);
	public Utilisateur edite(Utilisateur u);
	public void delete(long id);
	public List<Utilisateur> finAll();
	public Utilisateur finById(long id);

}
