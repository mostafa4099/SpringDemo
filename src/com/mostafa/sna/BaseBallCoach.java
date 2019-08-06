package com.mostafa.sna;

public class BaseBallCoach implements Coach{
	
	private FortuneService fortuneService;
	
	
	public BaseBallCoach() {
//		System.out.println("BaseBall Coach: inside the no-arg constructor.");
	}


	public BaseBallCoach(FortuneService fortuneService) {
//		System.out.println("BaseBall Coach: inside the arg constructor.");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkOut() {
		return "Spend 30 minute in batting practice";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
