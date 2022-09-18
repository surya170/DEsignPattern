
package com.surya.dp;

public class Printer {

	//private static volatile Printer INSTANCE;
	// private static Printer INSTANCE = new Printer(); // eager Instance()

	// private constructor
	private Printer() {
		System.out.println("Printer:: 0-param Constructor ");
	}

	// synchronized static factory method
	/*
	public static Printer getInstance() {
		// singleton logic
		if (INSTANCE == null) { // 1st NULL Check
			synchronized (Printer.class) {
				if (INSTANCE == null) // 2nd NULL Check
					INSTANCE = new Printer();
			}
		}
		return INSTANCE;

	} // method
	*/
	
	// Single NULL Check
	/*
	public static Printer getInstance() {
		synchronized (Printer.class) {
			 if(INSTANCE == null)
				  INSTANCE = new Printer();
		}
		return INSTANCE;
	}
	*/

	public static class InnerPrinter {
		 private static Printer INSTANCE = new Printer(); // eager Instance()
	}

	// Factory method 
	 public static Printer getInstance() {
		 return InnerPrinter.INSTANCE; 
      }

	// Business method
	public void print(String msg) {
		System.out.println(msg);
	} // print()

} // class
