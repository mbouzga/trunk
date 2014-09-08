package com.actions;

import java.util.Locale;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

    private String login;
    private String psw;
    private String prenom;
    private String name;
    private String email;
    private String filliere;
    private String entree;

    @Override
    public String execute() {
        System.out.println("Msg global : " + getText("com.test"));
        ActionContext.getContext().setLocale(new Locale("en"));
        System.out.println("Msg en : " + getText("com.test"));
        ActionContext.getContext().setLocale(new Locale("fr"));
        System.out.println("Msg fr : " + getText("com.test"));
        if ("a".equals(login) && "1".equals(psw)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String SignIn() {
        if (name.isEmpty() && email.isEmpty()) {
            return ERROR;
        } else {
            return SUCCESS;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(final String login) {
        this.login = login;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(final String psw) {
        this.psw = psw;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getFilliere() {
        return filliere;
    }

    public void setFilliere(final String filliere) {
        this.filliere = filliere;
    }

    public String getEntree() {
        return entree;
    }

    public void setEntree(final String entree) {
        this.entree = entree;
    }

}
