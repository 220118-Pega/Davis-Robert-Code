package com.revature.expensereimbursements.bl;


import java.util.List;

import com.revature.expensereimbursements.models.Reimbursement;

public interface IRefundBL {

	void addRefund(Reimbursement refund);

	List<Reimbursement> getRefunds() throws Exception ;
	
	 Reimbursement getFindbyId(int id) ;
		// TODO Auto-generated method stub
		
	
	void update(Reimbursement newObject);

	void getFindbyId(Integer id);

	void add(Reimbursement newObject);

}