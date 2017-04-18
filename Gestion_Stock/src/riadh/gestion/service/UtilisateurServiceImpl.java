package riadh.gestion.service;

import java.util.List;

import riadh.gestion.dao.UtilisateurDAO;
import riadh.gestion.dao.UtilisateurDAOImpl;
import riadh.gestion.dao.entity.Utilisateur;

public class UtilisateurServiceImpl implements UtilisateurService {
	
	UtilisateurDAO dao = new UtilisateurDAOImpl();


	@Override
	public void add(Utilisateur u) {
		dao.add(u);
		
	}

	@Override
	public Utilisateur edite(Utilisateur u) {
		
		return dao.edite(u);
	}

	@Override
	public void delete(long id) {

		dao.delete(id);
	}

	@Override
	public List<Utilisateur> finAll() {

		return dao.finAll();
	}

	@Override
	public Utilisateur finById(long id) {

		return dao.finById(id);
	}

}
