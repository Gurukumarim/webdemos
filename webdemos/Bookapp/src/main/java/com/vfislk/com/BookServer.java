package com.vfislk.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.util.RequestUtil;

/**
 * Servlet implementation class BookServer
 */
@WebServlet("/BookServer")
public class BookServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 response.setContentType("text/html");
			
	     PrintWriter out=response.getWriter();
	     
	     String title=request.getParameter("title");
	     String author=request.getParameter("author");
	     String category=request.getParameter("category");
	     int bookId=Integer.parseInt(request.getParameter("bookId"));
	     double price=Double.parseDouble(request.getParameter("price"));
	     
	     
	     request.setAttribute("myttitle", title);
	     request.setAttribute("author", author);
	     request.setAttribute("category", category);
	     request.setAttribute("bookId", bookId);
	     request.setAttribute("price", price);
	
	     
	    RequestDispatcher dispatcher=request.getRequestDispatcher("sucess.jsp");
	     		
	     	dispatcher.forward	(request,response);
	     	
	     
	     
	     
	     
	     
          
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
