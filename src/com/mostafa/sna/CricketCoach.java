package com.mostafa.sna;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	
	public CricketCoach(FortuneService fortuneService, String email, String team) {
		this.fortuneService = fortuneService;
		this.email = email;
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("Cricket Coach: inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Cricket Coach: inside setter method - setEmail");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket Coach: inside setter method - setTeam");
		this.team = team;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling for 15 minute.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
