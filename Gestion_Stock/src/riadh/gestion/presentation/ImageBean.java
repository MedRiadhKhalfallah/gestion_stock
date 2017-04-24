package riadh.gestion.presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ImageBean {
	
	private String lien_image;
	private int id_produit;
	
	public String getLien_image() {
		return lien_image;
	}
	public void setLien_image(String lien_image) {
		this.lien_image = lien_image;
	}
	public int getId_produit() {
		return id_produit;
	}
	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}
	
	

}
