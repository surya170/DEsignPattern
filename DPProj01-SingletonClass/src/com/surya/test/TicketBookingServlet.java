package com.surya.test;

import com.surya.dp.Printer1;

public class TicketBookingServlet implements Runnable {
  
	// run method 
	@Override
	public void run() {
        Printer1 p1 = Printer1.getInstance();
       System.out.println(p1.hashCode());        
	}
	
	

}
