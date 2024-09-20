package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.app.entity.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectByIdServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		
		System.out.println(id);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "test");
			
			PreparedStatement ps=con.prepareStatement("select * from emp where id=?");
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			
			
			if(rs.next()) {
				int i=rs.getInt("id");
				String name=rs.getString("name");
				int sal=rs.getInt("salary");
				
				Employee e = new Employee(id, name, sal);
				
				req.setAttribute("emp", e);
				RequestDispatcher rd=req.getRequestDispatcher("dispay.jsp");
				rd.forward(req, res);
				
			}else {
				pw.write("No record found");
			}
			pw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
