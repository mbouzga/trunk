package com.actions;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.bean.Etudiant;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EtudiantAction extends ActionSupport implements SessionAware {

    private Etudiant etudiant;
    private ArrayList<Etudiant> listEtudiant;

    // Pour l'utilisation de session
    private Map<String, Object> session = ActionContext.getContext().getSession();

    @SuppressWarnings("unchecked")
    @Override
    public String execute() {

        System.out.println("Traitement dans l'action ... ");

        if (session.containsKey("listEtudiant")) {
            listEtudiant = (ArrayList<Etudiant>) session.get("listEtudiant");
            listEtudiant.add(etudiant);
        } else {
            listEtudiant = new ArrayList<Etudiant>();
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

    public void setEtudiant(final Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public ArrayList<Etudiant> getListEtudiant() {
        return listEtudiant;
    }

    public void setListEtudiant(final ArrayList<Etudiant> listEtudiant) {
        this.listEtudiant = listEtudiant;
    }

    public void listE() {
        for (int i = 0; i < listEtudiant.size(); i++) {
            System.out.println("nom:   " + listEtudiant.get(i).getNom());
        }
    }

    public void setSession(final Map<String, Object> session) {
        this.session = session;
    }

}
