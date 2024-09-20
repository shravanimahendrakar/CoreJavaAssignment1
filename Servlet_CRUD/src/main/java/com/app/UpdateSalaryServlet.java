package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateSalaryServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		int sal=Integer.parseInt(req.getParameter("sal"));
		
		System.out.println(id+" "+sal);
		
		try {
	
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","test");
			PreparedStatement ps=con.prepareStatement("update emp set salary=? where id=?");
			ps.setInt(1, sal);
			ps.setInt(2, id);
			ps.executeUpdate();
			
			con.close();
			
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			pw.write("<h2>Updated successfully</h2>");
			pw.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
