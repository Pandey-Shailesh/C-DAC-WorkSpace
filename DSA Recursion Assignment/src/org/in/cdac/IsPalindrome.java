package org.in.cdac;

import java.util.Scanner;

public class IsPalindrome {
	public static boolean isPalindrome(String str) {
	    if (str.length() <= 1) {
	        return true;
	    }
	    char firstChar = str.charAt(0);
	    char lastChar = str.charAt(str.length()-1);
	    if (firstChar != lastChar) {
	        return false;
	    }
	    String subStr = str.substring(1, str.length()-1);
	    return isPalindrome(subStr);
	}
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scr.next();
		boolean isPalindrome = isPalindrome(str);
		System.out.println(isPalindrome);
		scr.close();
	}
}
