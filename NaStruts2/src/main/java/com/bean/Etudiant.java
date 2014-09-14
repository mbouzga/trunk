package com.bean;

import java.io.Serializable;

public class Etudiant implements Serializable{
	
	/**
	 * id de Serialization de l'etudiant
	 */
	private static final long serialVersionUID = 865960535623185719L;
	
	private String nom;
    private String prenom;
    private Integer age;

	public Etudiant() {
		super();
	}
    
	public Etudiant(String nom, String prenom, Integer age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

}
