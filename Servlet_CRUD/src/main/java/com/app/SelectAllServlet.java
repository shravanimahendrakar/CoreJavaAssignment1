package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.entity.Employee;

public class SelectAllServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "test");

			PreparedStatement ps = con.prepareStatement("select * from emp");

			ResultSet rs = ps.executeQuery();

			List<Employee> empList = new ArrayList<>();

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("salary");

				Employee e = new Employee(id, name, sal);
				empList.add(e);
			}

			req.setAttribute("empList", empList);
			RequestDispatcher rd = req.getRequestDispatcher("displayAll.jsp");
			rd.forward(req, res);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
