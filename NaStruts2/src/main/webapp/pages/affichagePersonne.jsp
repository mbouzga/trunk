<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Carte Personne</title>
</head>
<body>
		<table border="1px">
			<tr><td>Nom</td><td><s:property value="personne.nom"/></td></tr>
			<tr><td>Prenom</td><td><s:property value="personne.prenom"/></td></tr>
			<tr><td>Age</td><td><s:property value="personne.age"/></td></tr>
		</table>
		<s:if test="personne.age>18">
  					Vous etes Majeur!
			</s:if>
			<s:else>
 				  Vous etes encore jeune pour �a ;)
			</s:else>
</body>
</html>