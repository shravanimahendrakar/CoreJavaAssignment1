package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterationServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		int sal=Integer.parseInt(req.getParameter("sal"));
		
		System.out.println(id+" "+name+" "+sal);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//jdbc:mysql://localhost:3306/employee", "root", "test"
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","test");
			
			PreparedStatement ps=con.prepareStatement("insert into emp values (?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, sal);
			
			ps.executeUpdate();
			
			con.close();
			
			res.setContentType("text/html");
			
			PrintWriter pw=res.getWriter();
			pw.write("<h2>Register successfully</h2> ");
			
			pw.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
