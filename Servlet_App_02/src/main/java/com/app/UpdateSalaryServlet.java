package com.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.EmpDao;

public class UpdateSalaryServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		int sal=Integer.parseInt(req.getParameter("sal"));
				
		EmpDao dao=new EmpDao();
		boolean isUpdated=dao.updateSalaryById(id, sal);
		
		RequestDispatcher rd=null;
		if(isUpdated) {
			req.setAttribute("msg", "Salary Updation successful");
			rd=req.getRequestDispatcher("success.jsp");
		}else {
			req.setAttribute("errorMsg", "Salary Updation failed");
			rd=req.getRequestDispatcher("error.jsp");
		}
		
		rd.forward(req, res);	
		
	}
}
