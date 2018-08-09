 <%@page import="com.cg.model.ResumeModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%	ResumeModel rm= (ResumeModel)request.getAttribute("Request");
%>
<header>
<h1>Capgemini Technology Solutions</h1>
<h2>Airoli, Navi Mumbai</h2>
<h2>Maharastra, India</h2>
<h3>Contact Number : <%=rm.getContact() %></h3>
<h3>E-mail : <%=rm.getEmail() %></h3>
</header>

<h2 align="center"><b>Job Objectives</b></h2>
<hr>
<%=rm.getSummary() %><br>

<h2 align="center"><b>Personal Details : </b></h2>
<hr>
<table>
	<tr>
	<td>Name : </td>
	<td><%=rm.getFname() %> <%=rm.getLname() %></td>
	</tr>
	<tr>
	<td>Date of Birth : <td>
	<td><%=rm.getDob() %></td>
	</tr>
	<tr>
	<td>Gender : </td>
	<td><%=rm.getGender() %></td>
	</tr>
	<tr>
	<td>Address : </td>
	<td><%=rm.getAddress() %></td>
	</tr>
	<tr>
	<td>Hobbies : </td>
	<%for(String hobby:rm.getHobbies()) { %>
	<td><%=hobby %>,<%  } %></td>
	</tr>
</table>
<br>
<h2 align="center"><b>Educational Details : </b></h2>
<hr>
<table>
	<tr>
	<td>Highest Qualification : </td>
	<td><%=rm.getHQualification() %></td>
	</tr>
	<tr>
	<td>Skills : </td>
	<%for(String skill:rm.getSkills()) { %>
	<td><%=skill %>,<% } %></td>
	</tr>
</table>

</body>
</html>