package com.actions;

import java.util.ArrayList;

import com.bean.Etudiant;
import com.opensymphony.xwork2.ActionSupport;

public class EtudiantAction extends ActionSupport {
	private Etudiant etudiant;
	private ArrayList<Etudiant> listEtudiant= new ArrayList<Etudiant> ();
	
	@Override
    public String execute() {
		Etudiant et=new Etudiant();
		et.setNom(etudiant.getNom());
		et.setAge(etudiant.getAge());
		et.setPrenom(etudiant.getPrenom());
		listEtudiant.add(et);
		System.out.println(listEtudiant.get(0).getNom());
        return SUCCESS;
    }
	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public ArrayList<Etudiant> getListEtudiant() {
		return listEtudiant;
	}
	public void setListEtudiant(ArrayList<Etudiant> listEtudiant) {
		this.listEtudiant = listEtudiant;
	}
	
	

	
	
	

}
