package com.firstproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class verifyotp
 */
public class verifyotp extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session=req.getSession();
		User user=(User) session.getAttribute("authcode");
		String vcode=req.getParameter("vcode");
		if(vcode.equals(user.getCode()))
		{
			String userName=user.getUserName();
			String Password=user.getPassword();
			String Email=user.getEmail();
			database db=new database();
			if(db.insert(userName,Email,Password))
			{
				res.sendRedirect("Home.jsp");
			}
			else
			{
				res.sendRedirect("signup.jsp");
			}
		}
		else
		{
			res.getWriter().print("Invalid code!!!!");
		}
	}

}
