package org.fi.reflection;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the package name :  ");
			String packageName = scanner.next();
			
			System.out.println("Enter the class name :  ");
			String className =scanner.next();
			
			try {
				FileOutputStream fileOutputStream = new FileOutputStream("E:\\demo\\"+className+".java");
				try (PrintWriter out = new PrintWriter(fileOutputStream)) {
					out.println("package "+packageName+";");
					out.print("public class "+className+"; ");
					out.println("{");
					
					
					
					System.out.println("Choose the Access Specifier:");
					System.out.println("a. public");
					System.out.println("b. default");
					
					String choice = scanner.next();
					
					switch(choice) {
					case "a":
					case "b":
						if (choice=="a") {
							out.print("public");
						}
						else if (choice =="b") {
							out.print("");
						}
						System.out.println("********************");
						System.out.println("Enter the Option");
						System.out.println("1. Add Field");
						System.out.println("2. Add Method");
						System.out.println("3. Generate Class");
						System.out.println("4.Exit");
						System.out.println("*********************");
						int subChoice;
						
						do {
							 subChoice = scanner.nextInt();
							switch (subChoice) {
							case 1:
								System.out.println("1. Enter the Access Specifier");
								System.out.println("2. Enter the Data Type");
								System.out.println("3. Enter the name of the variable");
								System.out.println("4. Exit");
								System.out.println("***********************");
								int subSubChoice = scanner.nextInt();

								while (subSubChoice <4){
									if (subSubChoice == 1) {
										System.out.println("Enter the Access Specifier");
										String accessSpecifier = scanner.next();
										out.print(accessSpecifier + " ");
									}
									if (subSubChoice == 2) {
										System.out.println("Enter the Data Type");
										String dataType = scanner.next();
										out.print(dataType + " ");
									}
									if (subSubChoice == 3) {
										System.out.println("Enter the name of the variable");
										String variable = scanner.next();
										out.print(variable + ";");
									}
									subSubChoice++;
								} 
								break;

							case 2:
								System.out.println("1. Enter the Access Specifier");
								System.out.println("2. Enter the Return Type");
								System.out.println("3. Enter name of the Method ");
								System.out.println("4. Enter the parameters with name and type");
								System.out.println("5. Exit");
								subSubChoice = scanner.nextInt();

								while (subSubChoice < 5) {
									if (subSubChoice == 1) {
										System.out.println("Enter the Access Specifier");
										String accessSpecifier = scanner.next();
										out.print(accessSpecifier + " ");
									}
									if (subSubChoice == 2) {
										System.out.println("Enter the Return Type");
										String returnType = scanner.next();
										out.print(returnType + " ");
									}
									if (subSubChoice == 3) {
										System.out.println("Enter name of the Method");
										String methodName = scanner.next();
										out.print(methodName + "(");
									}
									if (subSubChoice == 4) {
//									System.out.println("how any parameter you want to pass");
//									int parameter =scanner.nextInt();

										System.out.println("Enter the parameters type");
										String parameterType = scanner.next();
										System.out.println("Enter thr parameter name");
										String parameterName = scanner.next();
										out.print(parameterType + " " + parameterName + " )");
										out.println("{");
										out.print("}");
									}

									subSubChoice++;
								} 
								break;

							case 3:

								break;

							}
						} while (subChoice<4);
						
						
					}
					out.println("");
					out.println("}");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
