<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Validation</title>
</head>
<body>
	<s:form action="validation" validate="true">
		<table>
			<tr><td>Nom</td><td><s:textfield name="nom" theme="simple"/></td></tr>
			<tr><td>Age</td><td><s:textfield name="age" theme="simple"/></td></tr>
			<tr><td>e-mail</td><td><s:textfield name="email" theme="simple"/></td></tr>
			<tr><td></td><td><s:submit value="Go !"/></td></tr>
		</table>
	</s:form>
</body>
</html>