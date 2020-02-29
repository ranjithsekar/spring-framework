<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>All Products</title>
</head>
<body>
	<div>Name: ${name}</div>
	<div>Category: ${category}</div>
	<ul>
		<c:forEach items="${products}" var="product">
			<li><c:out value="${product}"></c:out></li>
		</c:forEach>
	</ul>
</body>
</html>