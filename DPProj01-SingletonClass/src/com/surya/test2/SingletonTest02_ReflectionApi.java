package com.surya.test2;

import java.lang.reflect.Constructor;

import com.surya.dp.Printer2;

public class SingletonTest02_ReflectionApi {

	public static void main(String[] args) {
        // get single object of singleton java class using static factory method
		Printer2 p1 = Printer2.getInstance();
		try {
			 // get java.lang.class object represening printer class
			Class c = p1.getClass(); // getClass() is public method  of java.lang.Object class
			// get All The Constructors of the Printer class
			Constructor[] cons = c.getDeclaredConstructors();
			cons[0].setAccessible(true);  // give accessed to private constructor.
			// create object using  the accessed private Constructor 
			Printer2 p2 = (Printer2) cons[0].newInstance();
			Printer2 p3 = (Printer2) cons[0].newInstance();
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
