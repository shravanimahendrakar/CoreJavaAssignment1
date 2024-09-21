package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CRUDByPrepared {

	public static void main(String[] args) throws Exception {

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter id of employee ");
		int id=s.nextInt();
		
		System.out.println("Enter name of employee ");
		String name=s.next();
		
		System.out.println("Enter salary of employee ");
		int sal=s.nextInt();
		
		
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "test");

		PreparedStatement ps = con.prepareStatement("insert into emp values (?,?,?)");
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setDouble(3, sal);
		
		int result=ps.executeUpdate();		

		System.out.println("Inserted records " + result);

		PreparedStatement psSelect = con.prepareStatement("SELECT * FROM emp");
		ResultSet rs = psSelect.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getDouble("salary"));
		}

		
		PreparedStatement psUpdate=con.prepareStatement("update emp set salary=? where id=?");
		psUpdate.setDouble(1, 399);//for salary
		psUpdate.setInt(2, 3);//for id
		int rsUpdate=psUpdate.executeUpdate();
		
		System.out.println("\nUpdate records "+rsUpdate);
		

		PreparedStatement psUpdatedRecords=con.prepareStatement("select * from emp where id=?");
		psUpdatedRecords.setInt(1, 3);//for id
		ResultSet resultUpdated=psUpdatedRecords.executeQuery();
		
		if(resultUpdated.next()) {
			System.out.println(resultUpdated.getInt("id") + " " + resultUpdated.getString("name") + " " + resultUpdated.getDouble("salary"));
		}
		
		
		PreparedStatement psDelete=con.prepareStatement("delete from emp where id=?");
		psDelete.setInt(1, 3);
		
		int deleteResult = psDelete.executeUpdate();

		System.out.println("\nDeleted records " + deleteResult);
	}

}
