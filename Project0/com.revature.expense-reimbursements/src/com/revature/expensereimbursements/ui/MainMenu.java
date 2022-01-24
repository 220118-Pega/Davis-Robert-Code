package com.revature.expensereimbursements.ui;
import com.revature.expensereimbursements.models.*;

import java.util.Scanner;

import com.revature.expensereimbursements.bl.RefundBL;
import com.revature.expensereimbursements.models.Reimbursement;
import com.revature.expensereimbursements.models.Status;
import com.revature.expensereimbursements.models.Type;

public class MainMenu {

	private Scanner myscanner;
	
	private RefundBL refundBL;

	// inject this dep via constructor
	public MainMenu(Scanner myscanner, RefundBL refundBL) {
		this.myscanner = myscanner;
		this.refundBL = refundBL;
		
		
		
	
	}

	public void start() {
		// method signature : access modifier*, non access modifier*, return type,
		// methodName, (arguments), throws exceptions*
		boolean keepGoing = true;
		
		do {
			System.out.println("Welcome to Reimbursements, what do you wanna do?");
			System.out.println("[0] Create a Reimbursement");
			System.out.println("[1] View all Reimbursements ");
			System.out.println("[X] Exit ");
			
			
			String userInput = myscanner.nextLine();
			switch (userInput) {
			
			case "0": 
				System.out.println("Fetching Reimbursemt...");
				createRefund();
				break;
				
			case "1": 
				System.out.println("Retriving List...");
				getRefunds();
				break;
				
			case "X":
				
				System.out.println("Goodbye");
				keepGoing = false;
				
				default:
					System.out.println("sorry wrong input");
					break;
				
			}

		} while (keepGoing);
	}
	
	
	private void getRefunds() {
		
boolean retriving = true;
		
		do {
			System.out.println("Select which type of reimbursements you need.");
			System.out.println("[0] Lodging");
			System.out.println("[1] Travel ");
			System.out.println("[2] Food ");
			System.out.println("[3] Other");
			System.out.println("[X] Return to Main Menu");
			
			
			String userInput = myscanner.nextLine();
			switch (userInput) {
			
			case "0": 
				System.out.println("Fetching Reimbursemt...");
				createRefund();
				break;
				
			case "1": 
				System.out.println("Retriving List...");
				getRefunds();
				break;
			case "2":
				System.out.println();
				break;
				
			case "3":
				System.out.println();
				break;
				
			case "X":
				System.out.println("Returning to Main Menu...");
				retriving = false;
				
				default:
					System.out.println("sorry wrong input");
					break;
				
			}

		} while (retriving);
	
		try {
			for(Reimbursement refund: refundBL.getRefunds()) {
				
				System.out.println(refund);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void createRefund() {
		System.out.println("Enter a title for your refund: ");
		String title = myscanner.nextLine();
		System.out.println("What type of refund is it?");
		
		boolean typeSelect = true;
		do {
			System.out.println("Select which type of reimbursements you need.");
			System.out.println("[L] Lodging");
			System.out.println("[T] Travel ");
			System.out.println("[F] Food ");
			System.out.println("[O] Other");
			System.out.println("[X] Return to Main Menu");
			
			
			String userInput = myscanner.nextLine();
			Type type = null;
			switch (userInput) {
			
			case "L": 
				type=Type.valueOf("LODGING");
				break;
				
			case "T": 
				type=Type.valueOf("TRAVEL");
			
				break;
			case "F":
				type=Type.valueOf("FOOD");
				break;
				
			case "O":
				type=Type.valueOf("OTHER");
				break;
				
			case "X":
				System.out.println("Returning to Main Menu...");
				typeSelect = false;
				
				default:
					System.out.println("sorry wrong input");
					break;
				
			}

		} while (typeSelect);
	
		
		
		myscanner.nextLine();
		System.out.println("Enter refund amount: ");
		double amount = myscanner.nextDouble();
		Reimbursement refund = new Reimbursement(title, null, amount);
		System.out.println(refund);

	}
	
}
