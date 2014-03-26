<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
<script type="text/javascript" src="js/registration-form-validation.js">
	
</script>
</head>
<body onload="document.registration.firstname.focus();">
	<form:form method="post" modelAttribute="registration" action="save">
		
		<table>
			<tr>
				<td>First Name</td> <form:input class="input-small" path="firstname" />
				<td>${usernameMessage}</td>

			</tr>
			<tr>
				<td>Middle name</td>
				<td><input type="text" id="middlename"></td>

			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" id="lastname">
				<td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" id="email"></td>

			</tr>
			<tr>
				<td>Phone No</td>
				<td><input type="text" id="phone"></td>

			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" id="city"></td>

			</tr>
			<tr>
				<td>Country</td>
				<td><input type="text" id="country"></td>

			</tr>
			<tr>
				<td>Pincode</td>
				<td><input type="text" name="pincode"></td>

			</tr>
		</table>
		<input class="button" type="submit" name="submit" value="Add" />
	</form:form>
	
	<h2>List of Users</h2>
	
	<table>
		<tr>
			<th>id</th>
			<th>firstname</th>
		</tr>
		
		<c:forEach items="${registration}" var="registerVar" varStatus="status">
		
		<tr>
			<td>${registerVar.id}</td>
			<td>${registerVar.firstname}</td>
		</tr>
		
		</c:forEach>
		
	</table>
	
	
</body>
</html>