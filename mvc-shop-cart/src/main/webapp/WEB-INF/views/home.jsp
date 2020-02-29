<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title><spring:message code="home.title" text="Welcome" /></title>
</head>
<body>
	<header>
		<div align="right"
			style="color: green; font-weight: bold; font-family: sans-serif;">
			Today Date:
			<fmt:formatDate value="${today}" pattern="yyyy-MM-dd" />
			.
		</div>
	</header>

	<div align="center">
		<h2>
			<spring:message code="home.welcome.messge"
				text="Welcome to shop cart"></spring:message>
		</h2>
	</div>

	<div align="center">
		<a href="login">Login</a>
	</div>
	<div align="center">
		<a href="registration">Registration</a>
	</div>
	<div align="center">
		<a href="products">Product</a>
	</div>

	<footer>
		<div align="center">
			<a href="home">Home</a>
		</div>
	</footer>
</body>
</html>