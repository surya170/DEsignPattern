package com.surya.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.surya.dp.Printer;

public class SingletonTest1_DeSerialization {

	public static void main(String[] args) {
           try {
        	   // ReCreate Object having data collect from the file using DeSeriliazation Process 
        	   ObjectInputStream ois = new ObjectInputStream(new  FileInputStream("Printer_data.ser"));
        	   Printer p2 = (Printer) ois.readObject();
        	   p2.print("Hello");
        	   System.out.println("p2 object hashcode ::"+p2.hashCode());
        	   ois.close(); 
        	   System.out.println("Serialization is done");
        	   
		} catch (IOException ie) {
			ie.printStackTrace();
		}
         catch(Exception e) {
        	 e.printStackTrace();
         }
           System.out.println("=======================");
           try {
        	   // ReCreate Object having data collect from the file using DeSeriliazation Process 
        	   ObjectInputStream ois = new ObjectInputStream(new  FileInputStream("Printer_data.ser"));
        	   Printer p3 = (Printer) ois.readObject();
        	   p3.print("Hello");
        	   System.out.println("p3  object hashcode ::"+p3.hashCode());
        	   ois.close(); 
        	   System.out.println("Serialization is done");
        	   
		} catch (IOException ie) {
			ie.printStackTrace();
		}
         catch(Exception e) {
        	 e.printStackTrace();
         }
	}

}
