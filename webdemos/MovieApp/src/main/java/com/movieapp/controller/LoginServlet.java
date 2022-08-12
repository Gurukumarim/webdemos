package com.movieapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movieapp.services.ILoginService;
import com.movieapp.services.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
	   //  PrintWriter out=response.getWriter();
	     
	     String username=request.getParameter("username");
	     String password=request.getParameter("password");
	     
	     
	     ILoginService loginService=(ILoginService) new LoginServiceImpl();
	     boolean result=loginService.validUsername(username,password);
	     
	     if(result) {

	     
	     request.setAttribute("username", username);
	
	     
	     RequestDispatcher dispatcher=request.getRequestDispatcher("sucess.jsp");
	     
	     dispatcher.forward(request, response);
	     }else {
	     	response.sendRedirect	("index.jsp");
	     	
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
