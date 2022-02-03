package com.revature.expensereimbursements.ui;
import com.revature.expensereimbursements.models.*;
import com.revature.expensereimbursements.dl.*;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.expensereimbursements.bl.IRefundBL;
import com.revature.expensereimbursements.bl.IEmployeeBL;

import java.time.Instant;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class MainMenu {

	private Scanner myscanner;
	
	private IRefundBL refundBL;

	private  IEmployeeBL employeeBL;
	
	
	
	private final Logger logger = LogManager.getLogger(this.getClass());
	// inject this dep via constructor
	public MainMenu(Scanner myscanner, IRefundBL refundBL, IEmployeeBL employeeBL) {
		this.myscanner = myscanner;
		this.refundBL = refundBL;
		this.employeeBL = employeeBL;
		
		
		
	
	}

	public void start() throws Exception {
		// method signature : access modifier*, non access modifier*, return type,
		// methodName, (arguments), throws exceptions*
		boolean keepGoing = true;
		
		do {
			System.out.println("Welcome to Reimbursements, what do you wanna do?");
			System.out.println("[0] Create a Reimbursement");
			System.out.println("[1] View all Reimbursements ");
			System.out.println("[2] Find Refund by Employee ID ");
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
			case"2":
				System.out.println("Searching by ID");
				getFindbyId();
				
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
		
Type type = null;
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
				type=Type.valueOf("LODGING");
				retriving = false;
				break;
				
			case "1": 
				System.out.println("Retriving List...");
				type=Type.valueOf("TRAVEL");
				retriving = false;
				break;
			case "2":
				System.out.println("Retriving List...");
				type=Type.valueOf("FOOD");
				retriving = false;
				break;
				
			case "3":
				System.out.println("Retriving List...");
				type=Type.valueOf("OTHER");
				retriving = false;
				break;
				
			case "X":
				System.out.println("Returning to Main...");
				retriving = false;
				break;
				
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
	
	private Reimbursement getFindbyId() {
		
		
		System.out.println("Enter the id of the issue you'd like to view the solutions for: ");
	
		//String stringId = myscanner.nextLine();
		System.out.println("Select ticket By ID:");	
		
		int id = myscanner.nextInt();	
		Reimbursement foundRefund = null;
		
			
 	try {
				
				
				foundRefund = refundBL.getFindbyId(id);
				System.out.println(foundRefund);
				
				for(Reimbursement listofRefunds :foundRefund.getRefunds()) {
					System.out.println(listofRefunds);
				}
				
				//call submenu
			}catch (NullPointerException e1) {
				// TODO Auto-generated catch block
				System.out.println("Please only enter numerics");
				logger.error("Invalid user input");
				
			}catch (NumberFormatException ex) {
					System.out.println("Please only enter numerics");
					logger.error("Invalid user input");
				
			}catch(Exception e1 ) {
				System.out.println("no such refund foud, try another id");
				e1.printStackTrace();
			}
	return foundRefund;
			
 	
 	
			
		}
//	
//	String id = myscanner.nextLine();
//	// Integer.parseInt() is a method used to parse strings to integers
//	Reimbursement foundIssue;
//	for (Reimbursement listofRefunds : refundBL.getRefunds()); {
//		System.out.println(foundIssue);
//	}
//	try {
//		foundIssue = refundBL.getFindbyId(Integer.parseInt(id));
//		System.out.println(foundIssue);
//		
//		//getSolutionSubMenu();
//	} catch (NumberFormatException e1) {
//		// TODO Auto-generated catch block
//		System.out.println("Please only enter numerics");
//		logger.error("Invalid user input");
//	} catch (Exception e1) {
//		// TODO Auto-generated catch block
//		System.out.println("No such issue found, try another id");
//		logger.error("Issue not found");
//	}
//
//}

//		//System.out.println("Select ticket By ID:");	
//		
//	//	String id =  myscanner.nextLine();
//		
//		
//		
//		
	
	private void createRefund() {
		
		
		
		
		System.out.println("Enter your employee ID");
		int employee_id = Integer.parseInt(myscanner.nextLine());
		// make sure the emp id is valid
		
		//if()
		
//		System.out.println("Enter your full name:  ");
//		String employeeName = myscanner.nextLine();
		
		
		System.out.println("Enter a title for your refund: ");
		String title = myscanner.nextLine();
		System.out.println("What type of refund is it?");
		Type type = null;
		boolean typeSelect = true;
		
		do {
			System.out.println("Select which type of reimbursements you need.");
			System.out.println("[L] Lodging");
			System.out.println("[T] Travel ");
			System.out.println("[F] Food ");
			System.out.println("[O] Other");
			System.out.println("[X] Return to Main Menu");
			
			
			String userInput = myscanner.nextLine();
		
			switch (userInput) {
			
			case "L": 
				type=Type.valueOf("LODGING");
				typeSelect = false;
				break;
				
			case "T": 
				type=Type.valueOf("TRAVEL");
				typeSelect = false;
			
				break;
			case "F":
				type=Type.valueOf("FOOD");
				typeSelect = false;
				break;
				
			case "O":
				type=Type.valueOf("OTHER");
				typeSelect = false;
				break;
				
			case "X":
				System.out.println("Cancel..");
				typeSelect = false;
				
				default:
					System.out.println("sorry wrong input");
					break;
				
			}

		} while (typeSelect);
	
		
		 if(type != null) {
			 
			 
			 
		System.out.println("Enter a description :");
		
		String description = myscanner.next();
		
		System.out.println("Enter refund amount: ");
		double amount = myscanner.nextDouble();
	     int	id = employee_id;
		myscanner.nextLine();
		Reimbursement refund = new Reimbursement(title, description, type, Status.PENDING, amount, id, employee_id);
		//Reimbursement refund = new Reimbursement(title, description, type);
		refundBL.addRefund(refund);
		System.out.println(refund);
		
		 }
	}
	
//	
//	private void updateTicket() throws Exception {
////		// TODO Auto-generated method stub
//		List<Reimbursement> getAll=IRefundBL.getTickets();
//		for(Reimbursement refund: getAll) {
//			System.out.println(oneTicket);
//		}
//		System.out.println("Please Enter ticketId: ");
//		int getTicketId = Integer.parseInt(myScanner.nextLine());
//		
//		RefundTicket selectedTicket;
//		try {
//			selectedTicket = IRefundBL.getRefundById(id);
//			System.out.println("Update Status: "
//							+ "[A] Accept"
//							+ "[R] Rejected"
//							+ "[X] Exit");
//			String userInput = myScanner.nextLine().toLowerCase();
//			switch(userInput) {
//			case "a":
//				selectedTicket.setRefundStatus(Status.APPROVED);
//				IRefundBL.updateReimbursement(refund);
//				System.out.println("Ticket Approved");
//				break;
//				
//			case "d":
//				selectedTicket.setRefundStatus(Status.DECLINED);
//				IRefundBL.updateTicket(selectedTicket);
//				System.out.println("Your reimbursement was Declined");
//				break;
//				
//			case "x":
//				System.out.println("Main Menu");
//				
//			default:
//				break;
//			}
//		}catch(NumberFormatException ex) {
//			System.out.println("Numerics only");
//			
//		}
//	}

	
}
