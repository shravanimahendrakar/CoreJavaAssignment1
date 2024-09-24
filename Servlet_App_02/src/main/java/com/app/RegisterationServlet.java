package com.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.EmpDao;
import com.app.entity.Employee;

public class RegisterationServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		int sal=Integer.parseInt(req.getParameter("sal"));
		
		Employee e=new Employee(id,name,sal);		
			
		EmpDao dao=new EmpDao();
		boolean isRegistered=dao.register(e);
		
		RequestDispatcher rd=null;
		if(isRegistered) {
			req.setAttribute("msg", "Register successful");
			rd=req.getRequestDispatcher("success.jsp");
		}else {
			req.setAttribute("errorMsg", "Register failed");
			rd=req.getRequestDispatcher("error.jsp");
		}
		
		rd.forward(req, res);
	}
}
