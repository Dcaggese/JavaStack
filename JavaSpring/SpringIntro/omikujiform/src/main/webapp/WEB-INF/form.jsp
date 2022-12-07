<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/formStyle.css" />
<title>Omikuji</title>
</head>
<body>
	<main>
		<h1>Send an Omikuji!</h1>
		<form action="/process" method="POST">
			<label for="years">Pick any number from 5 to 25:</label><br /> <input
				type="number" name="years" min="5" max="25" /><br />
			<br /> <label for="city">Enter the name of any city:</label><br />
			<input type="text" name="city" /><br />
			<br /> <label for="name">Enter the name of any real person:</label><br />
			<input type="text" name="name" /><br />
			<br /> <label for="hobby">Enter professional endeavor or
				hobby:</label><br /> <input type="text" name="hobby" /><br />
			<br /> <label for="creature">Enter any type of living thing:</label><br />
			<input type="text" name="creature" /><br />
			<br /> <label for="saying">Say something nice to someone:</label><br />
			<textarea name="saying" cols="30" rows="10"></textarea>
			<br />
			<br /> <input type="submit" value="Submit" />
		</form>
	</main>
</body>
</html>