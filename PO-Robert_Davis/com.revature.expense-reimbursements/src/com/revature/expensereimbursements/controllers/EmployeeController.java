package com.revature.expensereimbursements.controllers;

import com.revature.expensereimbursements.bl.IEmployeeBL;
import com.revature.expensereimbursements.models.Employee;

import io.javalin.http.Handler;

public class EmployeeController implements IController {

	
       private	IEmployeeBL employeeBL;
       
            
       
       
	public EmployeeController(IEmployeeBL employeeBL) {
		
		this.employeeBL = employeeBL;
	}

	@Override
	public Handler getAll() {
		// TODO Auto-generated method stub
		// our httprequest to be handled
				return ctx -> {
					// marshalling my list of issues to a json format
					// jsonStream() sets the response body to json
					ctx.jsonStream(employeeBL.getEmployees());
				};
	}

	@Override
	public Handler getById() {
		// TODO Auto-generated method stub
		return ctx -> {
			//get id of solution we want from the path param, 
			// we extract it from the ctx 
			String employeeID = ctx.pathParam("employee_id");
			int actualId = Integer.parseInt(employeeID);
			try {
				ctx.jsonStream(employeeBL.getById(actualId));
			} catch (NullPointerException ex)
			{
				ctx.status(204);
			}
			
		};
	}

	@Override
	public Handler add() {
		// TODO Auto-generated method stub
		return ctx -> {
			// unmarshall my request body into an issue class
			// bodyAsClass method unmarshalls the request body into the structure of the class you input into it
			// transforms the request body as the specified class
			Employee newObject = ctx.bodyAsClass(Employee.class);
			try {
				employeeBL.add(newObject);
				ctx.status(201);
			} catch (Exception e)
			{
				ctx.status(400);
			}
			
			
		};
	}

	@Override
	public Handler update() {
		// TODO Auto-generated method stub
		return null;
	}

}
