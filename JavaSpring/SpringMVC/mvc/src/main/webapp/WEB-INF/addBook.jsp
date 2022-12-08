<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book</title>
</head>
<body>
	<main>
		<h1>New Book</h1>
		<form:form action="/books/new" method="POST" modelAttribute="book">
		
			<form:label path="title">Title:</form:label><br>
			<form:errors path="title" />
			<form:input type="text" path="title" /><br><br>
			
			<form:label path="description">Description:</form:label><br>
			<form:errors path="description" />
			<form:textarea path="description" cols="21" rows="5"/><br><br>
			
			<form:label path="language">Language:</form:label><br>
			<form:errors path="language" />
			<form:input type="text" path="language" /><br><br>
			
			<form:label path="numberOfPages">Pages:</form:label><br>
			<form:errors path="numberOfPages" />
			<form:input type="number" path="numberOfPages" /><br><br>
			
			<input type="submit" value="Add Book" />
		</form:form>
	</main>
</body>
</html>