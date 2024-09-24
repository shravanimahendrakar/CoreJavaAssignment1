package com.app;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.EmpDao;
import com.app.entity.Employee;

public class SelectAllServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");

		EmpDao dao = new EmpDao();
		List<Employee> list = dao.getAllEmployee();

		RequestDispatcher rd = null;
		if (list == null) {
			req.setAttribute("msg", "No record found");
			rd = req.getRequestDispatcher("success.jsp");
		} else {
			req.setAttribute("empList", list);
			rd = req.getRequestDispatcher("displayAll.jsp");
		}
		rd.forward(req, res);
	}
}
