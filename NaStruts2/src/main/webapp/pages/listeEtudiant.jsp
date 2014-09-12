<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" media="screen" type="text/css" href="style.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>liste-Etudiant</title>
</head>
<body>
	<s:if test="%{listEtudiant.size()>0}">
		<s:iterator value="listEtudiant">
			<br />
			
				Nom : <s:property value="nom" />
			<br />
				Prenom : <s:property value="age" />
			<br />
				Age : <s:property value="mail" />
			<br />

		</s:iterator>
	</s:if>
	<s:else>
					Aucun etudiant dans la liste
				</s:else>
</body>
</html>