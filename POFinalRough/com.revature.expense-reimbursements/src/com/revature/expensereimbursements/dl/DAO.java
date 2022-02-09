package com.revature.expensereimbursements.dl;

import java.util.ArrayList;
import java.util.List;

import com.revature.expensereimbursements.models.Employee;
import com.revature.expensereimbursements.models.Reimbursement;

//import com.revature.expensereimbursements.models.*;

/**
 * @author rjdav
 *
 * @param <T> type of object were creating a DAO for
 * 
 * @param <K> data type of the id of the object
 */
public interface DAO<T, K> {
	
	T findbyId(K id);
	List<T> findAll() throws Exception;
	//List<Reimbursement> filterStatus(Status status);
	void add(T newObject);
	void update(T newObject);
	//void getFindbyId(Integer id);
	//Employee getEmployeeById(K employeeID);
	
	Employee findById(Integer employeeID);
	
	Reimbursement getFindbyId(Integer id);
	
	void addRefund(Reimbursement refund);

}
