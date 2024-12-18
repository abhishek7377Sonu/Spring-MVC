<%-- <%@ page isELIgnored="false"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<h1 style="color: red; text-align: center">Employees Report</h1>


<c:choose>
	<c:when test="${!empty empsdata }">
		<table border="1" align="center" bgcolor="cyan">
			<tr>
				<th>Employee Number</th>
				<th>EMployee Name</th>
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
					<td><a href="edit?no=${emp.empno}"><img src="images/edit.jpeg" /></a> &nbsp;&nbsp;&nbsp; <a href="delete?no=${emp.empno}"><img src="images/delete.jpeg" /></a>
					</td>
				</tr>

			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center">records not found</h1>
	</c:otherwise>
</c:choose>

<br><br>
<hr>
<h1 style="text-align:center"><a href><img  src="images/add.jpeg">Add Employee</a></h1>

 --%>
 

 
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
                        <a href="edit?no=${emp.empno}"><img src="images/edit.jpeg"width="50" height="50" /></a>
                         &nbsp;&nbsp;&nbsp; <a onclick="return confirm('Do you want to delete')" href="delete?no=${emp.empno}"><img src="images/delete.jpeg"width="50" height="50" /></a>
                    </td>
                  <%--     <a href="edit?no=${emp.empno}"><img src="images/edit.jpeg" width="50" height="50" /></a>
    &nbsp;&nbsp;&nbsp; 
    <a onclick="confirm('Do you want to delete')" href="delete?no=${emp.empno}"><img src="images/delete.jpeg" width="50" height="50" /></a>
</td> --%>
                    
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
    
        <h1 style="color: red; text-align: center">Records not found</h1>
    </c:otherwise>
</c:choose>

    <c:if test="${not empty resultMsg }">
    <h3 style="color: green;text-align: center"> ${resultMsg}</h3>
    </c:if>


<br><br>
<hr>
         <h1 style="text-align:center"><a href="./"><img src="images/home.jpeg" width="50" height="50"/> Go Home</a></h1>
          
<hr>
<h1 style="text-align:center"><a href="add"><img src="images/adds.jpeg" width="50" height="50"/> Add Employee</a></h1>
 