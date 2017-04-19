package riadh.gestion.dao.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Historique implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_historique;
	private String nom_produit_historique;
	private String date_historique;
	private String description_historique;
	
	
	
	public Historique() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId_historique() {
		return id_historique;
	}
	public void setId_historique(int id_historique) {
		this.id_historique = id_historique;
	}
	public String getNom_produit_historique() {
		return nom_produit_historique;
	}
	public void setNom_produit_historique(String nom_produit_historique) {
		this.nom_produit_historique = nom_produit_historique;
	}
	public String getDate_historique() {
		return date_historique;
	}
	public void setDate_historique(String date_historique) {
		this.date_historique = date_historique;
	}
	public String getDescription_historique() {
		return description_historique;
	}
	public void setDescription_historique(String description_historique) {
		this.description_historique = description_historique;
	}
	
	

}
