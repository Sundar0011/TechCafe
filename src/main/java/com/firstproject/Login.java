package com.firstproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String Email=request.getParameter("Email");
		String Password=request.getParameter("Password");
		String name="";
		String code="";
		User user=new User(name,Email,Password,code);
		database db=new database();
		if(db.checklogin(Email))
		{
			response.sendRedirect("Success.jsp");
		}
		else
		{
			response.sendRedirect("Success.jsp");
		}
	}

}
