package com.mostafa.sna;

public class MyApp {

	public static void main(String[] args) {

		Coach coach = new BaseBallCoach();
		Coach coach2 = new TrackCoach();
		System.out.println(coach2.getDailyWorkOut());

	}

}
