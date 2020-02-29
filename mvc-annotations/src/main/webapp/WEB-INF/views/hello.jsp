<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Annotations</title>
</head>
<body>${message}
	<form:form method="POST" modelAttribute="person">
		<div>
			<form:select path="country">
				<form:option value="">Your Country</form:option>
				<form:options items="${cities}" />
			</form:select>
		</div>
	</form:form>
</body>
</html>