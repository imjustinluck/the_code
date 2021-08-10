<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<title>Insert title here</title>
</head>
	<body>
		<div>
			<h1>Submitted Info: </h1>
			<table>
				<tr>
					<td>Name: </td>
					<td><c:out value="${name }"></c:out></td>
				</tr>
				<tr>
					<td>Location: </td>
					<td><c:out value="${location }"></c:out></td>
				</tr>
				<tr>
					<td>Language: </td>
					<td><c:out value="${language }"></c:out></td>
				</tr>
				<tr>
					<td>Comment: </td>
					<td><c:out value="${comment }"></c:out></td>
				</tr>
			</table>
			
		</div>
	
		<script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="js/app.js"></script>
	</body>
</html>