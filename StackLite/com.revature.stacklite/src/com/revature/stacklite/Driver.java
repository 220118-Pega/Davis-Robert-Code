package com.revature.stacklite;

import java.util.Scanner;

import com.revature.stacklite.businesslogic.IssueBL;
import com.revature.stacklite.datalayer.InMemoryRepo;

import com.revature.stacklite.ui.MainMenu;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Issues testIssues = new Issues();

     //  System.out.println(testIssues);
       
       
       MainMenu menu = new MainMenu(new Scanner(System.in), new IssueBL(new InMemoryRepo()));
       menu.start();
	}

}
