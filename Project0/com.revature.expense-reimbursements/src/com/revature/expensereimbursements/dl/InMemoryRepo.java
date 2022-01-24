package com.revature.expensereimbursements.dl;
import com.revature.expensereimbursements.models.*;

import java.util.ArrayList;
import java.util.List;

import com.revature.expensereimbursements.models.Reimbursement;

public class InMemoryRepo implements InterfaceRepo {
	
	private static ArrayList<Reimbursement> listofRefunds;
	private static int latestId;
	
	
	
	
	public  InMemoryRepo() {
		
		listofRefunds = new ArrayList<Reimbursement>(){{
			
			add(new Reimbursement("title of refund", null, null, 20.00, 1 ));
			add(new Reimbursement("title of refund, ", null, null, 35.00, 2));
		}};
		
		latestId = 3;
	}
	
	
	
	
	@Override
	public void addRefund(Reimbursement refund) {
		// TODO Auto-generated method stub
		refund.setId(latestId);
		listofRefunds.add(refund);
		latestId++;
		
	}
	@Override
	public List<Reimbursement> getRefunds() {
		// TODO Auto-generated method stub
		return listofRefunds;
	}
	
	

}
