<%@page import="com.traineeapp.trainee.Trainee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
success, trainee is added to db
<%
Trainee trainee=(Trainee)session.getAttribute("trainees");
	out.print("trainee id: "+trainee.getTrainee_id()+"<br>");
	out.print("trainee name: "+trainee.getTrainee_name()+"<br>");
	out.print("trainee address: "+trainee.getBranch()+"<br>");
	out.print("trainee email: "+trainee.getPercentage()+"<br>");
%>
</body>
</html>