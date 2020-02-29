<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Add</title>
</head>
<body>
	<form:form method="post" modelAttribute="product">
		<table align="center">
			<tr>
				<td>Name</td>
				<td><form:input path="name" type="text" id="name" /></td>
				<td><form:errors path="name" /></td>
			</tr>
			<tr>
				<td>Category</td>
				<td><form:input path="category" type="text" id="category" /></td>
				<td><form:errors path="category" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Add"
					formaction="add-product-process" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>