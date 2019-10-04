<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<body>
<h2>Employee Registration</h2>

<form:form method="POST" action="index1" modelAttribute="employee">

			<table style="with: 50%">
				<tr>
					<td>Employee Id</td>
					<td><form:input type="text" id="id" path="id" /></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><form:input type="text" id="fname" path="fname" /></td>
				</tr>
				<tr>
					<td>Last name</td>
					<td><form:input type="text"  id="lname" path="lname" /></td>
				</tr>
				<tr>
					<td>Department</td>
					<td><form:input type="text"  id="dept" path="dept" /></td>
				</tr>
		
		         <tr>
		             <td>
		           <input type="submit" value="submit"/>
				      </td>
				  <td>
					</table>
			</form:form>
			
			
		   
</body>
                
</html>
