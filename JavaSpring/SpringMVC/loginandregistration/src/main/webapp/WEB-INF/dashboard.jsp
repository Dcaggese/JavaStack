<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Successful Login</title>
</head>
<body>
	<h1>Welcome, <c:out value="${userName }" /></h1>
	<h3>This is your dashboard. Nothing to see here yet.</h3>
	<a href="/logout">logout</a>
</body>
</html>