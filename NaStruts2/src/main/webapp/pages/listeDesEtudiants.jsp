<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" media="screen" type="text/css" href="style.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste</title>
</head>
<body>
<table>
	<tr>
		<td align="center">Nom</td>
		<td align="center">Prenom</td>
		<td align="center">Age</td>
	</tr>
	<br>
	<tr>
		<s:iterator value="listEtudiant">
			<td align="center"><s:property value="etudiant.getNom()" /></td>
			<td align="center"><s:property value="etudiant.prenom" /></td>
			<td align="center"><s:property value="etudiant.age" /></td>
		</s:iterator>
	</tr>
</table>

</body>
</html>