package com.revature.expensereimbursements.bl;


import java.util.List;

import com.revature.expensereimbursements.dl.DBRepo;

import com.revature.expensereimbursements.models.Reimbursement;

public class RefundBL implements IRefundBL {
	
	private DBRepo DBrepo;
	
	
	public RefundBL(DBRepo DBrepo) {
		
		this.DBrepo = DBrepo;
	}
	@Override
	public void getFindbyId(Integer id) {
		
		DBrepo.getFindbyId(id);
		
	//	DBrepo.addRefund(refund);
		
	}
	@Override
	public void add(Reimbursement newObject) {
		
		DBrepo.add(newObject);
		
	//	DBrepo.addRefund(refund);
		
	}
	@Override
	public List<Reimbursement> getRefunds() throws Exception {
		// TODO Auto-generated method stub
		return DBrepo.findAll();
	}
	@Override
	public Reimbursement getFindbyId(int id){
		// TODO Auto-generated method stub
		return DBrepo.getFindbyId(id);
	}
	@Override
	public void updateReimbursement(Reimbursement refund) {
		// TODO Auto-generated method stub
		DBrepo.updateReimbursement(refund);
	}
	@Override
	public void addRefund(Reimbursement refund) {
		// TODO Auto-generated method stub
		
	}
	
	

}
