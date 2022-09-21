package com.surya.test3;

import com.surya.dp.Printer3;

public class SingletonTest3_Cloning {
	
	public static void main(String[] args) {
       // Get Singleton java class object
		Printer3 p1 = Printer3.getInstance();
		// do cloning on object 
		System.out.println("Cloning is Not Possible with ENUM");
        /*
          try {
			Printer3 p2 = (Printer3) p1.clone(); 
			System.out.println("Cloned object is created");
			System.out.println(p1.hashCode()+" "+p2.hashCode());
			System.out.println("p1===p2?"+(p1==p2)); 
		} catch (CloneNotSupportedException cnse) {
			 cnse.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
         */
	}
}
