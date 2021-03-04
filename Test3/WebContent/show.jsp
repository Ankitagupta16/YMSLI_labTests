<%@page import="com.traineeapp.trainee.Trainee"%>
<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show all trainees</title>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	Welcome ${user}
	<br>!
	<a href="logout">logout</a>
	<br>
	<div class="row">
    <div class="col-sm-8">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Trainee_id</th>
				<th>Trainee_name</th>
				<th>Branch</th>
				<th>Percentage</th>
				<%-- <th>email</th>
				<th>dob</th>
				<c:if test="${user.profile == 'admin'}">
				<th>delete</th>
				<th>update</th>
				</c:if> --%>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${trainees}" var="trainee">
				<tr>
					<td><c:out value="${trainee.trainee_id }" /></td>
					<td><c:out value="${trainee.trainee_name}" /></td>
					<td><c:out value="${trainee.branch}" /></td>
					<td><c:out value="${trainee.percentage}" /></td>
					<%-- 
					<td><c:out value="${trainee.email}" /></td><c:if test="${user.profile == 'admin'}">
					<td><a href="traineecontroller.do?action=delete&id=<c:out value="${trainee.id }"/>">delete</a></td>
					<td><a href="traineecontroller.do?action=update&id=<c:out value="${trainee.id }"/>">update</a></td>
					</c:if> --%>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
    </div>
 </div>  
<c:if test="${user.profile == 'admin' || user.profile == 'mgr'}">
	<a href="traineecontroller.do?action=add">add trainee</a>
</c:if>
</body>
</html>