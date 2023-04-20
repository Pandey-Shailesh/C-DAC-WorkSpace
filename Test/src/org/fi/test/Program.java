package org.fi.test;

import java.util.Iterator;
import java.util.function.Supplier;

public class Program {
public static void main(String[] args) {
	

     Supplier<String>otpGenerator =()->{
											char vowels[] = {'A','E','I','O','U'};
											int  vowelsIndex= (int)(Math.random()*5);
											String otp =String.valueOf(vowels[vowelsIndex]);
											for(int iTemp=0;iTemp<6;iTemp++) {
												int random =  (int)(Math.random()*10);
												otp+=String.valueOf(random);
											}
											return otp;
										     };
										     
	for (int iTemp = 0; iTemp < 1; iTemp++) {
	System.out.println(otpGenerator.get());
	}
}
}
