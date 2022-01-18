<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Spring Live project</h1>
	<i>Student data coming soon</i>
	<br />
	
	
	<div align="center">
	
	<form action="showAddStudentPage">
	<input type="submit" value="ADD">
	</form>
		<table border="1">
			<thead>
				<tr>
					<td>id</td>
					<td>name</td>
					<td>mobile</td>
					<td>country</td>	
				</tr>
			</thead>
			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.mobile}</td>
					<td>${student.country}</td>
					<td><a href="/com.abheet/updateStudent?userId=${student.id}">Update</a></td>
					<td><a href="/com.abheet/deleteStudent?userId=${student.id}" onClick="if(!confirm('Are you sure you want to delete this entry?')) return false">Delete</a></td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>