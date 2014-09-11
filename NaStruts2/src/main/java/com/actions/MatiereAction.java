package com.actions;

import java.util.HashSet;

import com.bean.Matiere;
import com.opensymphony.xwork2.ActionSupport;

public class MatiereAction extends ActionSupport {
	private Matiere matiere;
	private HashSet listeMatiere= new HashSet();
	
	@Override
    public String execute() {
		listeMatiere.add(matiere);
        return SUCCESS;
    }

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public HashSet getListeMatiere() {
		return listeMatiere;
	}

	public void setListeMatiere(HashSet listeMatiere) {
		this.listeMatiere = listeMatiere;
	}

}
