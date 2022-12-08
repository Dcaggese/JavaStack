<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expense Details</title>
</head>
<body>
	<h1>Expense Details</h1>
	<a href="/">Go Back</a>
	<h3>
		Expense Name:
		<c:out value="${expense.name }" />
	</h3>
	<h3>
		Description:
		<c:out value="${expense.description }" />
	</h3>
	<h3>
		Vendor:
		<c:out value="${expense.vendor }" />
	</h3>
	<h3>
		Amount Spent:
		<c:out value="$ ${expense.amount }" />
	</h3>

</body>
</html>