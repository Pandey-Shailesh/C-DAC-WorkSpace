package org.fi.exception;

import java.io.IOException;
import java.sql.SQLException;

import org.cdac.delhi.ConsoleInput;

public class Demo {
public static void main(String[] args) {
	int age;
	String  str= null;
	System.out.println("S1");
	System.out.println("s2");
	try {
		System.out.println("S3");
		System.out.println("s4");
		
		System.out.println("Enter the age: ");
		age = ConsoleInput.getInteger();
		if (age < 18)
			throw new IOException("Invalid statement");
		if (age > 60) 
			throw new SQLException("Invalid statement");
		try {
			age=1;
			System.out.println("s5");
			System.out.println("s6");
			str.charAt(1);
			if (age<18) 
				throw new IOException("Ivvalid age");
				System.out.println("s7");
		}
		catch(NullPointerException npe) {
			System.out.println("s8");
			throw npe;
		}
		finally {
			System.out.println("s9");
		}
		System.out.println("s10");
		
	} catch (IOException ioexp) {
		System.out.println("we are in catch of IO");
		System.out.println(ioexp);
		// System.out.println(ioexp.getMessage());
	}
	 catch (SQLException sql) {
			System.out.println("we are in catch of sql");
			System.out.println(sql);
			
		}
	catch (Exception e) {
		System.out.println("we are in catch of e");
		System.out.println(e);
		
	}
	finally{
		System.out.println("we are in finally");
		}
	System.out.println("Main is terminating....");
	System.out.println("hello Shailesh");
}
}

