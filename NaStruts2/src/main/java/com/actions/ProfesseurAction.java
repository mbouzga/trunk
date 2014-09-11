package com.actions;

import com.bean.Matiere;
import com.bean.Professeur;

import java.util.HashMap; 

import com.opensymphony.xwork2.ActionSupport;

public class ProfesseurAction extends ActionSupport {
	
	private Professeur professeur;
	private HashMap <Matiere,Professeur> listeMatiereProf= new HashMap<Matiere, Professeur>();
	
	@Override
    public String execute() {
		Matiere m=new Matiere();
		m= professeur.getMatiere();
		listeMatiereProf.put(m, professeur);
        return SUCCESS;
    }

	public Professeur getProfesseur() {
		return professeur;
	}

	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}

	public HashMap<Matiere, Professeur> getListeMatiereProf() {
		return listeMatiereProf;
	}

	public void setListeMatiereProf(HashMap<Matiere, Professeur> listeMatiereProf) {
		this.listeMatiereProf = listeMatiereProf;
	}
	

}
