<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body>
<h1>Update Form</h1><a href="/">Cancel</a>
<div id="Form">

			<form:form action="/edit/expense/${expense.id}" method="POST"
				modelAttribute="expense">
				<input type="hidden" name="_method" value="PUT" />
				<div>
					<form:label path="name">Expense Name:</form:label>
					<form:input type="text" path="name" />
					<form:errors path="name" />
				</div>

				<div>
					<form:label path="vendor">Vendor:</form:label>
					<form:input type="text" path="vendor" />
					<form:errors path="vendor" />
				</div>
				<div>
					<form:label path="amount">Amount:</form:label>
					<form:input type="number" step="0.01" path="amount" />
					<form:errors path="amount" />
				</div>
				<div>
					<form:label path="description">Description:</form:label>
					<form:textarea path="description"></form:textarea>
					<form:errors path="description" />
				</div>
				<input type="submit" value="Submit" />

			</form:form>

		</div>
</body>
</html>