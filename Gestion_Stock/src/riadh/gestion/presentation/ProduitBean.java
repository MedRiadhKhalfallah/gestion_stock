package riadh.gestion.presentation;

 import javax.faces.event.ActionEvent;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;


@ManagedBean
@RequestScoped
public class ProduitBean {
	
	private String nom="riadh";
	private String description;
	private int quantite;
	
	
	public void saveadd(ActionEvent e)
	{
		System.out.println(nom);
		System.out.println(quantite);
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
	

}
