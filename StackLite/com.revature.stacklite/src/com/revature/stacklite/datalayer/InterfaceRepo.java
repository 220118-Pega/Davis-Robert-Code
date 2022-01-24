package com.revature.stacklite.datalayer;

import java.util.List;

import com.revature.stacklite.models.Issues;

/**
 * @author rjdav
 * this is a interface for my repo implementations contains the neccesary methods for providing and bridging my Business Logic needs to interact with my data storage
 */
public interface InterfaceRepo {

	 void addIssue(Issues newIssue);
	 List<Issues> getIssues();
}
