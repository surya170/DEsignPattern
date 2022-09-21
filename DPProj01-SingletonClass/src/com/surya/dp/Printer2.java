
package com.surya.dp;

import com.surya.commons.CommonsUtil;

public class Printer2 extends CommonsUtil {


	// private constructor  :: It is used to Stop creating object using new operator and Reflection API.
	private Printer2() {
		if(InnerPrinter.INSTANCE != null) 
			  throw new RuntimeException("Object is already created!!!");
		  System.out.println("Printer :: 0-Param Constructor");
	}
    
	// Nested Class or Inner Printer Class :: InnerClass Eager Instantiation
	public static class InnerPrinter {
		 private static Printer2 INSTANCE = new Printer2(); // eager Instance()
	}

	// Factory method 
	 public static Printer2 getInstance() {
		 return InnerPrinter.INSTANCE; 
      }
	 
	 // To stop cloning
	 @Override
	public Object clone() throws CloneNotSupportedException {
		 throw new CloneNotSupportedException("Cloning not allowed in singleton Printer class");
		//return InnerPrinter.INSTANCE;
	}
     // To Stop Deserialization 
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
