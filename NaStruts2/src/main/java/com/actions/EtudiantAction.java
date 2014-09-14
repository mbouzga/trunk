package com.actions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.bean.Etudiant;
import com.opensymphony.xwork2.ActionSupport;

public class EtudiantAction extends ActionSupport implements SessionAware{
	
	private Etudiant etudiant;
	private ArrayList<Etudiant> listEtudiant;
	
	// Pour l'utilisation de session
	private Map<String, Object> session;
	
	@SuppressWarnings("unchecked")
	@Override
    public String execute() {
		if(session.containsKey("listEtudiant")){
			listEtudiant = (ArrayList<Etudiant>)session.get("listEtudiant");
			listEtudiant.add(etudiant);
		} else {
			listEtudiant = new ArrayList<>();
			listEtudiant.add(etudiant);
			session.put("listEtudiant", listEtudiant);
		}
        return SUCCESS;
    }
	public String lister() {
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
	public void listE(){
		for(int i=0;i<listEtudiant.size();i++){
			System.out.println("nom:   "  +listEtudiant.get(i).getNom());
		}
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	

	
	
	

}
