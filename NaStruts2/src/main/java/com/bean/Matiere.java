package com.bean;

public class Matiere {
	
	private String nom;
	private String filliere;
	private String heures;
	
	
	public Matiere() {
		super();
	}
	
	public Matiere(String nom, String filliere, String heures) {
		super();
		this.nom = nom;
		this.filliere = filliere;
		this.heures = heures;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getFilliere() {
		return filliere;
	}
	public void setFilliere(String filliere) {
		this.filliere = filliere;
	}
	public String getHeures() {
		return heures;
	}
	public void setHeures(String heures) {
		this.heures = heures;
	}
	

}
