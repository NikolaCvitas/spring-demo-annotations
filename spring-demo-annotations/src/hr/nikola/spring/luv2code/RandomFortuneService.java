package hr.nikola.spring.luv2code;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements HappyFortuneService {
	
	
	private String[] data = {
			"Podatak 1", "Podatak 2", "Podatak 3"
	};
	
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);
		
		String theFortune =data[index];
		
		return theFortune;
	}

}
