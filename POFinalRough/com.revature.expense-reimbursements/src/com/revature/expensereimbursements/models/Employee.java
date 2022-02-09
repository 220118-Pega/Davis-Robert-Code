package com.revature.expensereimbursements.models;



public class Employee {

	private int employeeID;
	private String employeeName;
	private String pass;
	
	private boolean isManager = false;
	
	
	
	
	
	



	public Employee() {
		// TODO Auto-generated constructor stub
	}

	



	public Employee(int employeeID, String employeeName, String pass, boolean isManager) {
		
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.pass = pass;
		this.isManager = isManager;
	}







	public Employee(String employeeName, String pass, boolean isManager) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.pass = pass;
		this.isManager = isManager;
	}





	public String getPass() {
		return pass;
	}





	public void setPass(String pass) {
		this.pass = pass;
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
	public boolean getIsManager() {
		return isManager;
	}
	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}





	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", pass=" + pass
				+ ", isManager=" + isManager + "]";
	}

	
}
