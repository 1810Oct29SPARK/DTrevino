package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Reimbursement;

public interface ReimbursementDAO {
	
	List<Reimbursement> getReiumById(int empId) throws SQLException;
	double getReimbAmountById(int reimbId) throws SQLException;
	int addReimb(Reimbursement reimburse) throws SQLException;
	int updateReimb(Reimbursement reimburse) throws SQLException;
	int deleteReimb(int reimbId) throws SQLException;
}
