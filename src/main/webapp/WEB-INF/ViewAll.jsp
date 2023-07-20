<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="com.infosys.Employee,java.util.List" pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

<h1>Display all Records</h1>
<table border="1" style="color: blue;background-color: yellow;">
<c:forEach var="e" items="${empList}">

<tr>
	<td>${e.eid}</td>
	<td>${e.ename}</td>
	<td>${e.sal}</td>

</tr>
</c:forEach>

</table>
<a href="home"> Home </a>
</center>

</body>
</html>