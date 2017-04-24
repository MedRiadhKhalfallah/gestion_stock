package riadh.gestion.dao;

import java.util.List;

import org.hibernate.Session;

import riadh.gestion.dao.FournisseurDAO;
import riadh.gestion.dao.entity.Fournisseur;
import riadh.gestion.util.HibernateUtil;

public class FournisseurDAOImpl implements FournisseurDAO {
	
	 static Session sesion = HibernateUtil.openSession();





	@Override
	public void delete(int id) {
		
		sesion.beginTransaction();
		Fournisseur f =finById(id);
		sesion.delete(f);
		sesion.getTransaction().commit();
		
	}

	@Override
	public List<Fournisseur> finAll() {

		return sesion.createQuery("select o from Fournisseur o").list();

	}



	@Override
	public void add(Fournisseur f) {
		sesion.beginTransaction();
		sesion.save(f);
		sesion.getTransaction().commit();
		
	}

	@Override
	public Fournisseur edite(Fournisseur f) {
		sesion.beginTransaction();
		Fournisseur f1= (Fournisseur)sesion.merge(f);
		sesion.getTransaction().commit();
		return f1;
	}

	@Override
	public Fournisseur finById(int id) {
		return (Fournisseur)sesion.get(Fournisseur.class, id);

	}

}
