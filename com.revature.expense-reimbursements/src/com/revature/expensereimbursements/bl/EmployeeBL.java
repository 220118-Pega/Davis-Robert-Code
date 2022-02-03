package com.revature.expensereimbursements.bl;

import java.util.List;

import com.revature.expensereimbursements.dl.DBRepo;
import com.revature.expensereimbursements.models.Employee;

public class EmployeeBL implements IEmployeeBL {

	private DBRepo DBrepo;
	
	public EmployeeBL(DBRepo DBrepo) {
		this.setDBrepo(DBrepo);
	}
	
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		DBrepo.addEmployee(employee);
	}

	@Override
	public List<Employee> getEmployeeByID( ) throws Exception{
		// TODO Auto-generated method stub
		return ((IEmployeeBL) DBrepo).getEmployeeByID();
	}

	@Override
	public Employee getEmployeeById(int employee_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee verifyManager(boolean is_manager) {
		// TODO Auto-generated method stub
		return null;
	}

	public DBRepo getDBrepo() {
		return DBrepo;
	}

	public void setDBrepo(DBRepo dBrepo) {
		DBrepo = dBrepo;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeByID(int employee_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
