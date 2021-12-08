package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;



import utility.Connect;

public class Employee extends Model {
	private String id;
	private String gender;
	private String roleId;
	private String name;
	private String username;
	private String status;
	private int salary;
	private String password;
	
	
	
	public Employee(String id, String gender, String roleId, String name, String username, String status, int salary,
			String password) {
		super();
		this.id = id;
		this.gender = gender;
		this.roleId = roleId;
		this.name = name;
		this.username = username;
		this.status = status;
		this.salary = salary;
		this.password = password;
	}



	public static Employee authLogin(String username, String password) {
		PreparedStatement ps = Connect.getConnection().createPreparedStatement("SELECT * FROM employee WHERE password = ? AND employeeUserName = ? AND employeeStatus = ?");
		ResultSet rs = null;
		try {
			ps.setString(1, password);
			ps.setString(2, username);
			ps.setString(3, "Active");
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Employee result = null;
		
		try {
			if(!rs.isBeforeFirst()) {
				return result;
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
		}
		try {
			rs.next();
			result = new Employee(rs.getString("employeeId"), 
					rs.getString("employeeGender"), rs.getString("employeeRoleId"), rs.getString("employeeName"), 
					rs.getString("employeeUserName"), rs.getString("employeeStatus"), rs.getInt("employeeSalary"), rs.getString("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		}
		return result;
	}



	public String getId() {
		return id;
	}



	public String getGender() {
		return gender;
	}



	public String getRoleId() {
		return roleId;
	}



	public String getName() {
		return name;
	}



	public String getUsername() {
		return username;
	}



	public String getStatus() {
		return status;
	}



	public int getSalary() {
		return salary;
	}



	public String getPassword() {
		return password;
	}
	
	
}
