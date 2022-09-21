package com.surya.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.surya.dp.Printer;

public class SingletonTest1_Serialization {

	public static void main(String[] args) {
           try {
			   
        	   // get  Singleton Java Class object 
        	   Printer p1 = Printer.getInstance();
        	   // Write Object Data to File using Object InputStream ( Seriallization Process)
        	   ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("printer_data.ser"));
        	   oos.writeObject(p1);
        	   oos.flush();  // writes data from buffer to destination 
        	   oos.close(); 
        	   System.out.println("Serialization is done");
        	   
		} catch (IOException ie) {
			ie.printStackTrace();
		}
         catch(Exception e) {
        	 e.printStackTrace();
         }
	}

}
