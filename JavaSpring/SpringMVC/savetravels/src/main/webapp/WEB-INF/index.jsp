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
<title>Read Share</title>
</head>
<body>
	<main>
		<div id="Table">

			<table>
				<thead>
					<tr>
						<th>Expense</th>
						<th>Vendor</th>
						<th>Amount</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="expense" items="${expenses}">
						<tr>
							<td><a href="/show/${expense.id}"><c:out
										value="${expense.name }" /></a></td>
							<td><c:out value="${expense.vendor }" /></td>
							<td><c:out value="${expense.amount }" /></td>
							<td>
							<a href="/edit/expense/${expense.id }">Edit</a> 
							<form:form method="Post" action="/delete/${expense.id }">
								<input type="hidden" name="_method" value="delete" />
								<button type="submit">Delete</button>
							</form:form>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
		<div id="Form">

			<form:form action="/add/expense" method="POST"
				modelAttribute="expensesList">
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
	</main>
</body>
</html>