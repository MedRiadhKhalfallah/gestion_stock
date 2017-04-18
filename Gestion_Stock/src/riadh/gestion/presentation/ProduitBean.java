package riadh.gestion.presentation;

 import javax.faces.event.ActionEvent;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;


@ManagedBean
@RequestScoped
public class ProduitBean {
	
	private String nom_produit;
	private int quantite_produit;
	private String nom_fournisseur_produit;
	private int seuil_min_produit;
	private int seuil_max_produit;
	private String description_produit;
	

	
	
	public String getNom_produit() {
		return nom_produit;
	}




	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}




	public int getQuantite_produit() {
		return quantite_produit;
	}




	public void setQuantite_produit(int quantite_produit) {
		this.quantite_produit = quantite_produit;
	}




	public String getNom_fournisseur_produit() {
		return nom_fournisseur_produit;
	}




	public void setNom_fournisseur_produit(String nom_fournisseur_produit) {
		this.nom_fournisseur_produit = nom_fournisseur_produit;
	}




	public int getSeuil_min_produit() {
		return seuil_min_produit;
	}




	public void setSeuil_min_produit(int seuil_min_produit) {
		this.seuil_min_produit = seuil_min_produit;
	}




	public int getSeuil_max_produit() {
		return seuil_max_produit;
	}




	public void setSeuil_max_produit(int seuil_max_produit) {
		this.seuil_max_produit = seuil_max_produit;
	}




	public String getDescription_produit() {
		return description_produit;
	}




	public void setDescription_produit(String description_produit) {
		this.description_produit = description_produit;
	}




	public void saveadd(ActionEvent e)
	{
		System.out.println(nom_produit);
		System.out.println(quantite_produit);
		
	}
	
	public String utilisateur_page(ActionEvent e)
	{
		
		
		return "utilisateur";	
	}
	
	

}
