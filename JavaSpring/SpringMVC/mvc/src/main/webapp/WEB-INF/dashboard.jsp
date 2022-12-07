<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Books</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Language</th>
				<th># of Pages</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="books" items="${books}">
				<tr>
					<td><c:out value="${books.id }" /></td>
					<td><c:out value="${books.title }" /></td>
					<td><c:out value="${books.language }" /></td>
					<td><c:out value="${books.numberOfPages }" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>