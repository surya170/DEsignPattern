//printer Class
package com.surya.test2;

import com.surya.dp.Printer2;

public class SingletonTest2 {

	public static void main(String[] args) throws Exception {
		
		//Class.forName("com.surya.dp.Printer");
		
          Printer2 p1 = Printer2.getInstance();
          Printer2 p2 = Printer2.getInstance();
          System.out.println(p1.hashCode()+"   "+p2.hashCode());
          System.out.println("p1==p2? "+(p1==p2));
          
		
	} //main
} // Class
  