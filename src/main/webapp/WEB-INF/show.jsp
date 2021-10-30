<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojos and ninjas</title>
</head>
<body>
	<h1>${ dojoinfo.getName() } Location Ninjas</h1>
	<table>
        <thead>
            
            <tr>
                <td>First Name</td>
                <td>Last Name</td>
                <td>Age</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${ dojoinfo.getNinjas() }" var="ninja">
                    <tr>
                        <td>${ ninja.getFirstName() }</td> 
                        <td>${ ninja.getLastName() }</td>
                        <td>${ ninja.getAge() }</td>
                    </tr>
                </c:forEach>
        </tbody>
    </table>
</body>
</html>