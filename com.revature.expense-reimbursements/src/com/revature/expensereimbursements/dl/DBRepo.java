package com.revature.expensereimbursements.dl;

import java.util.List;

import com.revature.expensereimbursements.models.Employee;
import com.revature.expensereimbursements.models.Reimbursement;

public class DBRepo implements InterfaceRepo {
	
	private DAO<Reimbursement, Integer> RefundDAO;
	
	private DAO<Employee, Integer> EmployeeDAO;
	//add another DAO if applicable
	//db repo constructor
	
	public DBRepo(DAO<Reimbursement, Integer> RefundDAO, DAO<Employee, Integer> EmployeeDAO) {
		
		this.RefundDAO = RefundDAO;
		this.EmployeeDAO = EmployeeDAO;
	}

	@Override
	public void addRefund(Reimbursement refund) {
		// TODO Auto-generated method stub
		RefundDAO.add(refund);
		
	}

	@Override
	public List<Reimbursement> findAll() throws Exception {
		// TODO Auto-generated method stub
		return RefundDAO.findAll();
	}

	@Override
	public Reimbursement getFindbyId(int id) {
		// TODO Auto-generated method stub
		return RefundDAO.getFindbyId(id);
	}

	//@Override
	//public void updateReimbursement(Reimbursement refund) {
		// TODO Auto-generated method stub
	//	return null;
	//}

	@Override
	public void addEmployee(Employee Employee) {
		// TODO Auto-generated method stub
		EmployeeDAO.add(Employee);
	}

	@Override
	public Employee getEmployeeById(int employee_id) {
		// TODO Auto-generated method stub
		return EmployeeDAO.findbyId(employee_id);
	}

	@Override
	public List<Employee> getEmployees() throws Exception {
		// TODO Auto-generated method stub
		return EmployeeDAO.findAll();
	}

	@Override
	public void updateEmployee(Employee Employee) {
		// TODO Auto-generated method stub
		EmployeeDAO.update(Employee);
	}

	@Override
	public void updateReimbursement(Reimbursement refund) {
		// TODO Auto-generated method stub
		
	}

}
