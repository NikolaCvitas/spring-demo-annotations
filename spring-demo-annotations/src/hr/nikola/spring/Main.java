package hr.nikola.spring;

import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import hr.nikola.spring.dao.AppUserImpl;
import hr.nikola.spring.database.DatabaseHandler;
import hr.nikola.spring.entity.AppUser;



public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DatabaseHandler db = context.getBean("databaseHandler",DatabaseHandler.class);
		
		System.out.println("db.getSchema(): "+db.getSchema());
		
		
		AppUserImpl appUser = context.getBean("appUserImpl",AppUserImpl.class);
		
		
		ArrayList<AppUser> appList = appUser.getAllAppUser();
		
		for(AppUser element:appList) {
			System.out.println(" "+element.toString());
		}

	}

}
