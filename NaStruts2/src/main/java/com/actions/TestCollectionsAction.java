package com.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.omg.PortableInterceptor.SUCCESSFUL;

import com.bean.Etudiant;
import com.bean.Matiere;
import com.bean.Professeur;
import com.opensymphony.xwork2.ActionSupport;

public class TestCollectionsAction extends ActionSupport{

	private List<Etudiant> etudiants;
	private Set<Professeur> professeurs;
	private Map<String, Matiere> matieres;
	
	public String execute(){
		
		// List des etudiants d'une maniere static
		etudiants = new ArrayList<>();
		etudiants.add(new Etudiant("EL AZZOUZI", "Najlae", 21));
		etudiants.add(new Etudiant("BOUZGA", "Mountassir", 27));
		
		// Set des professeurs static
		professeurs = new HashSet<>();
		professeurs.add(new Professeur("PN1", "PP1", 1));
		professeurs.add(new Professeur("PN2", "PP2", 2));
		professeurs.add(new Professeur("PN3", "PP3", 3));
		
		// Map des matieres satatic
		matieres = new HashMap<>();
		matieres.put("cle1", new Matiere("Arabe", "Lettre", 10+""));
		matieres.put("cle2", new Matiere("Java", "info", 20+""));
		matieres.put("cle3", new Matiere("Struts", "info/Tech-Web", 30+""));
		
		System.out.println(matieres.size());
		return SUCCESS;
	}
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	public Set<Professeur> getProfesseurs() {
		return professeurs;
	}
	public void setProfesseurs(Set<Professeur> professeurs) {
		this.professeurs = professeurs;
	}
	public Map<String, Matiere> getMatieres() {
		return matieres;
	}
	public void setMatieres(Map<String, Matiere> matieres) {
		this.matieres = matieres;
	}
	
}
