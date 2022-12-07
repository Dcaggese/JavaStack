<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/results.css" />
<title>Result</title>
</head>
<body>
	<main>
	<h1>Here's your Omikuji</h1>
	<div>
	<h3>
	In <c:out value="${years}" />, you will live in <c:out value="${city }" /> with <c:out value="${name }" />
	 as you roommate, selling <c:out value="${hobby }" /> for a living. The next time you see a 
	 <c:out value="${creature }" />, you will have good luck. Also, <c:out value="${saying }" />
	</h3>
	</div>
	</main>
</body>
</html>