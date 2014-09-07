<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
	<s:form action="/test">
	<table>
	<tbody>
		<tr><td><s:label value="login" theme="simple"/></td> <td><s:textfield name="login" theme="simple"/></td></tr>
		<tr><td><s:label value="Psw" theme="simple"/></td> <td><s:textfield name="psw" theme="simple"/></td></tr>
		<tr><td></td> <td><s:submit value="Go !"/></td></tr>
	</tbody>
	</table>
	
	</s:form>
</body>
</html>