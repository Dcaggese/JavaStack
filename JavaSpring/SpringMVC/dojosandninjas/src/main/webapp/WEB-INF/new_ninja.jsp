<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninja</title>
</head>
<body>
	<main>
		<h1>New Ninja</h1>
		<form:form action="/add/ninja" method="POST" modelAttribute="newNinja">
			<form:label path="dojo">Dojo:</form:label>
			<form:select path="dojo">
				<c:forEach var="dojo" items="${dojoList}">
					<form:option value="${dojo.id }"><c:out value="${dojo.name}" /></form:option>			
				</c:forEach>
			</form:select>
			<form:errors path="dojo"></form:errors>
			<br><br>
			
			<form:label path="firstName">First Name:</form:label>
			<form:input type="text" path="firstName" />
			<form:errors path="firstName"></form:errors>
			<br><br>
			
			<form:label path="lastName">Last Name:</form:label>
			<form:input type="text" path="lastName" />
			<form:errors path="lastName"></form:errors>
			<br><br>
			
			<form:label path="age">Age:</form:label>
			<form:input type="number" path="age" />
			<form:errors path="age"></form:errors>
			<br><br>
			
			<button type="submit">Create</button>
		</form:form>
	</main>
</body>
</html>