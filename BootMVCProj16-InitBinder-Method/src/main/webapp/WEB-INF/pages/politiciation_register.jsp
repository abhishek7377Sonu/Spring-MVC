<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color: red; text-align: center">Politician Registration</h1>

<form:form method="POST" modelAttribute="pp">
	<table border="1" bgcolor="cyan" align="center">

		<tr>
			<td>Politiciation name ::</td>
			<td><form:input path="pName" /></td>
		</tr>

		<tr>
			<td>Politiciation Party name ::</td>
			<td><form:input path="party" /></td>
		</tr>

		<tr>
			<td>Politiciation DOB ::</td>
			<td><form:input path="dob" type="date" /></td>
		</tr>

		<tr>
			<td>Politiciation DOJ ::</td>
			<td><form:input path="doj" type="date" /></td>
		</tr>
		<tr>
			<td>Has ConstitutionPost?::</td>

			<td><form:radiobutton path="consPost" value="true" />Yes &nbsp;&nbsp;
			<td><form:radiobutton path="consPost" value="false" />No &nbsp;&nbsp;
			</td>
		</tr>
<tr>
  <td colspan="2"><input type="submit" value="register"></td>
</tr>
	</table>
</form:form>