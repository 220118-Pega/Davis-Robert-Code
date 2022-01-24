package com.revature.stacklite.businesslogic;

import java.util.List;

import com.revature.stacklite.models.Issues;

public interface InterfaceIssueBL {

	void addIssue(Issues newIssue);
	
	List<Issues> getIssues();
}
