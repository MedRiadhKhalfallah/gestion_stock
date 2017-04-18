package riadh.gestion.dao.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_utilisateur;
	private String nom_utilisateur;
	private String adresse_utilisateur;
	private String num_tel_utilisateur;
	private String user_name_utilisateur;
	private String mdp_utilisateur;
	private String adresse_mail_utilisateur;
	
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId_utilisateur() {
		return id_utilisateur;
	}
	public void setId_utilisateur(long id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}
	public String getNom_utilisateur() {
		return nom_utilisateur;
	}
	public void setNom_utilisateur(String nom_utilisateur) {
		this.nom_utilisateur = nom_utilisateur;
	}
	public String getAdresse_utilisateur() {
		return adresse_utilisateur;
	}
	public void setAdresse_utilisateur(String adresse_utilisateur) {
		this.adresse_utilisateur = adresse_utilisateur;
	}
	public String getNum_tel_utilisateur() {
		return num_tel_utilisateur;
	}
	public void setNum_tel_utilisateur(String num_tel_utilisateur) {
		this.num_tel_utilisateur = num_tel_utilisateur;
	}
	public String getUser_name_utilisateur() {
		return user_name_utilisateur;
	}
	public void setUser_name_utilisateur(String user_name_utilisateur) {
		this.user_name_utilisateur = user_name_utilisateur;
	}
	public String getMdp_utilisateur() {
		return mdp_utilisateur;
	}
	public void setMdp_utilisateur(String mdp_utilisateur) {
		this.mdp_utilisateur = mdp_utilisateur;
	}
	public String getAdresse_mail_utilisateur() {
		return adresse_mail_utilisateur;
	}
	public void setAdresse_mail_utilisateur(String adresse_mail_utilisateur) {
		this.adresse_mail_utilisateur = adresse_mail_utilisateur;
	}

	

}
