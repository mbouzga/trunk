<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" media="screen" type="text/css" href="style.css"/>
<title>Inscription</title>
</head>
<body>
	<div id = "conteneur">
	<div id="entete">Formulaire d'inscription</div>
	<form action="signin">
	<fieldset>
		<label>votre Nom: </label><input type="text" name="name"><br>
		<label >votre e-mail :</label><input type="text" name="email"><br><br><br><br>
		<label>Fillieres :</label> <select name="filliere">
			<option>Informatique
			<option>Reseaux et telecom
			<option>Electrique
			<option>Industrielle
			<option>Electronique et informatique industrielle
			<option>Civil
		</select><br><br>
		<label>Type de scolarité avant:</label><INPUT type= "radio" name="entree" value="PI"> Cycle prépa integré															  <INPUT type= "radio" name="entree" value="Passerelle"> Passerelle <br><br><br><br>
		<label>Date d'anniversaire:  </label><br><br>
		<select name="day">
			<option>1
			<option>2
			<option>3
			<option>4
			<option>5
			<option>6
			<option>7
			<option>8
			<option>9
			<option>10
			<option>11
			<option>12
			<option>13
			<option>14
			<option>15
			<option>16
			<option>17
			<option>18
			<option>18
			<option>19
			<option>20
			<option>21
			<option>22
			<option>23
			<option>24
			<option>25
			<option>26
			<option>27
			<option>28
			<option>29
			<option>30
			<option>31</option>
		</select>
		<select name="month">
			<option>1
			<option>2
			<option>3
			<option>4
			<option>5
			<option>6
			<option>7
			<option>8
			<option>9
			<option>10
			<option>11
			<option>12</option>
		</select>				
		<input type="text" name="year">		
		<input type="submit" value="Envoyer"/>
	</fieldset>
	</form>
	</div>	
</body>
</html>