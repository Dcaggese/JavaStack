<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login and Registration</title>
</head>
<body>
	<main>
	
		<div id="header">
			<h1>Welcome!</h1>
		</div>
		
		<div id="forms">
		
			<div id="register">
				<form:form action="/register" method="POST" modelAttribute="newUser">
				
					<form:label path="userName">Username:</form:label>
					<form:input path="userName" />
					<form:errors path="userName" />
					<br><br>
					
					<form:label path="email">Email:</form:label>
					<form:input path="email" />
					<form:errors path="email" />
					<br><br>
					
					<form:label path="password">Password:</form:label>
					<form:input path="password" type="password" />
					<form:errors path="password" />
					<br><br>
					
					<form:label path="confirm">Confirm Password:</form:label>
					<form:input path="confirm" type="password"/>
					<form:errors path="confirm" />
					<br><br>
					
					<button type="submit">Register</button>
					
				</form:form>
			</div>
			
			<div id="login">
				<form:form action="/login" method="POST" modelAttribute="newLogin">
				
					<form:label path="email">Email:</form:label>
					<form:input path="email" />
					<form:errors path="email" />
					<br><br>
					
					<form:label path="password">Password:</form:label>
					<form:input path="password" type="password"/>
					<form:errors path="password" />
					<br><br>
					
					<button type="submit">Login</button>
				</form:form>
			</div>
		</div>
	</main>
</body>
</html>