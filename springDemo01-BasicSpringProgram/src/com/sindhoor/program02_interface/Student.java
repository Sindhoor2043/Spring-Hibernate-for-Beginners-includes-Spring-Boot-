package com.sindhoor.program02_interface;

public class Student implements University {
	private String stName;

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}
	
	public String displayInfo() {
		return "Sindhoor Hegde";
	}
}