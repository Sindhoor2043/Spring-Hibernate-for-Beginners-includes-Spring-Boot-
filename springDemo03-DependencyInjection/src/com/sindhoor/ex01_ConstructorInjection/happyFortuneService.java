package com.sindhoor.ex01_ConstructorInjection;

public class happyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Todat is Your Lucky Day! Enjoy..!!!";
	}
}