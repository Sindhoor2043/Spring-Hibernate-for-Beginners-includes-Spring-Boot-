package com.sindhoor.ex03_InjectionLiteralValues;

public class happyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "FortuneService:- Todat is Your Lucky Day! Enjoy..!!!";
	}
}