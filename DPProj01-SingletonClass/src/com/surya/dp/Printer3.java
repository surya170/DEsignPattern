package com.surya.dp;

public enum Printer3  implements Cloneable {
    INSTANCE;    //  Internally it is equal to  public static final INSTANCE = new Printer3();
   
	//static factory method ( optional ).
	public static Printer3 getInstance() {
		return INSTANCE;
	}
	
	//Business Method 
	public void print(String msg) 
	{
		System.out.println(msg);
	}
	
}
