package hr.nikola.spring.luv2code;

import org.springframework.stereotype.Component;

@Component
public class FortuneService implements HappyFortuneService {

	@Override
	public String getFortune() {
		
		return "Great Fortune!!";
	}

}
