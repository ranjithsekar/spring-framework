<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	<table align="center">
		<form:form method="post" action="product-add" modelAttribute="product">
			<tr>
				<td>Product Name:</td>
				<td><form:input type="text" path="name" id="name" /></td>
				<td><form:errors path="name" /></td>
			</tr>

			<tr>
				<td>Category:</td>
				<td><form:select path="category">
						<form:options items="${prodCategories}" />
					</form:select></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Add" /></td>
			</tr>

		</form:form>
	</table>
</body>
</html>