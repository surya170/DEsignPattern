package com.surya.dp;

public class Printer {

	private static Printer INSTANCE;

	// private constructor
	private Printer() {
		System.out.println("Printer:: 0-param Constructor ");
	}

	// static factory method
	public static Printer getInstance() {
		// singleton logic
		if (INSTANCE == null)
			INSTANCE = new Printer();
		return INSTANCE;
	}// method

	// Business method
	public void print(String msg) {
		System.out.println(msg);
	} // print()

} // class
