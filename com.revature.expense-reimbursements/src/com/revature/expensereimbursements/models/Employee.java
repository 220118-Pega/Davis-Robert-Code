package com.revature.expensereimbursements.models;

import java.util.List;

public class Employee {

	private int employeeID;
	private String employeeName;
	
	private boolean isManager = false;
	private List<Reimbursement> tickets;
	
	
	
	
	
	public Employee(int employeeID, String employeeName, boolean isManager, List<Reimbursement> tickets) {
	
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.isManager = isManager;
		this.tickets = tickets;
	}
	
	
	
	
	public Employee(int employeeID, String employeeName, List<Reimbursement> tickets) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.tickets = tickets;
	}




	public Employee() {
		// TODO Auto-generated constructor stub
	}




	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public boolean isManager() {
		return isManager;
	}
	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}
	public List<Reimbursement> getTickets() {
		return tickets;
	}
	public void setTickets(List<Reimbursement> tickets) {
		this.tickets = tickets;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", isManager=" + isManager
				+ ", tickets=" + tickets + "]";
	}
	
}
