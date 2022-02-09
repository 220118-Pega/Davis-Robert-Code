package com.revature.expensereimbursements.controllers;

import java.util.ArrayList;
import java.util.List;

import com.revature.expensereimbursements.bl.IRefundBL;
import com.revature.expensereimbursements.models.Reimbursement;

import io.javalin.http.Handler;

public class RefundController implements IController {

	private IRefundBL refundBL;
	
	
	
	public RefundController(IRefundBL refundBL) {
		
		this.refundBL = refundBL;
	}

	@Override
	public Handler  getAll() {
		// TODO Auto-generated method stub
		
		
		return ctx -> { 
			
			List<Reimbursement> listofRefunds = new ArrayList<Reimbursement>();
			listofRefunds = refundBL.getRefunds();
			
			ctx.jsonStream(listofRefunds);
		};
	}

	@Override
	public Handler getById() {
		// TODO Auto-generated method stub
		return ctx -> {
			//get id of solution we want from the path param, 
			// we extract it from the ctx 
			
			String id = ctx.pathParam("id");
			int actualId = Integer.parseInt(id);
			try {
				ctx.jsonStream(refundBL.getFindbyId(actualId));
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
			Reimbursement newObject = ctx.bodyAsClass(Reimbursement.class);
			try {
				refundBL.add(newObject);
				ctx.status(201);
			} catch (Exception e)
			{
				ctx.status(400);
			}
			
			
		};
	}


//	@Override
//	public Handler add() {
//		// TODO Auto-generated method stub
//		return ctx -> {
//			refundBL.addRefund(ctx.bodyStreamAsClass(Reimbursement.class));
//	};
	
//	@Override
//	public Handler update() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
	

