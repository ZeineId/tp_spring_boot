package com.zeine.modele;

public class Etudiant {

	private String nom;
	private int tel;
	private String email;
	private String adresse;
	
	
	public Etudiant() {
		
	}
	
	public Etudiant(String nom, int tel, String email, String adresse) {
		this.nom = nom;
		this.tel = tel;
		this.email = email;
		this.adresse = adresse;
		
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	
}
