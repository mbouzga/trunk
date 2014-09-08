<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" media="screen" type="text/css" href="style.css"/>
<title>Welcome</title>
</head>
<body bgcolor="pink">

	<h1>Welcome</h1>
	<h4>Voici votre fiche d'inscription :</h4>
	<table>
		<tr>
			<th>Nom</th>
			<th>E-mail</th>
			<th>Filliere</th>
			<th>Scolarité avant</th>
		</tr>
		<tr>
			<td><s:property value="name"/></td>
			<td><s:property value="email"/></td>
			<td><s:property value="filliere"/></td>
			<td><s:property value="entree"/></td>			
	</table>	
</body>
</html>