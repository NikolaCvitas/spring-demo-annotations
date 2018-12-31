package hr.nikola.spring.luv2code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("hr.nikola.spring")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public FortuneService fortuneService() {
		
		return new FortuneService();
		
	}
	
	@Bean 
	public SwimCoach swimCoach() {
		
		return new SwimCoach(fortuneService());
	}

}
