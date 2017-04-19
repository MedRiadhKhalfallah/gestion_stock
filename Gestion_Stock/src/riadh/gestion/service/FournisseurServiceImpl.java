package riadh.gestion.service;

import java.util.List;

import riadh.gestion.dao.FournisseurDAO;
import riadh.gestion.dao.FournisseurDAOImpl;
import riadh.gestion.dao.entity.Fournisseur;

public class FournisseurServiceImpl implements FournisseurService{
	
	FournisseurDAO dao = new FournisseurDAOImpl();


	@Override
	public void add(Fournisseur f) {
		dao.add(f);
	}

	@Override
	public Fournisseur edite(Fournisseur f) {
		return dao.edite(f);
	}

	@Override
	public void delete(long id) {
		dao.delete(id);
	}

	@Override
	public List<Fournisseur> finAll() {

		return dao.finAll();
	}

	@Override
	public Fournisseur finById(long id) {

		return dao.finById(id);
	}
	

}
