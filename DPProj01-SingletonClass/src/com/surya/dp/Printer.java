
package com.surya.dp;

import com.surya.commons.CommonsUtil;

public class Printer extends CommonsUtil {

	//private static volatile Printer INSTANCE;
	// private static Printer INSTANCE = new Printer(); // eager Instance()

	// private constructor
	private Printer() {
		if(InnerPrinter.INSTANCE != null) 
			  throw new RuntimeException("Object is already created!!!");
		  System.out.println("Printer :: 0-Param Constructor");
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
	 
	 // To stop cloning
	 @Override
	public Object clone() throws CloneNotSupportedException {
		 throw new CloneNotSupportedException("Cloning not allowed in singleton Printer class");
		//return InnerPrinter.INSTANCE;
	}
     // To Stop Deseriallization 
	 private static final long serialVersionUID = 5354353L;
	 public Object readResolve() {
		  return InnerPrinter.INSTANCE;
		 // throw new IllegalArgumentException("Deserialization is not allowed on singleton");
	 }
	// Business method
	public void print(String msg) {
		System.out.println(msg);
	} // print()

} // class
