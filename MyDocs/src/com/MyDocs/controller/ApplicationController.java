package com.MyDocs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("*.app")
public class ApplicationController extends HttpServlet {
private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doPost(request, response);
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//creating session variable
HttpSession session = request.getSession();
String action = request.getServletPath();
//switch case to select the required action
switch (action) {
case "/login.app":
String uname = request.getParameter("uname");
String pass = request.getParameter("pass");
if(uname.equals("admin") && pass.equals("admin"))
{
session = request.getSession();
session.setAttribute("uname", uname);
response.sendRedirect("success.jsp");
}
else
{
response.sendRedirect("error.jsp");
}
break;
case "/logout.app":
session.invalidate();
response.sendRedirect("index.jsp");
break;
default:
break;
}
}
}