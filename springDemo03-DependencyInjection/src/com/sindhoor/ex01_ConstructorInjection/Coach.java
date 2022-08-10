package com.sindhoor.ex01_ConstructorInjection;

public class Coach implements CoachingCenter {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public Coach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getBaseballInfo() {
		return "BaseBall Coaching Tips:-\n1.Being flexible with time given to the rotation...\r\n"
				+ "2.If your behind, don't rush through to finish...\r\n"
				+ "3.Don't have stations set up where they need to perform a skill x number of times...";
	}

	@Override
	public String getCricketInfo() {
		return "\nCricket Coach Tips:-\n1.Constructing the Mental Attitude towards the Game...\r\n"
				+ "2.Control and Discipline. No player is bigger than the game...\r\n"
				+ "3.Teaching a Beginner...";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneSevice to get fortune
		return fortuneService.getFortune();
	}
}