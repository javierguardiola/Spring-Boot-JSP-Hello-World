<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<title>Spring Boot JSP example</title>
	<link rel="stylesheet" type="text/css" href="/style.css">
</head>
<body>
	<br> Message: ${message}
	<form action="/welcome" method="post">
		<input type="text" name="nombre" />
		<input type="submit" value="Submit" />
	</form>
</body>
</html>