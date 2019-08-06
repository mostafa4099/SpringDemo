package com.mostafa.sna;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
//		System.out.println("Track Coach: inside the no-arg constructor.");
	}

	public TrackCoach(FortuneService fortuneService) {
//		System.out.println("Track Coach: inside the arg constructor.");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do IT: "+fortuneService.getFortune();
	}
	
//	init method
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: inside method doMyStartUpStuff");
	}
	
//	destroy method
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach: inside method doMyCleanUpStuff");
	}

}
