<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<body>
<h2>Address</h2>

<form:form method="POST" action="index2" modelAttribute="address">

			<table style="with: 50%">
				<tr>
					<td>Address Id</td>
					<td><form:input type="text"  path="add_id" /></td>
				</tr>
				<tr>
					<td>Employee Id</td>
					<td><form:input type="text"  path="id" /></td>
				</tr>
				<tr>
					<td>Present Address</td>
					<td><form:input type="text" path="Present_add" /></td>
				</tr>
				<tr>
					<td>Contact No</td>
					<td><form:input type="number" path="contact_no" /></td>
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
