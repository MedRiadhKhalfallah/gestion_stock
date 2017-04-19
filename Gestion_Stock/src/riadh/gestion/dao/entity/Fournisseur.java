package riadh.gestion.dao.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fournisseur implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_fournisseur;
	private String nom_fournisseur;
	private String adresse_mail_fournisseur;
	private String adresse_fournisseur;
	private String num_tel_fournisseur;
	private String description_fournisseur;
	
	
	
	
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_fournisseur() {
		return id_fournisseur;
	}
	public void setId_fournisseur(int id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}
	public String getNom_fournisseur() {
		return nom_fournisseur;
	}
	public void setNom_fournisseur(String nom_fournisseur) {
		this.nom_fournisseur = nom_fournisseur;
	}
	public String getAdresse_mail_fournisseur() {
		return adresse_mail_fournisseur;
	}
	public void setAdresse_mail_fournisseur(String adresse_mail_fournisseur) {
		this.adresse_mail_fournisseur = adresse_mail_fournisseur;
	}
	public String getAdresse_fournisseur() {
		return adresse_fournisseur;
	}
	public void setAdresse_fournisseur(String adresse_fournisseur) {
		this.adresse_fournisseur = adresse_fournisseur;
	}
	public String getNum_tel_fournisseur() {
		return num_tel_fournisseur;
	}
	public void setNum_tel_fournisseur(String num_tel_fournisseur) {
		this.num_tel_fournisseur = num_tel_fournisseur;
	}
	public String getDescription_fournisseur() {
		return description_fournisseur;
	}
	public void setDescription_fournisseur(String description_fournisseur) {
		this.description_fournisseur = description_fournisseur;
	}
	
}
