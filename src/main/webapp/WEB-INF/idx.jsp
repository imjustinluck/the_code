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
			<form method="POST" action="/submit">
			<div>
				<label for="name">Your Name: </label>
				<input type="text" name="name" id="name" />
			</div>
			<div>
				<label for="location">Dojo Location: </label>
				<select name="location" id="location">
					<option value="Los Angeles" selected>Los Angeles</option>
					<option value="San Francisco">San Francisco</option>
				</select>
			</div>
			<div>
				<label for="language">Favorite Language: </label>
				<select name="language" id="language">
					<option value="Python" selected>Python</option>
					<option value="San Francisco">San Francisco</option>
				</select>
			</div>
			<textarea name="comment" id="comment" cols="30" rows="3" placeholder="Comment: (Optional)"></textarea>
			<button>Submit</button>
			</form>
		</div>
	
		<script src="/webjars/jquery/jquery.min.js"></script>
		<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="js/app.js"></script>
	</body>
</html>