package riadh.gestion.util;

import java.util.List;

import org.hibernate.Session;

import riadh.gestion.dao.ProduitDAO;
import riadh.gestion.dao.entity.Produit;
import riadh.gestion.dao.entity.Utilisateur;
import riadh.gestion.dao.ProduitDAOImpl;
import riadh.gestion.dao.UtilisateurDAO;
import riadh.gestion.dao.UtilisateurDAOImpl;
public class Test {
	
 static Session sesion = HibernateUtil.openSession();

	public static void main(String[] args) {
		
		//sesion.createQuery("select o From Produit o").list();
	//List<Produit> result = (List<Produit>) sesion.createQuery("from Produit").list();

		/*ProduitDAO dao= new ProduitDAOImpl();
			Produit p= new Produit();
			p.setNom_produit("da3bes");
			p.setQuantite_produit(100);
			dao.add(p);*/
		UtilisateurDAO dao =new UtilisateurDAOImpl();
		Utilisateur u= new Utilisateur();
		u.setNom_utilisateur("riadh util");
		u.setAdresse_utilisateur("adresss");
		dao.add(u);
		
	}

}
