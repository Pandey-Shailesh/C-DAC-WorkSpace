package org.fi.exception;

import java.io.IOException;
import java.sql.SQLException;

import org.cdac.delhi.ConsoleInput;

public class Program {
	public static void main(String[] args) {
		int age;
		try {
			System.out.println("S1");
			System.out.println("s2");
			System.out.println("Enter the age: ");
			age = ConsoleInput.getInteger();
			if (age < 18)
				throw new IOException("Invalid statement");
			if (age > 60) 
				throw new SQLException("Invalid statement");
			System.out.println("S3");
			System.out.println("s4");
		} catch (IOException ioexp) {
			System.out.println("we are in catch of IO");
			System.out.println(ioexp);
			// System.out.println(ioexp.getMessage());
		}
		 catch (SQLException sql) {
				System.out.println("we are in catch of sql");
				System.out.println(sql);
				
			}
		finally{
			System.out.println("we are in finally");
			}
		System.out.println("Main is terminating....");
		System.out.println("hello Shailesh");
	}
}
