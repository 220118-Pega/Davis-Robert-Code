package com.revature.expensereimbursements.utils;

import com.revature.expensereimbursements.controllers.*;

import io.javalin.Javalin;
import io.javalin.plugin.openapi.dsl.OpenApiBuilder;

/**
 * Class in charge of mapping endpoints to the controller methods that would handle the http request
 *
 * @author MarielleNolasco
 *
 */
public class Router {
	
//	private Javalin app;
//	private IController employeeController;
//	private IController ticketController;
//
//	public Router(Javalin app, IController employeeController, IController ticketController) {
//		this.app = app;
//		this.employeeController = employeeController;
//		this.ticketController = ticketController;
//	}
//	
//	public void setUpEndPoints() {
//		app.get("/login/{id}/{pass}", employeeController.login());
//		app.get("/Employee/{employee_id}", employeeController.getById());
//		app.get("/myTickets/{employee_id}", employeeController.getById());
//		
//			// -- Manager Access --
//			app.get("/Tickets", ticketController.getAll());
//			app.get("/Tickets/{ticket_id}", ticketController.getById());
//			app.get("/Tickets/filter/{status}", ticketController.filter());
//			
//		app.post("/Employee", employeeController.add());
//		app.post("/Ticket", ticketController.add());
//		
//		app.put("/Employee/{employee_id}", employeeController.update());
//		
//			// -- Manager Access -- 
//			app.put("/Ticket/{ticket_id}", ticketController.update());
//	}
	// Your router is the front controller in the front controller design pattern 
	private Javalin app;
	private IController refundController;
	private IController employeeController;
	public Router(Javalin app, IController refundController, IController employeeController)
	{
		this.app = app;
		this.refundController = refundController;
		this.employeeController = employeeController;
	}
	
	
//	public void setUpEndPoints() {
//		//	app.get("/login/{id}/{pass}", employeeController.login());
//			app.get("/Reimbursement", refundController.getAll());
//			app.get("/Reimbursement/{id}/", refundController.getById());
//			app.post("/Reimbursement/add",  refundController.add());
//			app.post("/Employee", employeeController.add());
//		//	app.put("/Reimbursement/{id}", OpenApiBuilder.documented(DocumentationFactory.getDoc("updateSolution"), refundController.update()));
//			app.get("/Employee/{employee_id}", employeeController.getById());
//		}
//	}
	public void setUpEndPoints() {
	//	app.get("/login/{id}/{pass}", employeeController.login());
		app.get("/Reimbursement", OpenApiBuilder.documented(DocumentationFactory.getDoc("getRefunds"), refundController.getAll()));
		app.get("/Reimbursement/{id}/",  OpenApiBuilder.documented(DocumentationFactory.getDoc("getRefundById"), refundController.getById()));
		app.post("/Reimbursement/",  OpenApiBuilder.documented(DocumentationFactory.getDoc("addRefund"), refundController.add()));
		app.post("/Employee", OpenApiBuilder.documented(DocumentationFactory.getDoc("addEmployee"), employeeController.add()));
	//	app.put("/Reimbursement/{id}", OpenApiBuilder.documented(DocumentationFactory.getDoc("updateSolution"), refundController.update()));
		app.get("/Employee/{employee_id}/", OpenApiBuilder.documented(DocumentationFactory.getDoc("getEmployeeById"), employeeController.getById()));
	}

}

//app.get("/heroes", ctx -> ctx.jsonStream(heroDAO.getallHeroes()));
//	app.get("/heroes/{hero_id}", ctx -> {
//		String stringId = ctx.pathParam("hero_id");
//		int id = Integer.parseInt(stringId);
//		Hero heroById = heroDAO.getHeroById(id);
//		ctx.jsonStream(heroById);
//	});
//	app.post("/heroes", ctx -> heroDAO.addHero(ctx.bodyStreamAsClass(Hero.class)));