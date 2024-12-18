<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>save product data</h1>
	<form:form action="product" modelAttribute="product" method="POSt">
<table>
		<tr>
			<td>Product ID</td>
			<td><form:input path="productId" /></td>
		</tr>
		<br>
		<tr>
			<td>Product Name</td>
			<td><form:input path="productName" /></td>
		</tr>
		<br>
		<tr>
			<td>Product Price</td>
			<td><form:input path="productPrice" /></td>
		</tr>
		<br>
		<tr>
		
		<td> <input type="submit" value="submit"></td>
		</tr>
		</table>
	</form:form>



</body>
</html>