package com.revature.expensereimbursements.models;

public class Reimbursement {
	private String title;
	

	private Type type;
	private Status status;
	
	
	private double amount;
	private int id;
	
	//private Instant timeStamp;

	
	public Reimbursement(String title, Type type, double amount) {
		this.title = title;
		this.type = type;
		this.amount = amount;
		
		this.status =Status.PENDING;
	}
	
	public Reimbursement(String title, Type type, Status status, double amount, int id) {
		this.title = title;
		this.type = type;
		this.status =Status.PENDING;
		this.amount = amount;
		this.id = id;
		
	}
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
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

	@Override
	public String toString() {
		return "Reimbursement [title=" + title + ", type=" + type + ", status=" + status + ", amount=" + amount
				+ ", id=" + id + "]";
	}

	

}
