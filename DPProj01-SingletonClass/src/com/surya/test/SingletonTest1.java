//printer Class
package com.surya.test;

import com.surya.dp.Printer1;

public class SingletonTest1 {

	public static void main(String[] args) throws Exception {
		
		//Class.forName("com.surya.dp.Printer");
		
          Printer1 p1 = Printer1.getInstance();
          Printer1 p2 = Printer1.getInstance();
          System.out.println(p1.hashCode()+"   "+p2.hashCode());
          System.out.println("p1==p2? "+(p1==p2));
          
		
	} // main
} // Class
  