package riadh.gestion.dao;

import java.util.List;

import org.hibernate.Session;

import riadh.gestion.dao.entity.Produit;
import riadh.gestion.dao.entity.Utilisateur;
import riadh.gestion.util.HibernateUtil;

public class UtilisateurDAOImpl implements UtilisateurDAO {
	
	 static Session sesion = HibernateUtil.openSession();


	@Override
	public void add(Utilisateur u) {
		
		sesion.beginTransaction();
		sesion.save(u);
		sesion.getTransaction().commit();
		
	}

	@Override
	public Utilisateur edite(Utilisateur u) {

		sesion.beginTransaction();
		Utilisateur u1= (Utilisateur)sesion.merge(u);
		sesion.getTransaction().commit();
		return u1;
	}

	@Override
	public void delete(long id) {

		sesion.beginTransaction();
		Utilisateur u =finById(id);
		sesion.delete(u);
		sesion.getTransaction().commit();
		
	}

	@Override
	public List<Utilisateur> finAll() {

		return sesion.createQuery("select o from Utilisateur o").list();

	}

	@Override
	public Utilisateur finById(long id) {

		return (Utilisateur)sesion.get(Utilisateur.class, id);

	}

	
}
