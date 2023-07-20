<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

<h1>These are the following Employee Details with the Employee Id entered </h1>
eId:-${search.eid}
<br></br>
eName:-${search.ename}
<br></br>
eSalary:-${search.sal}
<br></br>
<a href="home"> Home </a>



</center>

</body>
</html>