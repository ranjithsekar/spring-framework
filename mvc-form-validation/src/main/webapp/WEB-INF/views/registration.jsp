<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form:form method="POST" modelAttribute="user">
		<table align="center">
			<tr>
				<td>Username</td>
				<td><form:input path="username" type="text" id="username" /></td>
				<td><form:errors path="username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:input path="password" type="text" id="password" /></td>
				<td><form:errors path="password" /></td>
			</tr>
			<tr>
				<td>Firstname</td>
				<td><form:input path="firstname" type="text" id="firstname" /></td>
				<td><form:errors path="firstname" /></td>
			</tr>
			<tr>
				<td>Lastname</td>
				<td><form:input path="lastname" type="text" id="lastname" /></td>
				<td><form:errors path="lastname" /></td>
			</tr>
			<tr>
				<td>Date of Birth</td>
				<td><form:input path="dob" type="text" id="dob" /></td>
				<td><form:errors path="dob" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" type="text" id="email" /></td>
				<td><form:errors path="email" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><form:input path="city" type="text" id="city" /></td>
				<td><form:errors path="city" /></td>
			</tr>
			<tr>
				<td>Country</td>
				<td><form:select path="country">
						<form:option value="">Your Country</form:option>
						<form:options items="${countries}" />
					</form:select></td>
				<td><form:errors path="country" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Register"
					formaction="proceedReg" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>