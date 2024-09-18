package com.jdbc.example;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDByStatement {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "test");

		Statement st = con.createStatement();

		int result = st.executeUpdate("insert into emp values (3,'shravani',1800)");

		System.out.println("Inserted records " + result);

		ResultSet rs = st.executeQuery("select * from emp");

		while (rs.next()) {
			System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getDouble("salary"));
		}

		int updateResult = st.executeUpdate("update emp set salary=399 where id=3");

		System.out.println("\nUpdated records " + updateResult);

		ResultSet rsUpdate = st.executeQuery("select * from emp where id=3");

		if (rsUpdate.next()) {
			System.out.println(
					rsUpdate.getInt("id") + " " + rsUpdate.getString("name") + " " + rsUpdate.getDouble("salary"));
		} else {
			System.out.println("No record found ");
		}

		int deleteResult = st.executeUpdate("delete from emp where id=3");

		System.out.println("\nDeleted records " + deleteResult);

	}

}
