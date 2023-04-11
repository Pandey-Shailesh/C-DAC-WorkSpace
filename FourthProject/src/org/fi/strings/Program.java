package org.fi.strings;

public class Program {
public static void main(String[] args) {
	String str1 = "Hello";
	
	String str2 = "Hello";
	
	String str3 = "hello";
	
	String str4 = new String("Hello");
	if (str1==str2) {
		System.out.println("str1 = str2");
	} else {
		System.out.println("str1 != str2");
	}
	
	if (str3==str2) {
		System.out.println("str3 = str2");
	} else {
		System.out.println("str3 != str2");
	}
	
	if (str2==str4) {
		System.out.println("str4 = str2");
	} else {
		System.out.println("str4 != str2");
	}
	
	//==============================================
	
	StringBuffer buffer = new StringBuffer();
	buffer.append("Hello");
	buffer.append("Hi");
	buffer.append("Bye");
	buffer.append("Bye");
	String str = buffer.toString();
	System.out.println(str);
	
	//==============================================
	
	Date firstDate = new Date();
	
	
	
	
	
	
	

}
}
