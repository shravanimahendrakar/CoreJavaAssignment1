package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.app.entity.Employee;
import com.app.utility.ConnectionFactory;

public class EmpDao  {

	public boolean register(Employee emp) {
		try {
			Connection con = ConnectionFactory.getCon();

			PreparedStatement ps = con.prepareStatement("insert into emp values (?,?,?)");
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setInt(3, emp.getSal());

			int result = ps.executeUpdate();
			if (result == 1)
				return true;

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateSalaryById(int id, int sal) {
		try {

			Connection con = ConnectionFactory.getCon();

			PreparedStatement ps = con.prepareStatement("update emp set salary=? where id=?");
			ps.setInt(1, sal);
			ps.setInt(2, id);
			int result = ps.executeUpdate();

			if (result == 1)
				return true;

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public Employee getEmployeById(int id) {
		try {
			Connection con = ConnectionFactory.getCon();
			
			PreparedStatement ps = con.prepareStatement("select * from emp where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int i = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("salary");

				Employee e = new Employee(id, name, sal);

				return e;

			}
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Employee> getAllEmployee(){
		try {
			Connection con = ConnectionFactory.getCon();
			
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

			return empList;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
