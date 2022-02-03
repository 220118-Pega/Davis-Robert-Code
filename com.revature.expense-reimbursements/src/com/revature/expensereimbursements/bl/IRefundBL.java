package com.revature.expensereimbursements.bl;


import java.util.List;

import com.revature.expensereimbursements.models.Reimbursement;

public interface IRefundBL {

	void addRefund(Reimbursement refund);

	List<Reimbursement> getRefunds() throws Exception ;
	
	 Reimbursement getFindbyId(int id) ;
		// TODO Auto-generated method stub
		
	
	void updateReimbursement(Reimbursement refund);

	void getFindbyId(Integer id);

}