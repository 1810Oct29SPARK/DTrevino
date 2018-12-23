package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Employee;

public interface EmployeeDAO {
	
	List<Employee> getEmployees() throws SQLException; 
	Employee getEmployeesbyId(int empId) throws SQLException;
	int getManagerIdbyId(int empId) throws SQLException; 
	int addEmployee(Employee employee) throws SQLException;
	int updateEmployee(Employee employee) throws SQLException;
	int deleteAccount(int empId) throws SQLException;
	int addSuperior(int empId, int manId) throws SQLException;
	int updateSuperior(int empId, int manId) throws SQLException;
}
