package com.surya.test3;

import com.surya.dp.Printer3;

public class TicketBookingServlet implements Runnable {
  
	// run method 
	@Override
	public void run() {
        Printer3 p1 = Printer3.getInstance();
       System.out.println(p1.hashCode());        
	}
	
	

}
