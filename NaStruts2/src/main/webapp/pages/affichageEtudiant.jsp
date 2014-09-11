<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste Des Etudiants</title>
</head>
<body>
	<tr>
		<td>Nom</td>
		<td>Prenom</td>
		<td>Age</td>
	</tr>
	<s:iterator value="listEtudiant">

		<tr>
			<td><s:property value="nom" /></td>
			<td><s:property value="prenom" /></td>
			<td><s:property value="age" /></td>
		</tr>

	</s:iterator>

</body>
</html>