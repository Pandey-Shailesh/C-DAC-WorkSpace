package org.in.cdac;

import org.cdac.delhi.ConsoleInput;
import org.fi.utils.LinkedList;



//static import
//import static org.fi.utils.ConsoleInput.getInteger;
//import static org.fi.utils.ConsoleInput.getFloat;
public class Menu {
	public static void main(String[] args) {
		
		LinkedList objList = new LinkedList();
		// Employee arrEmployee[] = new Employee[100];
		// Employee objEmployee =new Employee();
		int count = 0;
		int choiceMenu = 0;

		do {
			System.out.println("=====Welcome======");
			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("3.Search");
			System.out.println("4.Save");
			System.out.println("5.Load");
			System.out.println("6.Exit");
			System.out.println("======================");
			System.out.println("Enter the  choice: ");

			choiceMenu = ConsoleInput.getInteger();

			switch (choiceMenu) {

			case 1:// Engineering Student
				System.out.println("=========================");
				int subMenu = 0;
				do {
					System.out.println("1.Manager");
					System.out.println("2.Engineer");
					System.out.println("3.Sale Person");
					System.out.println("4.Exit");
					System.out.println("=========================");
					System.out.println("Enter your Choise From Sub Menu:");
					subMenu = ConsoleInput.getInteger();

					switch (subMenu) {
					case 1:
					case 2:
					case 3: {
						Employee objEmploye = null;
						System.out.println("Enter the name: ");
						String name = ConsoleInput.getString();

						System.out.println("Enter the age: ");
						int age = ConsoleInput.getInteger();

						System.out.println("Enter the adress: ");
						String address = ConsoleInput.getString();

						System.out.println("Enter the gender: ");
						Boolean gender = ConsoleInput.getBoolean();

						System.out.println("Enter the salary: ");
						float salary = ConsoleInput.getFloat();

						if (subMenu == 1) {
							System.out.println("Enter the hra: ");
							float hra = ConsoleInput.getFloat();

							objEmploye = new Manager(name, address, age, gender, salary, hra);
						} else if (subMenu == 2) {
							System.out.println("Enter the overTime: ");
							float overTime = ConsoleInput.getFloat();
							objEmploye = new Engineer(name, address, age, gender, salary, overTime);

						} else if (subMenu == 3) {
							System.out.println("Enter the commission: ");
							float commission = ConsoleInput.getFloat();
							objEmploye = new SalePerson(name, address, age, gender, salary, commission);
						}
						objList.add(objEmploye);
					}
						break;

					case 4:
						System.out.println(" Exit");
						break;

					}

				} while (subMenu < 4);
				break;

			case 2:// Display
				System.out.println("=========================");
				System.out.println("a.Display Manager ");
				System.out.println("b.Display Engineer ");
				System.out.println("c.Display Sale Person");
				System.out.println("d. exit");
				System.out.println("======================");
				System.out.println("Enter the  choice: ");
				char choiceDisplay = ConsoleInput.getCharacter();
				switch (choiceDisplay) {

				case 'a':
				case 'b':
				case 'c': {
					Employee data = (Employee) objList.getFirst();

					while (data != null) {
						if (choiceDisplay == 'a' && (Manager) data instanceof Manager) {
							System.out.println(data);
							data = (Employee) objList.getNext();
						} else if (choiceDisplay == 'b' && (Engineer) data instanceof Engineer) {
							System.out.println(data);
							data = (Employee) objList.getNext();
						} else if (choiceDisplay == 'c' && (SalePerson) data instanceof SalePerson) {
							System.out.println(data);
							data = (Employee) objList.getNext();
						}
					}
				}
					break;
				case 'd':
					System.out.println("exit");
					break;

				case 3:// Search
					System.out.println("This is Search menu");
					System.out.println("Enter the name you want to search:");
					String value = ConsoleInput.getString();
					
					for (int iTemp = 0; iTemp <= count; iTemp++) {
						if (arrEmployee[iTemp] instanceof Engineer) {
							Engineer engineer = (Engineer) arrEmployee[iTemp];
							if(value.equals(engineer.name)) {
							System.out.println(engineer.getName());
							System.out.println("Engg.");
							}
						}
						else if (arrEmployee[iTemp] instanceof SalePerson) {
							SalePerson salePerson = (SalePerson) arrEmployee[iTemp];
							if(value.equals(salePerson.name)) {
							System.out.println(salePerson.getName());
							System.out.println("sale Person");
							}
						}
						else if (arrEmployee[iTemp] instanceof Manager) {
							Manager manager = (Manager) arrEmployee[iTemp];
							if(value.equals(manager.name)) {
								System.out.println(manager.getName());
								System.out.println("manager");
								}
						}
					}
					break;

				case 4:// save
					System.out.println("You save the DATA");
					break;

				case 5:// Exit
					System.out.println("Thank you for using it...");

					break;
				}
			}
		} while (choiceMenu < 7);

	}
}