package com.revature.expensereimbursements.models;

import java.time.Instant;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Reimbursement implements List<Reimbursement> {
	private String title;
	private String description;

	private Type type;
	private Status status;
	private Instant timeStamp;
	
	
	private double amount;
	
    private int id;
	
	private int employee_id;
	
	private List<Reimbursement> listofRefunds;



	
	


	
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

	public List<Reimbursement> getRefunds() {
		// TODO Auto-generated method stub
		return listofRefunds;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Reimbursement> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Reimbursement e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Reimbursement> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Reimbursement> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Reimbursement get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reimbursement set(int index, Reimbursement element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Reimbursement element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Reimbursement remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<Reimbursement> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<Reimbursement> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reimbursement> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Reimbursement valueOf(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

}
