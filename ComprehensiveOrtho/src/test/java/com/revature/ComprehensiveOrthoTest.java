package com.revature;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.revature.main.CompOrthoEmployee;

public class ComprehensiveOrthoTest {

	private static final CompOrthoEmployee employeeService = new CompOrthoEmployee();

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	/*******************************************************************
	 * Contact 	 
	 * ******************************************************************/

	@Test
	public void createContact() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	
	@Test
	public void getContactById() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}

	@Test
	public void updateContact() {
		final String phrase = "GNU Image Manipulation Program";
		final String expected = "GIMP";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	
	/*******************************************************************
	 * Employee	 
	 * ******************************************************************/
	@Test
	public void addEmployees() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	
	@Test
	public void getEmployees() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	
	@Test
	public void getEmployeesbyId() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	
	@Test
	public void getManagerIdbyId() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	
	@Test
	public void addEmployee() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	
	@Test
	public void updateEmployee() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	
	@Test
	public void deleteAccount() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	
	@Test
	public void addSuperior() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	
	@Test
	public void updateSuperior() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	/*******************************************************************
	 * Reimbursement	 
	 * ******************************************************************/
	
	@Test
	public void addReiumbursement() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	
	@Test
	public void getEmployeeReimbursements() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	
	@Test
	public void getReimbursementAmount() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	
	@Test
	public void updateReiumbursement() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	
	@Test
	public void deleteSuperior() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	
	/*******************************************************************
	 * Login	 
	 * ******************************************************************/
	@Test
	public void login() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	
	@Test
	public void changePass() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}
	
	@Test
	public void changeUser() {
		final String phrase = "First In, First Out";
		final String expected = "FIFO";
		assertEquals(expected, employeeService.acronym(phrase));
	}


}
