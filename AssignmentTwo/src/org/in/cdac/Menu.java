//package org.in.cdac;
//
//import org.cdac.delhi.ConsoleInput;
//
//public class Menu {
//	public static void top() {
//		System.out.println("1.Add");
//		System.out.println("2.Display");
//		System.out.println("3.Sort");
//		System.out.println("4.Save");
//		System.out.println("5.Exit");
//	}
//
//	public static void insideOne() {
//		System.out.println("a.Manager");
//		System.out.println("b.Engineer");
//		System.out.println("c.Sale Person");
//		System.out.println("d.Exit");
//
//	}
//
//	public static void insideTwo() {
//		System.out.println("a. Only Manager");
//		System.out.println("b. Only Engineer");
//		System.out.println("c. Only Sale Person");
//		System.out.println("d. Only Exit");
//	}
//
//	public static void main(String[] args) {
//
//		Manager arrManager[] = new Manager[50];
//		int countManager = 0;
//		Engineer arrEngineer[] = new Engineer[50];
//		int countEngineer = 0;
//		SalePerson arrSalePerson[] = new SalePerson[50];
//		int countSalePerson = 0;
//
//		while (true) {
//			System.out.println("=================================");
//			top();
//			System.out.println("===============================");
//			System.out.println("Enter the  choice: ");
//			int choiceMenu = ConsoleInput.getInteger();
//
//			switch (choiceMenu) {
//
//			case 1:// Add
//				System.out.println("=========================");
//				insideOne();
//				System.out.println("===========================");
//				char val = 'g';
//				while (val != 'd') {
//					System.out.println("Enter the SubMenu choice:");
//					char choiceSubMenu = ConsoleInput.getCharacter();
//
//					switch (choiceSubMenu) {
//					case 'a':
//						System.out.println(" you choose  Manager");
//						System.out.println("Enter the name: ");
//						arrManager[countManager]=new Manager();
//						String name = ConsoleInput.getString();
//						arrManager[countManager].setName(name);
//
//						System.out.println("Enter the age: ");
//						int age = ConsoleInput.getInteger();
//						arrManager[countManager].setAge(age);
//
//						System.out.println("Enter the adress: ");
//						String address = ConsoleInput.getString();
//						arrManager[countManager].setAddress(address);
//
//						System.out.println("Enter the gender: ");
//						Boolean gender = ConsoleInput.getBoolean();
//						arrManager[countManager].setGender(gender);
//
//						System.out.println("Enter the salary: ");
//						float salary = ConsoleInput.getFloat();
//						arrManager[countManager].setSalary(salary);
//
//						System.out.println("Enter the hra: ");
//						float hra = ConsoleInput.getFloat();
//						arrManager[countManager].setHra(hra);
//						countManager++;
//						break;
//
//					case 'b':
//						System.out.println(" you choose  Engineer");
//						System.out.println("Enter the name: ");
//						arrEngineer[countEngineer]=new Engineer();
//						name = ConsoleInput.getString();
//						arrEngineer[countEngineer].setName(name);
//
//						System.out.println("Enter the age: ");
//						age = ConsoleInput.getInteger();
//						arrEngineer[countEngineer].setAge(age);
//
//						System.out.println("Enter the adress: ");
//						address = ConsoleInput.getString();
//						arrEngineer[countEngineer].setAddress(address);
//
//						System.out.println("Enter the gender: ");
//						gender = ConsoleInput.getBoolean();
//						arrEngineer[countEngineer].setGender(gender);
//
//						System.out.println("Enter the salary: ");
//						salary = ConsoleInput.getFloat();
//						arrEngineer[countEngineer].setSalary(salary);
//
//						System.out.println("Enter the over time: ");
//						float overTime = ConsoleInput.getFloat();
//						arrEngineer[countEngineer].setOverTime(overTime);
//						;
//						countEngineer++;
//						break;
//
//					case 'c':
//						System.out.println(" you choose  Sale Person");
//						System.out.println("Enter the name: ");
//						arrSalePerson[countSalePerson]=new SalePerson();
//						name = ConsoleInput.getString();
//						arrSalePerson[countSalePerson].setName(name);
//
//						System.out.println("Enter the age: ");
//						age = ConsoleInput.getInteger();
//						arrSalePerson[countSalePerson].setAge(age);
//
//						System.out.println("Enter the adress: ");
//						address = ConsoleInput.getString();
//						arrSalePerson[countSalePerson].setAddress(address);
//
//						System.out.println("Enter the gender: ");
//						gender = ConsoleInput.getBoolean();
//						arrSalePerson[countSalePerson].setGender(gender);
//
//						System.out.println("Enter the salary: ");
//						salary = ConsoleInput.getFloat();
//						arrSalePerson[countSalePerson].setSalary(salary);
//
//						System.out.println("Enter the over time: ");
//						float commission = ConsoleInput.getFloat();
//						arrSalePerson[countSalePerson].setCommission(commission);
//						countSalePerson++;
//
//						break;
//
//					case 'd':
//						System.out.println("Exit");
//						break;
//
//					}
//					System.out.println("===================================================");
//					insideOne();
//					System.out.println("===================================================");
//				}
//
//			case 2:// Add
//				System.out.println("=========================");
//				insideTwo();
//				System.out.println("===========================");
//				val = 'g';
//				while (val != 'd') {
//					System.out.println("Enter the choice:");
//					char value = ConsoleInput.getCharacter();
//
//					switch (value) {
//					case 'a':
//						System.out.println(" you choose only Manager");
//						for(int iTemp=0;iTemp<countManager;iTemp++) {
//						System.out.println(arrManager[countManager].getName());
//						System.out.println(arrManager[countManager].getAge());
//						System.out.println(arrManager[countManager].getAddress());
//						System.out.println(arrManager[countManager].isGender());
//						System.out.println(arrManager[countManager].getSalary());
//						System.out.println(arrManager[countManager].getHra());
//						}
//						break;
//
//					case 'b':
//						System.out.println(" you choose only Engineer");
//						for(int iTemp=0;iTemp<countEngineer;iTemp++) {
//						System.out.println(arrEngineer[countEngineer].getName());
//						System.out.println(arrEngineer[countEngineer].getAge());
//						System.out.println(arrEngineer[countEngineer].getAddress());
//						System.out.println(arrEngineer[countEngineer].isGender());
//						System.out.println(arrEngineer[countEngineer].getSalary());
//						System.out.println(arrEngineer[countEngineer].getOverTime());
//						}
//						break;
//
//					case 'c':
//						System.out.println(" you choose only Sale Person");
//						for(int iTemp=0;iTemp<countSalePerson;iTemp++) {
//						System.out.println(arrSalePerson[countSalePerson].getName());
//						System.out.println(arrSalePerson[countSalePerson].getAge());
//						System.out.println(arrSalePerson[countSalePerson].getAddress());
//						System.out.println(arrSalePerson[countSalePerson].isGender());
//						System.out.println(arrSalePerson[countSalePerson].getSalary());
//						System.out.println(arrSalePerson[countSalePerson].getCommission());
//						}
//						break;
//
//					case 'd':
//						System.out.println("Exit");
//						break;
//
//					}
//					System.out.println("===================================================");
//					insideTwo();
//					System.out.println("===================================================");
//				}
//
//			case 3:// Add
//					break;
//
//					
//					
//			case 4:// Add
//				
//				break;
//					
//
//			case 5:// Add
//				break;
//			}
//		}
//
//	}
//}
