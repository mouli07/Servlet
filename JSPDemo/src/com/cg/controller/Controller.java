package com.cg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.model.ResumeModel;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ResumeModel rm=new ResumeModel((request.getParameter("fname")),(request.getParameter("lname")),(request.getParameter("dob")),
				(request.getParameter("gender")),(request.getParameter("address")),(request.getParameter("contact")),(request.getParameter("email")),
				(request.getParameterValues("hobbies")),(request.getParameter("hq")),(request.getParameterValues("skill")),(request.getParameter("website")),(request.getParameter("summary")));
		
		/*request.setAttribute("fname", rm.getFname());
		request.setAttribute("lname", rm.getLname());
		request.setAttribute("dob", rm.getDob());
		request.setAttribute("gender", rm.getGender());
		request.setAttribute("address", rm.getAddress());
		request.setAttribute("contact", rm.getContact());
		request.setAttribute("email", rm.getEmail());
		request.setAttribute("hobbies", rm.getHobbies());
		request.setAttribute("hq", rm.getHQualification());
		request.setAttribute("skill", rm.getSkills());
		request.setAttribute("website", rm.getWebsite());
		request.setAttribute("summary", rm.getSummary());*/
		
		request.setAttribute("Request", rm);
		RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
