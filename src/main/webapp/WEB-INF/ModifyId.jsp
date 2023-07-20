<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

<h1>Please modify the details which needs to be modified</h1>
  

<spring:form  action="modifyidmsg"  modelAttribute="search" >    
Eid :- <spring:input path="eid"  width="20" /><br>  
Ename : <spring:input path="ename" width="20"/> <br>  
Sal:- <spring:input path="sal" width="20" /><br>    
<input type="submit" value="submit"/>   
</spring:form>



<a href="home"> Home </a>



</center>

</body>
</html>