package riadh.gestion.dao;

import java.util.List;

import org.hibernate.Session;

import riadh.gestion.dao.ProduitDAO;
import riadh.gestion.dao.entity.Produit;
import riadh.gestion.util.HibernateUtil;

public class ProduitDAOImpl implements ProduitDAO {

	 static Session sesion = HibernateUtil.openSession();

	@Override
	public void add(Produit p) {
		sesion.beginTransaction();
		sesion.save(p);
		sesion.getTransaction().commit();
	
	}

	@Override
	public Produit edite(Produit p) {
		sesion.beginTransaction();
		Produit p1= (Produit)sesion.merge(p);
		sesion.getTransaction().commit();
		return p1;
	}

	@Override
	public void delete(long id) {
		sesion.beginTransaction();
		Produit p =finById(id);
		sesion.delete(p);
		sesion.getTransaction().commit();
		
		
	}

	@Override
	public List<Produit> finAll() {
		return sesion.createQuery("select o from Produit o").list();
	}

	@Override
	public Produit finById(long id) {
		
		
		return (Produit)sesion.get(Produit.class, id);
	}

	
	
	
}
