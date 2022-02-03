package com.revature.expensereimbursements.bl;

import java.util.List;

import com.revature.expensereimbursements.models.Employee;

public interface IEmployeeBL {

	void addEmployee(Employee employee);
	
	List<Employee> getEmployees();
	
	Employee getEmployeeById (int employee_id);
	
	Employee verifyManager(boolean is_manager);

	List<Employee> getEmployeeByID(int employee_id);

	List<Employee> getEmployeeByID() throws Exception;
}
