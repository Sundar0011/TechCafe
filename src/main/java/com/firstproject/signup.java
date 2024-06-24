package com.firstproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Random;

/**
 * Servlet implementation class signup
 */
public class signup extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String UserName=req.getParameter("UserName");
		String Email=req.getParameter("Email");
		String Password=req.getParameter("Password");
		database db=new database();
		if(db.check(Email))
		{
			Random rnd=new Random();
			int num=rnd.nextInt(999999);
			String code=String.format("%o6",num);
			User user=new User(UserName,Email,Password,code);
			Mail mail=new Mail();
		
			if(mail.sendmail(user))
			{
				HttpSession session=req.getSession();
				session.setAttribute("authcode", user);
				res.sendRedirect("verify.jsp");
				
			}
			else
			{
				res.getWriter().print("<h1>Enter vaild Email or password!!!!</h1>");
			}
			
		}
		else
		{
			res.getWriter().print("This Email is already avilable!!! try anaother email....");
		}
	}

}
