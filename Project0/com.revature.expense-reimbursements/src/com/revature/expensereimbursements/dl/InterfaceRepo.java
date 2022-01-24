package com.revature.expensereimbursements.dl;

import java.util.List;

//import com.revature.expensereimbursements.bl.IRefundBL;
import com.revature.expensereimbursements.models.Reimbursement;

public interface InterfaceRepo  {
	void addRefund(Reimbursement refund);
	List<Reimbursement> getRefunds();
	

}
