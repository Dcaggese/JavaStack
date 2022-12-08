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
<title>Burger Tracker</title>
</head>
<body>
	<main>
		<div id="Table">

			<table>
				<thead>
					<tr>
						<th>Burger Name</th>
						<th>Restaurant Name</th>
						<th>Rating (out of 5)</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="burger" items="${burgersList}">
						<tr>
							<td><c:out value="${burger.burgerName }" /></td>
							<td><c:out value="${burger.restaurantName }" /></td>
							<td><c:out value="${burger.ratings }" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
		<div id="Form">

			<form:form action="/add/burger" method="POST"
				modelAttribute="burgerList">
				<div>
					<form:label path="burgerName">Burger Name</form:label>
					<form:input type="text" path="burgerName" />
					<form:errors path="burgerName" />
				</div>

				<div>
					<form:label path="restaurantName">Restaurant Name</form:label>
					<form:input type="text" path="restaurantName" />
					<form:errors path="restaurantName" />
				</div>
				<div>
					<form:label path="ratings">Rating</form:label>
					<form:input type="number" path="ratings" />
					<form:errors path="ratings" />
				</div>
				<div>
					<form:label path="notes">Notes</form:label>
					<form:textarea path="notes"></form:textarea>
					<form:errors path="notes" />
				</div>
				<input type="submit" value="Add" />

			</form:form>

		</div>
	</main>
</body>
</html>