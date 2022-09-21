//printer Class
package com.surya.test;

import com.surya.dp.Printer1;

public class SingletonTest2_MultiThreaded  {

	public static void main(String[] args) throws Exception {
		
	  // creates threads having Servlet Class object as data
		TicketBookingServlet servlet = new TicketBookingServlet();
		Thread t1 = new Thread(servlet);
	    Thread t2 = new Thread(servlet);
	    Thread t3 = new Thread(servlet);
	     
	    t1.start();
	    t2.start();
	    t3.start();
	    
	    
	} // main
} // class
  