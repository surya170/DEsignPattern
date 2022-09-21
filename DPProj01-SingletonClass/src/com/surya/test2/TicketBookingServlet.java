package com.surya.test2;

import com.surya.dp.Printer2;

public class TicketBookingServlet implements Runnable {
  
	// run method 
	@Override
	public void run() {
        Printer2 p1 = Printer2.getInstance();
       System.out.println(p1.hashCode());        
	}
	
	

}
