package com.revature.main;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Employee;
import com.revature.beans.Login;
import com.revature.dao.EmployeeDAO;
import com.revature.dao.EmployeeDAOImpl;
import com.revature.dao.LoginDAO;
import com.revature.dao.LoginDAOImpl;
import com.revature.util.ConnectionUtil;


public class CompOrthoEmployee {

	public static void main(String[] args) {
		
		
		EmployeeDAO ed = new EmployeeDAOImpl();
		LoginDAO log = new LoginDAOImpl();

		Employee emp8 = new Employee(8, 0, "Stewie", "Griffin","Janitor"); 
		
		try {
//		 	getEmployees(ed.getEmployees()); 
//			getEmployeebyId(ed.getEmployeesbyId(1)); 
//			addEmployee(ed.addEmployee(emp8)); 
			login(log.login("MSacheen", "theDoc")); 
		
			//(4, 101, 'Kathy', 'Wornick','Office Manager');
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<Employee> getEmployees(List<Employee> employeeList) {
		
		for (Employee a: employeeList) {
			System.out.println(a);
		}
		
		return employeeList; 
	}
	
	public static Employee getEmployeebyId(Employee employee) {
		System.out.println(employee);
		return employee; 
	}
	
	public static int getManbyId(int manId) {
		System.out.println("This is the manager: " + manId);
		return manId; 
	}
	
	public static int addEmployee(int addEmp) {
		System.out.println("This is the manager: " + addEmp);
		return addEmp; 
	}
	
	public static int login(int empID) {
		System.out.println("This is the empID: " + empID);
		return empID; 
	}
	
	

}
