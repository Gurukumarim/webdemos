package com.vfislk.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String name;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
         response.setContentType("text/html");
		
		     PrintWriter out=response.getWriter();
	          
		     String username=request.getParameter("name");
				String city=request.getParameter("city");
		   //  String studentId=request.getParameter("studentId");
				int id=Integer.parseInt(request.getParameter("studentId"));
		     
		     String language=request.getParameter("language");	
		     String hobby []=request.getParameterValues("hobby");
		     out.print("<html><body>");
		     out.print("<strong>Name:" +username+"</strong><br>");
		     out.print("<strong>city:"+city+"</strong><br>");
		     out.print("<strong>language:"+language+"</strong><br>");
		     out.print("<strong>Id:"+id+"</strong><br>");
		     
		     Stream.of(hobby).forEach(out::print);
		     
		     out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
