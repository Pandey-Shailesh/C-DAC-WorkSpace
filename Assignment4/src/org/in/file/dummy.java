package org.in.file;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class dummy {
	
		public static void main(String[] args) 
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter file path : ");
			
		    //  E:\\OOPs-Java\\MainFile.txt
	        //  E:\\OOPs-Java\\EncryptFile.txt
	        //  E:\\OOPs-Java\\DecryptFile.txt
			
			String filePath = scanner.nextLine();      
			
			System.out.println("************");
			System.out.println("Welcome to Encryption and Decryption");
			System.out.println("1) Encrypt \n"+
			                   "2) Decrypt \n"+
		                           "3) Exit");
			System.out.println("************");
			System.out.print("Enter your choice = ");
			int choice = scanner.nextInt();
			
			
			switch(choice)
			{ 	
			case 1: 
			{
				FileInputStream fileInputStream = null;
				FileOutputStream fileOutputStream = null;
				Scanner scanner2 = null;
				try 
				{
					scanner2 = new Scanner(System.in);
					System.out.print("Enter file path to create encrypt file : "); 
					
					String encryptFilePath = scanner2.nextLine();
				
					fileInputStream = new FileInputStream(filePath);
					fileOutputStream = new FileOutputStream(encryptFilePath);
					
					int iTemp;

					while ((iTemp = fileInputStream.read()) != -1) 
					{
						fileOutputStream.write(iTemp+1);				
					}
				} 

				catch (FileNotFoundException e) 
				{
					e.printStackTrace();
				} 
				
				catch (IOException e) 
				{
					e.printStackTrace();
				} 
				
				finally 
				{
					try 
					{
						if(scanner2 != null)
							scanner2.close();
						if (fileOutputStream != null)
							fileOutputStream.close();
						if (fileInputStream != null)
							fileInputStream.close();
					} 
					catch (IOException e) 
					{
						e.printStackTrace();
					}
				}
				
			}
			break;
			
			case 2:
			{
				FileInputStream fileInputStream = null;
				FileOutputStream fileOutputStream = null;
				Scanner scanner2 = null;
				try 
				{
					scanner2 = new Scanner(System.in);
					System.out.print("Enter file path to create decrypt file : "); 
					
					String decryptFilePath = scanner2.nextLine();
					
					fileInputStream = new FileInputStream(filePath);
					fileOutputStream = new FileOutputStream(decryptFilePath);
					
					int iTemp;

					while ((iTemp = fileInputStream.read()) != -1) 
					{
						fileOutputStream.write(iTemp-1);				
					}
				} 

				catch (FileNotFoundException e) 
				{
					System.out.println("handle");
					e.printStackTrace();
				} 
				
				catch (IOException e) 
				{
					e.printStackTrace();
				} 
				
				finally 
				{
					try 
					{
						if(scanner2 != null)
							scanner2.close();
						if (fileOutputStream != null)
							fileOutputStream.close();
						if (fileInputStream != null)
							fileInputStream.close();
					} 
					catch (IOException e) 
					{
						e.printStackTrace();
					}
				}
				
			}
			break;
			
			}
			scanner.close();
		}
}

