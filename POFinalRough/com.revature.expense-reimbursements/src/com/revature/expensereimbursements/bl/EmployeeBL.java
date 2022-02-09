package com.revature.expensereimbursements.bl;

import java.util.List;

import com.revature.expensereimbursements.dl.DBRepo;
import com.revature.expensereimbursements.models.Employee;

public class EmployeeBL implements IEmployeeBL {

	private DBRepo DBrepo;
	
	public EmployeeBL(DBRepo DBrepo) {
		this.DBrepo =  DBrepo;
	}
	
	@Override
	public void add(Employee newObject) {
		// TODO Auto-generated method stub
		DBrepo.add(newObject);
	}


	@Override
	public Employee getEmployeeById(int employeeID) {
		// TODO Auto-generated method stub
		return DBrepo.getEmployeeById(employeeID);
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

	

	

}
