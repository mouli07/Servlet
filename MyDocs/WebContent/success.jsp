<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jstl:if test='${!sessionScope.uname.equals("admin")}'>
<jstl:redirect url = "index.jsp"></jstl:redirect>
</jstl:if>
<h4>Welcome ${sessionScope.uname}</h4><br>
<h4><a href="logout.app">Logout</a></h4>
</body>
</html>