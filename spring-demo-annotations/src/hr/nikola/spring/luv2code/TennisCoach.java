package hr.nikola.spring.luv2code;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private HappyFortuneService happyFortuneService;

	@Override
	public String getDailyWorkout() {
		
		return "Train tennis!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return happyFortuneService.getFortune();
	}
	
	@PostConstruct
	public void doStartup() {
		System.out.println("TennisCoach doStartup");
	}
	
	@PreDestroy
	public void finalize() {
		System.out.println("TennisCoach finalize");
	}
	
	
	

}
