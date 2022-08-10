package com.sindhoor.ex02_SetterInjection;

public class Coach implements CoachingCenter {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// no-arg constructor
	public Coach() {
		System.out.println("Track Coach:- inside no-arg constructor");
	}
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Track Coach:- inside setter method[setFortuneService()]");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getTrackInfo() {
		return "Run hard 5K";
	}
}