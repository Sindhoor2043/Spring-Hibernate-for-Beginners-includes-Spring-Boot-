package com.sindhoor.ex04_InjectionLiteralValuesFromPropertiesFile;

public class happyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Todat is Your Lucky Day! Enjoy..!!!";
	}
}