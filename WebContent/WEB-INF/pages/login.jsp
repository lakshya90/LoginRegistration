<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
	<form name='login' method="post">
		<h3>${message}</h3>
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="username"></td>

			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password"></td>

			</tr>


		</table>
		<input type="submit" name="submit" value="Submit" />
	</form>
</body>
</html>