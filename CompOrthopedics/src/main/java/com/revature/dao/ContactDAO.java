package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.ContactInfo;

public interface ContactDAO {
	
	ContactInfo getContactById(int empId) throws SQLException;
	int updateContact(ContactInfo contact) throws SQLException;
	ContactInfo createContact(ContactInfo contact) throws SQLException; 
}
