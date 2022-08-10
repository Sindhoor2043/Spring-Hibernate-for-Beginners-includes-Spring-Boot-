package com.sindhoor.ex04_InjectionLiteralValuesFromPropertiesFile;

public class Coach implements CoachingCenter {
	
	// add a new field for mailAddress and Team
	private String mailAddress;
	private String team;
	
	// create getter/setter methods 
	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		System.out.println("inside setter method --> mailAddress:- " + mailAddress);
		this.mailAddress = mailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("inside setter method --> team:- " + team);
		this.team = team;
	}

	// no-arg constructor
	public Coach() {
		System.out.println("inside no-arg constructor");
	}
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setter method --> FortuneService()");
		this.fortuneService = fortuneService;
	}
	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getTrackInfo() {
		return "Track Coach:- Run hard 5K";
	}
}