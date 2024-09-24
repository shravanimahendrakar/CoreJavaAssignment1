package com.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.EmpDao;
import com.app.entity.Employee;

public class SelectByIdServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));

		EmpDao dao = new EmpDao();
		Employee e = dao.getEmployeById(id);

		RequestDispatcher rd = null;
		if (e == null) {
			req.setAttribute("msg", "No record found");
			rd = req.getRequestDispatcher("success.jsp");
		} else {
			req.setAttribute("emp", e);
			rd = req.getRequestDispatcher("dispay.jsp");
		}
		rd.forward(req, res);
	}
}
