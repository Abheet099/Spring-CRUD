<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form:form action="save-student" modelAttribute="students"
			method="POST">

			<label>Name</label>

			<form:input path="name"></form:input>
			<br />

			<label>Mobile</label>

			<form:input path="mobile"></form:input>
			<br />

			<label>Country</label>

			<form:input path="country"></form:input>
			<br />

			<input type="submit" value="Submit" />

		</form:form>
	</div>

</body>
</html>