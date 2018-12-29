package hr.nikola.spring.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class DatabaseHandler {
	
	private String schema = null;
	
	
	public Connection getConn() {
		Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
			
		}catch (SQLException e) {
			System.out.println("Connection failure.");
			e.printStackTrace();
		}
		
		
		return conn;
	}


	public String getSchema() {
		return schema;
	}


	public void setSchema(String schema) {
		this.schema = schema;
	}
	
	
	

}
