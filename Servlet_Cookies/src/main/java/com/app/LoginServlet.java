package com.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("userName");
		String password=req.getParameter("password");
		
		System.out.println(name+" "+password);
		
		RequestDispatcher rd=null;
		
		if(name.equals(password)) {
			Cookie ck=new Cookie("role", "HR");
			Cookie ck2=new Cookie("user", name);
			res.addCookie(ck2);
			res.addCookie(ck);
			req.setAttribute("msg", "Login successful");
			rd=req.getRequestDispatcher("success.jsp");
		}else {
			req.setAttribute("errorMsg", "Invalid cred...");
			rd=req.getRequestDispatcher("login.jsp");
		}
		
		rd.forward(req, res);
	}
}
