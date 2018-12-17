package com.revature.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private Connection conn;

	public EmployeeDAOImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public List<Employee> getEmployees() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeesbyId(int empId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getManagerIdbyId(int empId) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addEmployee(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
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