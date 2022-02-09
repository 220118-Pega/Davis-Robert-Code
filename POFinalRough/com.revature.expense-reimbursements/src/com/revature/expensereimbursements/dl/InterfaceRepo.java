package com.revature.expensereimbursements.dl;

import java.util.List;

import com.revature.expensereimbursements.models.Employee;
//import com.revature.expensereimbursements.bl.IRefundBL;
import com.revature.expensereimbursements.models.Reimbursement;

public interface InterfaceRepo  {

	List<Reimbursement> findAll() throws Exception;

	void updateReimbursement(Reimbursement refund);
	
	Employee getEmployeeById(int employee_id);
	List<Employee>getEmployees() throws Exception;
	void updateEmployee(Employee Employee);
	Reimbursement getFindbyId(int id);
	void add(Reimbursement newObject);
	void add(Employee newObject);
	
	

}
