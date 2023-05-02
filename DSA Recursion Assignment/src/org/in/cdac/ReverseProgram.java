package org.in.cdac;

import java.util.Scanner;

public class ReverseProgram {
	public static String reverse(String str) {
	    if (str.length() == 0) {
	        return "";
	    }
	    char lastChar = str.charAt(str.length()-1);
	    String reversed = reverse(str.substring(0, str.length()-1));
	    return lastChar + reversed;
	}
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scr.next();
		System.out.println("reverse of String is"+reverse(str));
		scr.close();
	}
}
