package com.revature.stacklite.businesslogic;

import java.util.List;

import com.revature.stacklite.models.Issues;
import com.revature.stacklite.datalayer.InterfaceRepo;

/**
 * business logic issue class
 * @author rjdav
 *
 */
public class IssueBL implements InterfaceIssueBL {
	
	private InterfaceRepo repo;
	
	public IssueBL(InterfaceRepo repo) {
		this.repo = repo;
	}

	@Override
	public void addIssue(Issues newIssue) {
		//call my data layer
		repo.addIssue(newIssue);
		
	}
	
	@Override
	public List<Issues> getIssues(){
		return repo.getIssues();
	}
}
