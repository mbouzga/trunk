package com.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private String login;
	private String psw;
	private String prenom;
	
	public String execute(){
		if("a".equals(login) && "1".equals(psw)){
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
