package com.revature.expensereimbursements.models;

import java.time.Instant;


public class Reimbursement {
	private String title;
	private String description;

	private Type type;
	private Status status;
	private Instant timeStamp;
	
	
	private double amount;
	
    private int id;
	
	private int employee_id;




	
	public Reimbursement() {
		
	}


	
	public Reimbursement(String title, String description, Type type, Status status, double amount, int employee_id, int id) {
	
		this.title = title;
		this.description = description;
		this.type = type;
		this.status = status;
		this.amount = amount;
		
		this.id = id;
		this.employee_id = employee_id;
	}

	public Reimbursement(String title, String description, Type type, Status status, Instant timeStamp, double amount,
			int id, int employee_id) {
	
		this.title = title;
		this.description = description;
		this.type = type;
		this.status =  status;;
		this.timeStamp = timeStamp;
		this.amount = amount;
		this.id = id;
		this.employee_id = employee_id;
	}

	public Reimbursement(String title,String description, Status status, double amount, int id, int employee_id, Instant timeStamp) {
		this.title = title;
		this.description = description;
		this.type = null;
		this.amount = amount;
		this.id = id;
		this.employee_id = employee_id;
		this.timeStamp = timeStamp;
		
		
		this.status = status;
	}
	
	public Reimbursement(String title, Type type, Status status, double amount, int id) {
		this.title = title;
		this.type = type;
		this.status =Status.PENDING;
		this.amount = amount;
		this.id = id;
		this.employee_id = id;
		
	}
	
	public Reimbursement(String title, Type type, double amount, int id, int employee_id, Instant timeStamp) {
		this.title = title;
		this.type = type;
		this.status =Status.PENDING;
		this.amount = amount;
		this.id = id;
		this.employee_id = employee_id;
		this.timeStamp = timeStamp;
		
		// TODO Auto-generated constructor stub
	}
	
	

	public Reimbursement(String title, String description, Type type) {
		
		this.title = title;
		this.description = description;
		this.type = type;
		// TODO Auto-generated constructor stub
	}

	public Reimbursement(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	public Instant getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Instant timeStamp) {
		this.timeStamp = timeStamp;
	}

	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	@Override
	public String toString() {
		return "Reimbursement [title=" + title + ", description=" + description + ", type=" + type + ", status="
				+ status + ", timeStamp=" + timeStamp + ", amount=" + amount + ", id=" + id + ", employee_id="
				+ employee_id + "]";
	}

	

	
	

}
