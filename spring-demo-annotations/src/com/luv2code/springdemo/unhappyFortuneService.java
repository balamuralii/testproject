package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class unhappyFortuneService implements FortuneService {
	
	 public unhappyFortuneService() {
		// TODO Auto-generated constructor stub
		System.out.println("Creating bean inhappy "); 
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Creatig unhappy";
	}

}
