package com.revature.stacklite.ui;

import java.util.Scanner;

import com.revature.stacklite.businesslogic.InterfaceIssueBL;
import com.revature.stacklite.models.Issues;

/**
 * class to present UI to end users to interact th program
 * @author rjdav
 *
 */
public class MainMenu {

	//the scanner is very important to a UI
	//declare it as a dependency
	private Scanner myScanner;
	
	private InterfaceIssueBL issueBL;
	
	
	//inject this dependency via constructor
	public MainMenu(Scanner myScanner, InterfaceIssueBL issueBL) {
		this.myScanner = myScanner;
		this.issueBL = issueBL;
	}
	
	public void start() {
		//method signature : access modifier, non access modifier, return type, methodName, (arguments), throws exception*
		//methodName, (argument), throws exception
		boolean keepGoing = true;
		do {
			
			System.out.println("Welcome to StackLite, what do you want to do?");
			System.out.println("[0] Create an Issue");
			System.out.println("[1] Get all issues");
			System.out.println("[X] Exit");
			
			String userInput = myScanner.nextLine();
			switch(userInput) {
			
			case "0":
				System.out.println("Creating an issue");
				createIssue();
				
				break;
				
			case "1":
				System.out.println("Getting Issues...");
				getIssues();
				break;
			case "X":
				System.out.println("Goodbye");
				keepGoing = false;
				break;
				
		default:
			System.out.println("Sorry wrong input please try again");
			}
			
		}while(keepGoing);
	}

	private void getIssues() {
		// TODO Auto-generated method stub
		for(Issues newIssue:issueBL.getIssues()) {
			
			System.out.println(newIssue);
		}
		
	}

	private void createIssue() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a title for your isse: ");
		String title = myScanner.nextLine();
		System.out.println("Enter a description for your issue: ");
		String description = myScanner.nextLine();
		Issues newIssue = new Issues(title, description);
	    //saving to storage
		issueBL.addIssue(newIssue);
		System.out.println(newIssue);
	}
}
