package com.revature.stacklite.datalayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.revature.stacklite.models.Issues;

/**
 * 
 * Repository that connects to an in memory storage that is a static list of issues and solutions
 * @author rjdav
 *
 */
public class InMemoryRepo implements InterfaceRepo{
	
	private static List<Issues> ListofIssues;
	private static int LatestID;
	
	public InMemoryRepo() {
		ListofIssues =  Arrays.asList(
			new Issues("Code doesnt work, why??" , "My code doesnt work I dont know why", 1),
			new Issues("Code doesnt work, why??" , "My code doesnt work I dont know why", 2));
			
		
		LatestID = 3;
	}

	@Override
	public void addIssue(Issues newIssue) {
		// TODO Auto-generated method stub
		
		newIssue.setId(LatestID);
		ListofIssues.add(newIssue);
		LatestID++;
		
	}

	@Override
	public List<Issues> getIssues() {
		// TODO Auto-generated method stub
		return ListofIssues;
	}
	

}
