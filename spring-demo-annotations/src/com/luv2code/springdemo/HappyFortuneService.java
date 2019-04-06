package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	public  HappyFortuneService() {
		// TODO Auto-generated constructor stub
		System.out.println("Creating bean HappyFortuneService ");
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub

		System.out.println("print git");
		return "Happy Fortune";

	}

}
