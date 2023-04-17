package org.in.file;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class File {
	public static void main(String[] args) {
		int num=0;
		while(num!=4) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter file path : ");
		
		String filePath = scanner.nextLine();      
		
		
		System.out.println("===========Welcome===========");
		System.out.println("1) Encrypt");
		System.out.println("2) Decrypt");
		System.out.println("3) Exit");
		System.out.println("=============================");
		System.out.print("Enter your choice : ");
		int choice = scanner.nextInt();
		
		
		switch(choice)
		{ 	
		case 1: 
		
			FileInputStream fileInputStream = null;
			FileOutputStream fileOutputStream = null;
			DataInputStream dataInputStream=null;
			
				System.out.print("Enter file path to create encrypt file : "); 
				String encryptFilePath = scanner.nextLine();
			
			try {
				fileInputStream = new FileInputStream(filePath);
				dataInputStream = new DataInputStream(fileInputStream);
				dataInputStream.hashCode();
				
				
				fileOutputStream = new FileOutputStream(encryptFilePath);
				
				
				
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
				
				
		break;
		
		case 2:
			 fileInputStream = null;
			 fileOutputStream = null;
			
				System.out.print("Enter file path to create decrypt file : "); 
				
				String decryptFilePath = scanner.nextLine();
				
			try {
				fileInputStream = new FileInputStream(filePath);
				fileOutputStream = new FileOutputStream(decryptFilePath);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
				
				
		case 3:
			System.out.println("Exit");
		}
		scanner.close();
		}
	}

}
