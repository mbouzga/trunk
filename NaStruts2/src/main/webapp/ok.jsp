<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page OK</title>
</head>
<body bgcolor="yellow">
<h1>OKKK</h1>
Bonjour Monsieur/Madame : <s:property value="prenom"/>

<br>
<hr><hr>
Test d'internationalisation i18n : message egale = <s:property value="getText('com.test')" /> 
</body>
</html>