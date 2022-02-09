package com.revature.expensereimbursements.dl;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ConnectionFactory {
	
	
	private static final ConnectionFactory connectionFactory = new ConnectionFactory();
	
	private Properties props = new Properties();
	
	private final Logger logger = LogManager.getLogger(this.getClass());
	
	//force load postgres sql driver
	//creating static block to get loaded into memory at the start of program run time
	static {
		try {
			Class.forName("org.postgresql.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	}
	
	//singletons are characterized by the private constructor
	private ConnectionFactory() {
		//loading properties file that contains db config
		try {
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			props.load(loader.getResourceAsStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("Can't find db.properties file");
		}
	}
		
		//factories are charactized by some method that contains logic for object
		
		public static ConnectionFactory getInstance() {
			// if(connectionFactory == null ) connectionFactory = new ConnectionFactory();
			return connectionFactory;
				
		}
		
		
		public Connection getConnection() {
			Connection connect = null;
			
			try {
				connect = DriverManager.getConnection(props.getProperty("url"), props.getProperty("username"), props.getProperty("password"));
				
			} catch(SQLException e) {
				e.printStackTrace();
				logger.error("cant get connection");
			}
			return connect;
		}
	}


