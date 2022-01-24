package com.revature.expensereimbursements.bl;

import java.util.List;

import com.revature.expensereimbursements.models.Reimbursement;

public interface IRefundBL {

	void addRefund(Reimbursement refund);

	List<Reimbursement> getRefunds();

}