package riadh.gestion.util;

import java.util.List;

import org.hibernate.Session;

import riadh.gestion.dao.FournisseurDAO;
import riadh.gestion.dao.FournisseurDAOImpl;
import riadh.gestion.dao.HistoriqueDAO;
import riadh.gestion.dao.HistoriqueDAOImpl;
import riadh.gestion.dao.ImageDAO;
import riadh.gestion.dao.ImageDAOImpl;
import riadh.gestion.dao.ProduitDAO;
import riadh.gestion.dao.entity.Fournisseur;
import riadh.gestion.dao.entity.Historique;
import riadh.gestion.dao.entity.Image;
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
		/*UtilisateurDAO dao =new UtilisateurDAOImpl();
		Utilisateur u= new Utilisateur();
		u.setNom_utilisateur("riadh util");
		u.setAdresse_utilisateur("adresss");
		dao.add(u);*/
		/*FournisseurDAO dao =new FournisseurDAOImpl();
		Fournisseur f= new Fournisseur();
		f.setNom_fournisseur("riadh fourn");
		f.setAdresse_fournisseur("adresse fourn");
		dao.add(f);*/
		/*HistoriqueDAO dao =new HistoriqueDAOImpl();
		Historique h= new Historique();
		h.setNom_produit_historique("ajout 7aja");
		h.setDate_historique("2012-2-15");
		dao.add(h);*/
		ImageDAO dao =new ImageDAOImpl();
		Image i= new Image();
		i.setLien_image("lhihlj");
		i.setId_produit(1);
		dao.add(i);
		
	}

}
