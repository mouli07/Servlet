package com.book.collection;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.book.pojo.Book;
import com.book.service.BookService;
import com.book.service.BookServiceImpl;

@WebServlet("*.shop")
public class BookCollection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private BookService service = new BookServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String action = request.getServletPath();
		System.out.println(action);
		
		switch (action) {
		
		case "/addToCart.shop":
			int id = Integer.parseInt(request.getParameter("id"));
			service.addBookCart(id);
			response.sendRedirect("viewCart.shop");
			break;
		
		case "/viewCart.shop":
			session = request.getSession();
			session.setAttribute("cart", service.viewCart());	System.out.println(service.viewCart());
			response.sendRedirect("cart.jsp");
			break;
		
		case "/delFrmCrt.shop":
			id = Integer.parseInt(request.getParameter("id"));
			service.delFrmCart(id);
			response.sendRedirect("viewCart.shop");
			break;
			
		case "/viewAllBooks.shop":
			session = request.getSession();
			session.setAttribute("book", service.viewAllBooks());	System.out.println(service.viewAllBooks());
			response.sendRedirect("home.jsp");
			break;

		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
