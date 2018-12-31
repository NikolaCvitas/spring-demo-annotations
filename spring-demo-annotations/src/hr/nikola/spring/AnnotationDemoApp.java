package hr.nikola.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hr.nikola.spring.luv2code.Coach;
import hr.nikola.spring.luv2code.SportConfig;
import hr.nikola.spring.luv2code.SwimCoach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		Coach tCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(tCoach.getDailyWorkout());
		System.out.println(tCoach.getDailyFortune());
		
		
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		
		System.out.println(swimCoach.getEmail());
		System.out.println(swimCoach.getTeam());
		
		
		context.close();

	}

}
