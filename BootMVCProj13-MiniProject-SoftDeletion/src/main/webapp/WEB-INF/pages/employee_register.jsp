<%-- 
 <%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<h1 style="color: red; text-align: center">Employees Report</h1>

<c:choose>
    <c:when test="${not empty empsData}">
        <table border="1" align="center" bgcolor="cyan">
            <tr>
                <th>Employee Number</th>
                <th>Employee Name</th>
                <th>Job</th>
                <th>Salary</th>
                <th>Operation</th>
            </tr>
            <c:forEach var="emp" items="${empsData}">
                <tr>
                    <td>${emp.empno}</td>
                    <td>${emp.ename}</td>
                    <td>${emp.job}</td>
                    <td>${emp.sal}</td>
                    <td>
                        <a href="edit?no=${emp.empno}"><img src="images/edit.jpeg"width="50" height="50" /></a> &nbsp;&nbsp;&nbsp; 
                        <a href="delete?no=${emp.empno}"><img src="images/delete.jpeg"width="50" height="50" /></a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <h1 style="color: red; text-align: center">Records not found</h1>
    </c:otherwise>
</c:choose>

<br><br>
<hr>
<h1 style="text-align:center"><a href="add"><img src="images/add.jpeg" width="50" height="50"/> Add Employee</a></h1>
 --%>



<%-- 
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<script language="javascript" src="js/validation.js">
</script>



<h1 style="color: red; text-align: center">Register Employee</h1>

<form:form modelAttribute="emp"   onsubmit="return validation(this)">
<p style="color:red;text-align:center">
<form:errors path="*"/>
</p>
	<table border="1" align="center" bgcolor="cyan">
		<tr>
		<tr>
			<td>Employee name::</td>
			<td><form:input path="ename" /> </td> <form:errors  path ="ename"/>  <span id="enameErr"></span>
		</tr>

		<tr>
			<td>Employee desg::</td>
			<td><form:input path="job" /> </td> <form:errors  path ="job"/>   <span id="jobErr"></span>

		</tr>

		<tr>
			<td>Employee salary::</td>
			<td><form:input path="sal" /> 	</td>  <form:errors  path ="sal"/>   <span id="salErr"></span>
		
		</tr>

		<tr>
			<td colspan="2" align="center"><input type="submit"
				value="register Employee" /></td>
		</tr>

	</table>

</form:form>
 =========================================================================================--%>
 
 
 

 
 <%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<noscript>
    <h1 style="color:red;text-align:center">Please enable java script </h1>
</noscript>
<style media="all">
   body {
      background-color: grey;
   }
   span {
      color: red;
      font-weight: bold; /* Add this line to make text bold */
   }
</style>
<script language="javascript" src="js/validation.js"></script>

<h1 style="color: red; text-align: center">Register Employee</h1>

<form:form modelAttribute="emp" onsubmit="return validation(this)">
    <table border="1" align="center" bgcolor="cyan">
        <tr>
            <td>Employee Name:</td>
            <td>
                <form:input path="ename" />
          <form:errors  path="ename"/> 
            <td><span id="enameErr"></span></td>
        </tr>
        <tr>
            <td>Employee Designation:</td>
            <td>
                <form:input path="job" />
            </td>
            <td><span id="jobErr"></span></td>
        </tr>
        <tr>
            <td>Employee Salary:</td>
            <td>
                <form:input path="sal" />
            </td>
            <td><span id="salErr"></span></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="Register Employee" /></td>
        </tr>
    </table>
    <form:hidden path="vflag"/>
</form:form>

  






















