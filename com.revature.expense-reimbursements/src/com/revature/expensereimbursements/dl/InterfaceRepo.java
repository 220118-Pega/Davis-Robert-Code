package com.revature.expensereimbursements.dl;

import java.util.List;

import com.revature.expensereimbursements.models.Employee;
//import com.revature.expensereimbursements.bl.IRefundBL;
import com.revature.expensereimbursements.models.Reimbursement;

public interface InterfaceRepo  {
	void addRefund(Reimbursement refund);
	List<Reimbursement> findAll() throws Exception;

	void updateReimbursement(Reimbursement refund);
	void addEmployee(Employee Employee);
	Employee getEmployeeById(int employee_id);
	List<Employee>getEmployees() throws Exception;
	void updateEmployee(Employee Employee);
	Reimbursement getFindbyId(int id);
	
	
	

}
