package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier("unhappyFortuneService") FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand vally";
	}
	
	public String getDailyFortunee() {
		return "tennisCoach Fortune"+"   "+fortuneService.getDailyFortune();
		
	}
//	@Autowired
//	@Qualifier("happyFortuneService")
//	public void setFortunService(FortuneService fortuneService) {
//	this.fortuneService = fortuneService;
//	System.out.println("inside setter method"+fortuneService.getDailyFortune());
//	}

}
