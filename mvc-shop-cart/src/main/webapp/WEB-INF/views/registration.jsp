<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<style>
.error {
	color: #ff0000;
	font-weight: bold;
}
</style>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form:form method="POST" modelAttribute="user">
		<table align="center">
			<tr>
				<td>Username</td>
				<td><form:input path="username" type="text" id="username" /></td>
				<td><form:errors path="username" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:input path="password" type="text" id="password" /></td>
				<td><form:errors path="password" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Firstname</td>
				<td><form:input path="firstname" type="text" id="firstname" />
				</td>
				<td><form:errors path="firstname" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Lastname</td>
				<td><form:input path="lastname" type="text" id="lastname" /></td>
				<td><form:errors path="lastname" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><form:radiobuttons path="gender" items="${genders}" /></td>
				<td><form:errors path="gender" /></td>
			</tr>
			<tr>
				<td>Date of Birth</td>
				<td><form:input path="dob" type="text" id="dob" /></td>
				<td><form:errors path="dob" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Married?</td>
				<td><form:radiobuttons path="married" items="${married}" /></td>
				<td><form:errors path="married" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" type="text" id="email" /></td>
				<td><form:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><form:input path="city" type="text" id="city" /></td>
				<td><form:errors path="city" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Country</td>
				<td><form:select path="country">
						<form:option value="">Your Country</form:option>
						<form:options items="${countries}" />
					</form:select></td>
				<td><form:errors path="country" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Known Languages</td>
				<td><form:checkboxes items="${languages}" path="languages" />
				</td>
				<td><form:errors path="city" cssClass="error" /></td>
			</tr>

			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register"
					formaction="registration-process" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>