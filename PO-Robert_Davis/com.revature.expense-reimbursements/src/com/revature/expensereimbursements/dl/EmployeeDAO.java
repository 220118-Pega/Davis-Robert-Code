package com.revature.expensereimbursements.dl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.revature.expensereimbursements.models.Employee;
import com.revature.expensereimbursements.models.Reimbursement;
import com.revature.expensereimbursements.models.Status;
import com.revature.expensereimbursements.models.Type;








	
	
	


public class EmployeeDAO implements DAO<Employee,Integer>{
	private final Logger logger = (Logger) LogManager.getLogger(this.getClass());

	
	@Override
	public List<Employee> findAll() {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		try (Connection connect = ConnectionFactory.getInstance().getConnection()){
			String query = "select * from employees";
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				
//				Map all other prop of tickets from table to objects
				// Created an object for my Employee class to map the props.				
				Employee employeeObj = new Employee();
				
				// 1). Mapping my Id from db to class object				
				int employeeID = rs.getInt("employee_id");
				
				// 2). Mapping Employee name from db to class objects
				String employeeName=rs.getString("employee_name");
				
				String pass=rs.getString("pass");
				
				Boolean isManager=rs.getBoolean("is_manager");
				
				
				
				// 4). Mapping employee phone number---->								
				
				
//				employees.add(new Employee());
				employees.add(new Employee(employeeID,employeeName, pass, isManager));
			}
		}catch(SQLException e) {
			e.printStackTrace();
			logger.error("Something went wrong",e);
		}
		return employees;
	}

	@Override
	public void add(Employee newObject) {
		// TODO Auto-generated method stub
		try(Connection conn = ConnectionFactory.getInstance().getConnection())
		{
			String query = "insert into employees"
						+ 	"(employee_name, pass, is_manager) "
						+ 	"values(?,?,?)";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, newObject.getEmployeeName());
			pstmt.setString(2, newObject.getPass());
			pstmt.setBoolean(3, newObject.getIsManager());
			//pstmt.setInt(3, newObject.getPhoneNumber());
			pstmt.execute();
			
		}catch(SQLException e) {
			e.printStackTrace();
			logger.error("Something went wrong",e);
		}
	}


	@Override
	public void update(Employee newObject) {
		// TODO Auto-generated method stub
		try (Connection conn = ConnectionFactory.getInstance().getConnection()) {
			String query = "update employees set is_Manager = ? where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setBoolean(1, !newObject.getIsManager());
			pstmt.setInt(2, newObject.getEmployeeID());
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
	

	/*@Override
	public List<Reimbursementt> filterStatus(Status status) {
		// TODO Auto-generated method stub
		return null;
	} */


	
	
	@Override
	public void addRefund(Reimbursement refund) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee findById(Integer id) {
		// TODO Auto-generated method stub
		try(Connection conn = ConnectionFactory.getInstance().getConnection())
		{
			// ? is a placeholder for parameter we'll be sending our DB						
			String query = "select * from employees where employee_id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			// executeQuery - used for executing select commands
			//	result set 	- holds the result from DB
			ResultSet rs = pstmt.executeQuery();
			// we need to unpack result set to return something to end user
			if(rs.next())        
			
			//executeQuery - used for executing select commands
			//result set - holds the results from the database
	//		myTicket.setTicketId(myId);		
				
				return new Employee(rs.getInt("employee_id"), rs.getString("employee_name"), rs.getString("pass"),rs.getBoolean("is_manager"));
				
			//
			
		}catch(SQLException e) {
			e.printStackTrace();
			logger.error("Error with connecting to db");
		}
		return null;	
		}


	

	@Override
	public Reimbursement getFindbyId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getById(Integer id) {
		// TODO Auto-generated method stub
		try(Connection conn = ConnectionFactory.getInstance().getConnection())
		{
			// ? is a placeholder for parameter we'll be sending our DB						
			String query = "select * from employees where employee_id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			// executeQuery - used for executing select commands
			//	result set 	- holds the result from DB
			ResultSet rs = pstmt.executeQuery();
			// we need to unpack result set to return something to end user
			if(rs.next())        
			
			//executeQuery - used for executing select commands
			//result set - holds the results from the database
	//		myTicket.setTicketId(myId);		
				
				return new Employee(rs.getInt("employee_id"), rs.getString("employee_name"), rs.getString("pass"),rs.getBoolean("is_manager"));
				
			//
			
		}catch(SQLException e) {
			e.printStackTrace();
			logger.error("Error with connecting to db");
		}
		return null;	
	}

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * 
	 * 
	 * 
	 *             private final Logger logger =  (Logger) LogManager.getLogger(this.getClass());
	 

	
	




	@Override
	public Employee getEmployeeById(Integer employee_id) {
		
		try(Connection connect = ConnectionFactory.getInstance().getConnection()){
			
			String query = "select * from employees where id = ?";
			PreparedStatement pstmt = connect.prepareStatement(query);	
			ResultSet rs = pstmt.executeQuery();
			pstmt.setInt(1, employee_id);
			
			
			// executeQuery - used for executing select commands
			// result set holds the result from the data based
			
			ResultSetMetaData rsmd = rs.getMetaData(); 
			int columnCount = rsmd.getColumnCount();
		/* List<Reimbursement> tickets = new ArrayList<Reimbursement>(columnCount);
			while(rs.next()) {
				int i = 1;
			while(i <= columnCount) {
			//	tickets.add(rs.getString(i++)); */
			
				
				//ArrayList<Employee> employee_ids = new ArrayList<Employee>();
				
				//we need to unpack result set to return something to end user
			/*		
					while(rs.next())
			{							
								return new Employee(rs.getInt("employe_Id"), rs.getString("employeName"), Employee.getTickets());
						
					}	catch (SQLException e) {
						
						e.printStackTrace();
						logger.error("Erroe with connectong to database");
					}
						
			}
					
			
			
			
			
			
			
				
			}
			
					
					 
	//}
		// TODO Auto-generated method stub
		//return null;
	//}



	@Override
	public List<Employee> findAll() throws Exception {
	//TODO Auto-generated method stub
		return null;
	}



	@Override
	public void add(Employee newObject) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void update(Employee newObject) {
		// TODO Auto-generated method stub
		
	}



	
	

//	@Override
	//public Employee verifyManager(boolean is_manager) {
		// TODO Auto-generated method stub
//		return null;
//	}


     */
	
	
}
