package com.udemy.oop.dog;

public enum Size {
	
	VERY_SMALL("XS"), SMALL("S"), AVERAGE("M"), BIG("L"), VERY_BIG("XL");
	
	Size(String abreviation) {this.abbreviation = abreviation;
	}

	private String abbreviation;

	public String getAbbreviation() {
		return abbreviation;
	}
}
