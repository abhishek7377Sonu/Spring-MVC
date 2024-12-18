<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
.error {
	color: red;
	font-weight: bold;
}

</style>


</head>
<body>


	<h2>User Registration form</h2>

	<!-- model attribute =user              and here user is key -->
	<!-- action ="register" means whenever form is submitted req should go to register url pattern -->
	<!-- method="POST" means  whenever submitted the form the request server using  HTTP POST request-->
	<form:form action="register" modelAttribute="user" method="POST">

		<table>
			<tr>
				<td>UserName:</td>
				<td><form:input path="uname" /> <form:errors path="uname" cssClass="error" /></td>
			</tr>

			<tr>
				<td>Password:</td>
				<td><form:password path="pwd" />  <form:errors path="pwd" cssClass="error" /></td>
			</tr>

			<tr>
				<td>Email:</td>
				<td><form:input path="email" /> <form:errors path="email" cssClass="error" /></td>
			</tr>

			<tr>
				<td>PhoneNumber:</td>
				<td><form:input path="phno" /><form:errors path="phno" cssClass="error" /></td>
			</tr>

			<tr>
				<td>Age:</td>
				<td><form:input path="age" /><form:errors path="age" cssClass="error" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="register" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>