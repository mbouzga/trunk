package com.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.*;


public class validAnnotAction extends ActionSupport {
	
	
	private String name;
	private String email;
	private String branche;
	private Integer year;
	
	@Override
	public String execute() {
        return SUCCESS;
    }
	
	
	
	   @RequiredFieldValidator( message = "The name is required" )
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	   @EmailValidator( message = "The e-mail is required" )/*Ici le message est le meme que celui d'en bas
	    													ne serait-ce pas une répétition?*/
	    @RequiredFieldValidator(message = "L'e-mail est obligatoire")/*Je parle de celui la*/
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@RequiredFieldValidator(message = "Le champ est obligatoire")
	public String getBranche() {
		return branche;
	}
	public void setBranche(String branche) {
		this.branche = branche;
	}
    @IntRangeFieldValidator(min = "1960", max = "2000", message = "Votre age doit etre entre 18 et 30 ans ...")
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	
	
	

}
