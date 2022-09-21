package com.surya.test;

import java.lang.reflect.Constructor;

import com.surya.dp.Printer1;

public class SingletonTest01_ReflectionApi {

	public static void main(String[] args) {
        // get single object of singleton java class using static factory method
		Printer1 p1 = Printer1.getInstance();
		try {
			 // get java.lang.class object represening Printer class
			Class c = p1.getClass(); // getClass() is public method  of java.lang.Object class
			// get All The Constructors of the Printer class
			Constructor[] cons = c.getDeclaredConstructors();
			cons[0].setAccessible(true);  // give accessed to private constructor.
			// create object using  the accessed private Constructor 
			Printer1 p2 = (Printer1) cons[0].newInstance();
			Printer1 p3 = (Printer1) cons[0].newInstance();
			System.out.println("Objects Are Created by Using Reflection API");
			System.out.println(p1.hashCode()+" "+p2.hashCode()+" "+p3.hashCode());
			
		} catch(InstantiationException ise) { 
			ise.printStackTrace();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	} //Main 

} // Class
