package com.revature.expensereimbursements.utils;



import com.revature.expensereimbursements.models.*;

import io.javalin.plugin.openapi.dsl.OpenApiBuilder;
import io.javalin.plugin.openapi.dsl.OpenApiDocumentation;

/**
 * return documentation for endpoints
 *
 */
public class DocumentationFactory {
	

	public static OpenApiDocumentation getDoc(String endPoint)
	{
		switch (endPoint)
		{
		case "getRefunds":
			return OpenApiBuilder.document().operation(op -> {
				op.addTagsItem("Reimbursement");
			}).jsonArray("200", Reimbursement.class);
		case "getRefundById":
			return OpenApiBuilder.document().operation(op -> {
				op.addTagsItem("Reimbursement");
			}).json("200", Reimbursement.class);
		case "addRefund":
			return OpenApiBuilder.document().operation(op -> {
				op.addTagsItem("Reimbursement");
				
				 
            }).body(Reimbursement.class).result("201");
		case "updateRefund":
			return OpenApiBuilder.document().operation(op -> 
			{
				op.addTagsItem("Reimbursement");
			}).body(Reimbursement.class).result("201");
		case "addEmployee":
			return OpenApiBuilder.document().operation(op -> {
				op.addTagsItem("Employee");
			}).body(Employee.class).result("201");
//		case "updateSolution":
//			return OpenApiBuilder.document().operation(op -> 
//			{
//				op.addTagsItem("Solution");
//			}).queryParam("upvote", Integer.class).result("204");	
		case "getEmployeeById":
			return OpenApiBuilder.document().operation(op -> {
				op.addTagsItem("Employee");
			}).json("200", Employee.class);
		default:
			return null;
		}
	}
}
	
	
