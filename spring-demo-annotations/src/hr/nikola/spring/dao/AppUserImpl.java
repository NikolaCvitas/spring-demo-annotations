package hr.nikola.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import hr.nikola.spring.database.DatabaseHandler;
import hr.nikola.spring.entity.AppUser;

@Component
public class AppUserImpl  {
	
	private String schema = "";
	
	private Connection conn = null;
	
	
	public AppUserImpl(DatabaseHandler databaseHandler) {
		schema = databaseHandler.getSchema();
		conn = databaseHandler.getConn();
	}
	


	/**
	 * Select all from APP_USER.
	 * @return
	 */
	public ArrayList<AppUser> getAllAppUser() {
		
		ArrayList<AppUser> list = new ArrayList<AppUser>();
		
		String selectSQL = "SELECT id, type, created_on, name, login, password FROM "+schema+".app_user ";
		
        try {
			PreparedStatement preparedStatement = conn.prepareStatement(selectSQL);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				
				AppUser au = new AppUser();
				au.setId(rs.getBigDecimal("id"));
				au.setType(rs.getString("type"));
				au.setCreated_on(rs.getTimestamp("created_on"));
				au.setName(rs.getString("name"));
				au.setLogin(rs.getString("login"));
				au.setPassword(rs.getString("password"));
				
				list.add(au);
				
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	

}
