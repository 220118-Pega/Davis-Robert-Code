package com.revature.expensereimbursements.dl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.revature.expensereimbursements.models.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class RefundDAO  implements DAO<Reimbursement, Integer>{
	
	private final Logger logger = LogManager.getLogger(this.getClass());

	@Override
	public Reimbursement getFindbyId(Integer id) {
		// TODO Auto-generated method stub
		//try wit resources block, after the try block finishes executing it disposes of the resources for me
	//	ArrayList<Reimbursement> listofRefunds = new ArrayList<Reimbursement>();
		try (Connection connect = ConnectionFactory.getInstance().getConnection())
				{
					
			String query = "select * from Reimbursements where id = ?";
			PreparedStatement pstmt = connect.prepareStatement(query);
			pstmt.setInt(1, id);
			
			//executeQuery - used for executing select commands
			//result set - holds the results from the database
			ResultSet rs = pstmt.executeQuery();
			//we need to unpack result set to return something to end user
			if(rs.next())
			{			
//				RefundTicket myTicket = new RefundTicket();
					
	//		myTicket.setTicketId(myId);		
				
				return new Reimbursement(rs.getString("title"), rs.getString("description"),Type.valueOf(rs.getString("reimbursement_type")), Status.valueOf(rs.getString("status")),
						(rs.getTimestamp("refund_time").toInstant()),  rs.getDouble("amount"), rs.getInt("id"), rs.getInt("employee_id"));
				
			//	listofRefunds.add(
					//	 Reimbursement(title, description,type,status,timeStamp, amount,id,employee_id));
				
//				if(timeStamp==null) {
//					logger.error("Timestamp not found");
//				}
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
			logger.error("Error with connecting to db");
		}
		return null;
	}
	
	@Override
	public List<Reimbursement> findAll() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Reimbursement> listofRefunds = new ArrayList<Reimbursement>();
		try(Connection connect = ConnectionFactory.getInstance().getConnection()){
			String query = "select * from reimbursements";
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				listofRefunds.add(
						new Reimbursement(
								//adding to the result set parameters associated to each column for this DAO
								rs.getString("title"), rs.getString("description"), Type.valueOf(rs.getString("reimbursement_type")), Status.valueOf(rs.getString("status")),
								(rs.getTimestamp("refund_time").toInstant()),  rs.getDouble("amount"), rs.getInt("id"), rs.getInt("employee_id"))
								
								
								
								
                 //               		rs.getString("title"), 
						//		rs.getString("description"),
					//			Type.valueOf(rs.getString("reimbursement_type")),
						//		Status.valueOf(rs.getString("status")),
							//	(rs.getTimestamp("time").toInstant()),
						//		rs.getDouble("amount"), 
						//		rs.getInt("id")),
						   //     rs.getInt("employee_id")
						
								);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("Something went wrong",e);
		} catch (NullPointerException ex) {
			ex.printStackTrace();
			
		}
		return listofRefunds;
		
	}

	@Override
	public void add(Reimbursement newObject) {
		// TODO Auto-generated method stub
		try(Connection connect= ConnectionFactory.getInstance().getConnection())
		{
			String query = "insert into reimbursements "
		
		+       "(title, description, reimbursement_type, status, amount, refund_time, employee_id ) "
		
		+		"values (?,?,?,?,?,?,?);"; 
			
			PreparedStatement pstmt = connect.prepareStatement(query);
			pstmt.setString(1, newObject.getTitle());
			pstmt.setString(2, newObject.getDescription());
			pstmt.setString(3, newObject.getType().toString());
			pstmt.setString(4, Status.PENDING.toString());
			pstmt.setDouble(5, newObject.getAmount());
			pstmt.setTimestamp(6, Timestamp.from(Instant.now()));
			pstmt.setInt(7, newObject.getEmployee_id());
		
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void update(Reimbursement newObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee findById(Integer employeeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getTicketByEmployeeId(Integer employee_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reimbursement findbyId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Reimbursement> getFindbyId(Reimbursement id) {
		// TODO Auto-generated method stub
		return null;
	}

	

/*	@Override
	public List<Employee> getEmployeeById(Integer employee_id) {
		// TODO Auto-generated method stub
		return null;
	}
	*/
	

}
