package com.revature.dao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Employee;
import com.revature.util.ConnectionUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	private Connection conn;

	public EmployeeDAOImpl() {
		super();
		
		try {
			conn = ConnectionUtil.getConnection("connection.properties");
			System.out.println("connection is good");
		}
		catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> getEmployees() throws SQLException {
		// TODO Auto-generated method stub
		List<Employee> employeeList = new ArrayList<>();
		
		String sqlStmt = "SELECT *\r\n" + 
				"FROM EMPLOYEE"; 
		
		PreparedStatement pstmt = this.conn.prepareStatement(sqlStmt);
		
		ResultSet rs = pstmt.executeQuery(); 
		
		while(rs.next()) {
			Employee a = new Employee(rs.getInt("EMPID"), rs.getInt("MANID"), rs.getString("FIRSTNAME"), rs.getString("LASTNAME"), rs.getString("TITLE"));
			employeeList.add(a);
		}

		return employeeList;
	}

	@Override
	public Employee getEmployeesbyId(int empId) throws SQLException {
		
		Employee employee = null; 
		
		String sqlStmt = "SELECT *\r\n" + 
				"FROM EMPLOYEE \r\n" + 
				"WHERE EMPID = ?"; 
		
		PreparedStatement pstmt = this.conn.prepareStatement(sqlStmt);
		pstmt.setInt(1, empId);
		
		ResultSet rs = pstmt.executeQuery(); 
		
		if(rs.next()) {
			employee = new Employee(rs.getInt("EMPID"), rs.getInt("MANID"), rs.getString("FIRSTNAME"), rs.getString("LASTNAME"), rs.getString("TITLE")); 
		}
		
		return employee;
	}

	@Override
	public int getManagerIdbyId(int empId) throws SQLException {
		
		int manID = -1; 
		
		String sqlStmt = "SELECT MANID\r\n" + 
				"FROM EMPLOYEE \r\n" + 
				"WHERE EMPID = ?"; 
		
		PreparedStatement pstmt = this.conn.prepareStatement(sqlStmt);
		pstmt.setInt(1, empId);
		
		ResultSet rs = pstmt.executeQuery(); 
		
		if(rs.next()) {
			manID = rs.getInt("MANID"); 
		}
		
		return manID;
	}

	@Override
	public int addEmployee(Employee employee) throws SQLException {
		
		String sqlStmt = "INSERT INTO EMPLOYEE\r\n" + 
				"VALUES ( ?, ?, ?, ?, ?)"; 
		
//		INSERT INTO EMPLOYEE
//		VALUES (4, 101, 'Kathy', 'Wornick','Office Manager');
		
		PreparedStatement pstmt = this.conn.prepareStatement(sqlStmt);
		pstmt.setInt(1, employee.getId());
		pstmt.setInt(2, employee.getManId());
		pstmt.setString(3, employee.getFirstName());
		pstmt.setString(4, employee.getLastName());
		pstmt.setString(5, employee.getTitle());
		
		int rows = pstmt.executeUpdate();
		
		pstmt.close();
		
		return rows;
		// TODO Auto-generated method stub
	}

	@Override
	public int updateEmployee(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	

	@Override
	public int deleteAccount(int empId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addSuperior(int empId, int manId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSuperior(int empId, int manId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}