<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Collections (List, Set, Map)</title>
</head>
<body>
	<fieldset>
	Etudiants
		<table border="1px">
			<s:iterator value="etudiants">
				<tr>
					<td>
						<s:property value="nom"/>
					</td>
					<td>
						<s:property value="prenom"/>
					</td>
					<td>
						<s:property value="age"/>
					</td>
				</tr>
			</s:iterator>
		</table>
	</fieldset>
	<fieldset>
		Profs
		<table border="2px">
			<s:iterator value="professeurs">
				<tr>
					<td>
						<s:property value="nom"/>
					</td>
					<td>
						<s:property value="prenom"/>
					</td>
					<td>
						<s:property value="age"/>
					</td>
				</tr>
			</s:iterator>
		</table>
	</fieldset>
	
	<fieldset>
	Matiers
		<table border="3px">
			<s:iterator value="matieres">
				<tr> 
					<td>
						<s:property value="key"/>
					</td>
					<td>
						<s:property value="value.nom"/>
					</td>
					<td>
						<s:property value="value.filliere"/>
					</td>
					<td>
						<s:property value="value.heures"/>
					</td>
				</tr>
			</s:iterator>
		</table>
	</fieldset>
</body>
</html>