<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Unauthorized page</title>
</head>
<body>
	<div align="center">
		Dear <strong>${user}</strong>, You are Unauthorized to access this
		page!!!
	</div>
	<div align="center">
		<a href="<c:url value="/logout" />">Logout</a>
	</div>
</body>
</html>