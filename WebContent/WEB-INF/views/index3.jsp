<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<body>
<h2>Address</h2>

<form:form method="POST" action="index3" modelAttribute="project">

			<table style="with: 50%">
				<tr>
					<td>Project Id</td>
					<td><form:input type="text"  path="P_id" /></td>
				</tr>
				<tr>
					<td>Employee Id</td>
					<td><form:input type="text"  path="id" /></td>
				</tr>
				<tr>
					<td>Project Duration</td>
					<td><form:input type="text" path="P_duration" /></td>
				</tr>
				<tr>
					<td>Project status</td>
					<td><form:input type="text" path="P_status" /></td>
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
