package com.actions;

import com.opensymphony.xwork2.ActionSupport;

public class validXMLAction extends ActionSupport
 {
	private String name;
	private String email;
	private Integer year;
	
	




	@Override
	    public String execute() {
	        System.out.println("Methode execute ValidationXml ...");
	        if(name.isEmpty()&& email.isEmpty())
			{
				return ERROR;
			}
			else return SUCCESS;
	    }
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getYear() {
		return year;
	}
	
	 public void setYear(Integer year) {
			this.year = year;
		}
	
	

}
