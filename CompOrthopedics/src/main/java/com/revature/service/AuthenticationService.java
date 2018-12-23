package com.revature.service;

import com.revature.beans.Login;
import com.revature.dao.EmployeeDAO;
import com.revature.dao.EmployeeDAOImpl;
import com.revature.dao.LoginDAO;
import com.revature.dao.LoginDAOImpl;

import java.sql.SQLException;

import com.revature.beans.Employee;

public class AuthenticationService {

	public AuthenticationService() {
	}
	
	public Employee isValidUser(Login credentials) {
		Employee em = null;
		String username = credentials.getUsername();
		String password = credentials.getPassword();
		
		
		EmployeeDAO ed = new EmployeeDAOImpl();
		LoginDAO log = new LoginDAOImpl();
		
		//this is AUTHENTICATION (does the user exist in the system?)
		//now AUTHORIZATION (what can the user access within the system?) (user roles)
		//take credentials and return the User to which they belong if it exists
		
		if (username != null && password != null) {
			try {
					int empId = log.login(username, password); 

					if (empId!=0) {
							em = ed.getEmployeesbyId(empId);
					}
		    } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return em;
	}
}
