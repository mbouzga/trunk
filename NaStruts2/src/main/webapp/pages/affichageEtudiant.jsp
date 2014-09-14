<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste Des Etudiants</title>
</head>
<body>
	<table border="2">
		<tr>
			<td align="center">Nom</td>
			<td align="center">Prenom</td>
			<td align="center">Age</td>
		</tr>
		<br>
		<s:iterator value="listEtudiant">
			<tr>
				<td align="center"><s:property value="nom" /></td>
				<td align="center"><s:property value="prenom" /></td>
				<td align="center"><s:property value="age" /></td>
			</tr>
		</s:iterator>
	</table>
	<a href="listerEtudiants.action">Liste des étudiants</a>

	<a href="InscriptionEtudiant.jsp">Ajouter Etudiant</a>
	<br />


</body>
</html>