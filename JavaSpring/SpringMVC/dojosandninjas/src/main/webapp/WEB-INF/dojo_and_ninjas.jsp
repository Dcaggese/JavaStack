<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninjas at Dojo</title>
</head>
<body>
	<main>
		<h1><c:out value="${ninja.dojo.name}" /> Location Ninjas</h1>
		<div id="table">
			<table>
				<thead>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Age</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="ninja" items="${ninjaList}">
						<tr>
							<td><c:out value="${ninja.firstName}" /></td>
							<td><c:out value="${ninja.lastName}" /></td>
							<td><c:out value="${ninja.age}" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</main>
</body>
</html>