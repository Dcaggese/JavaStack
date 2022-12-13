<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Dojo</title>
</head>
<body>
	<main>
		<h1>New Dojo</h1>
		<form:form action="/add/dojo" method="POST" modelAttribute="dojoList">
		
			<form:label path="name">Name:</form:label>
			<form:input type="text" path="name" />
			<form:errors path="name"></form:errors>
			<br>
			<br>
			
			<button type="submit">Create</button>
		</form:form>
	</main>
</body>
</html>