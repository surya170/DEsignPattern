package com.surya.test3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.surya.dp.Printer1;
import com.surya.dp.Printer2;

public class SingletonTest2_DeSerialization {

	public static void main(String[] args) {
		Printer2 p1 = Printer2.getInstance();
		System.out.println(p1.hashCode());
           try {
        	   // ReCreate Object having data collect from the file using DeSeriliazation ProceSS 
        	   ObjectInputStream ois = new ObjectInputStream(new  FileInputStream("Printer_data.ser"));
        	   Printer2 p2 = (Printer2) ois.readObject();
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
        	   Printer2 p3 = (Printer2) ois.readObject();
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
