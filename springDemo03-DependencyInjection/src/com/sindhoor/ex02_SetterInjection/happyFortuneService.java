package com.sindhoor.ex02_SetterInjection;

public class happyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Todat is Your Lucky Day! Enjoy..!!!";
	}
}