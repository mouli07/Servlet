<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<form action="login.app" method="post">
<div align="center">
<div>
<h4>LOGIN</h4>
</div>
<div>
<input type="text" name="uname" placeholder="Username" required="required" />
</div>
<br>
<div>
<input type="password" name="pass" placeholder="Password" required="required" />
</div>
<br>
<div>
<input type="submit" name="login" value="LogIn">
</div>
</div>
</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>