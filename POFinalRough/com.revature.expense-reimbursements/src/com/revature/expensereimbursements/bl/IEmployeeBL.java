package com.revature.expensereimbursements.bl;

import java.util.List;

import com.revature.expensereimbursements.models.Employee;

public interface IEmployeeBL {


	
	List<Employee> getEmployees();
	
	Employee getEmployeeById (int employeeID);
	
	Employee verifyManager(boolean is_manager);





	void add(Employee newObject);
}
