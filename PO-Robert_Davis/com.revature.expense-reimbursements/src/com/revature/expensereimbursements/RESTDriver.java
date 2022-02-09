package com.revature.expensereimbursements;

import com.revature.expensereimbursements.bl.EmployeeBL;
import com.revature.expensereimbursements.bl.IRefundBL;
import com.revature.expensereimbursements.bl.RefundBL;
import com.revature.expensereimbursements.controllers.EmployeeController;
import com.revature.expensereimbursements.controllers.IController;
import com.revature.expensereimbursements.controllers.RefundController;
import com.revature.expensereimbursements.dl.DBRepo;
import com.revature.expensereimbursements.dl.EmployeeDAO;
import com.revature.expensereimbursements.dl.RefundDAO;
import com.revature.expensereimbursements.models.Reimbursement;
import com.revature.expensereimbursements.utils.Router;

import io.javalin.Javalin;
import io.javalin.plugin.openapi.OpenApiOptions;
import io.javalin.plugin.openapi.OpenApiPlugin;
import io.javalin.plugin.openapi.OpenApiOptions;
import io.javalin.plugin.openapi.OpenApiPlugin;
import io.javalin.plugin.openapi.ui.SwaggerOptions;
import io.swagger.v3.oas.models.info.Info;

public class RESTDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IController refundController = new RefundController( new RefundBL(new DBRepo(new RefundDAO(), new EmployeeDAO())));
		
		IController employeeController = new EmployeeController( new EmployeeBL(new DBRepo(new RefundDAO(), new EmployeeDAO())));

	//	Javalin app = Javalin.create(config -> config.enableCorsForAllOrigins()).start(7000);
		
		Javalin app = Javalin.create(config -> {
			config.registerPlugin(new OpenApiPlugin(getOpenApiOptions()));
		}).start(7000);
		Router router = new Router(app, refundController, employeeController);
	router.setUpEndPoints();
	}
		
//		app.get("/Reimbursement", ctx -> ctx.jsonStream(refundController.getAll()));
//		app.get("/Reimbursement/{id}", ctx -> {
//			String id = ctx.pathParam("id");
//			int actualId = Integer.parseInt(id);
//			try {
//				ctx.jsonStream(refundController.getById());
//			} catch (NullPointerException ex)
//			{
//				ctx.status(204);
//			}
//			
//		
//		
//		});
//		app.post("/Reimbursement", ctx -> refundController.add(ctx.bodyStreamAsClass(Reimbursement.class)));
//	}

	private static OpenApiOptions getOpenApiOptions() {
		// Configuring swagger
		// We'll use swagger for documentation and testing our API
		Info applicationInfo = new Info().version("1.0").description("**Employee Reimbursements** REST");
		return new OpenApiOptions(applicationInfo).path("/swagger-docs")
				.swagger(new SwaggerOptions("/swagger").title("Employee Refunds API Docs"));
	}

}
