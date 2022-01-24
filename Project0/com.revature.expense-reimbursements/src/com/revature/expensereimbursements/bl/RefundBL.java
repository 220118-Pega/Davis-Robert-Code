package com.revature.expensereimbursements.bl;

import java.util.List;

import com.revature.expensereimbursements.dl.InterfaceRepo;
import com.revature.expensereimbursements.models.Reimbursement;

public class RefundBL implements IRefundBL {
	
	private InterfaceRepo repo;
	public RefundBL(InterfaceRepo repo) {
		
		this.repo = repo;
	}
	@Override
	public void addRefund(Reimbursement refund) {
		
		repo.addRefund(refund);
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Reimbursement> getRefunds() {
		// TODO Auto-generated method stub
		return repo.getRefunds();
	}
	
	

}
