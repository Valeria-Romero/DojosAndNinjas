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
	<h1>New ninja</h1>
	<form action="/add/ninja" method="POST">
		<label for="dojo">Dojo</label>
		<select name="dojoId">
			<c:forEach var = "dojo" items = "${dojosList}">
                <option value="${dojo.getId()}">
                	<c:out value = "${dojo.getName()}" ></c:out>
                </option>
            </c:forEach>
		</select>
		<label for="firstName">First Name</label>
		<input type="text" name="firstName" id="firstName" />
		
		<label for="lastName">Last Name</label>
		<input type="text" name="lastName" id="lastName" />
		
		<label for="age">Age</label>
		<input type="number" name="age" id="age" />	
		
		<button type="submit">Create</button>
	</form>
</body>
</html>