package com.revature.expensereimbursements;

import java.util.Scanner;

import com.revature.expensereimbursements.bl.RefundBL;
import com.revature.expensereimbursements.dl.InMemoryRepo;
//import com.revature.expensereimbursements.models.Reimbursement;
import com.revature.expensereimbursements.ui.MainMenu;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Reimbursement refund = new Reimbursement("purchase of ", 20.00, 1);
		
		//System.out.println(refund);
		
		MainMenu menu = new MainMenu(new Scanner(System.in), new RefundBL(new InMemoryRepo()));
		menu.start();
	}
	
	

}
