<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojos and ninjas</title>
</head>
<body>
	<h1>New Dojo</h1>
	<form action="/add" method="POST">
		<label for="dojo">Dojo</label>
		<input type="text" name="dojo" id="dojo" />
		<button type="submit">Create</button>
	</form>
</body>
</html>