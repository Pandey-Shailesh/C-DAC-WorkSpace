package org.in.cdac;

import org.cdac.delhi.ConsoleInput;

public class Program {
	public static void main(String[] args) {

		Employee arrEmployee[] = new Employee[100];
		//Employee objEmployee =new Employee();
		int count = 0;
		int choiceMenu = 0;

		do {
			System.out.println("=====Welcome======");
			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("3.Search");
			System.out.println("4.Save");
			System.out.println("5.Exit");
			System.out.println("======================");
			System.out.println("Enter the  choice: ");

			choiceMenu = ConsoleInput.getInteger();

			switch (choiceMenu) {

			case 1:// Engineering Student
				System.out.println("=========================");
				int subMenu =0;
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
						System.out.println(" you choose  Manager");
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

						System.out.println("Enter the hra: ");
						float hra = ConsoleInput.getFloat();

						arrEmployee[count] = new Manager(name, address, age, gender, salary, hra);
						count++;
						break;

					case 2:
						System.out.println(" you choose  Engineer");
						System.out.println("Enter the name: ");
						name = ConsoleInput.getString();

						System.out.println("Enter the age: ");
						age = ConsoleInput.getInteger();

						System.out.println("Enter the adress: ");
						address = ConsoleInput.getString();

						System.out.println("Enter the gender: ");
						gender = ConsoleInput.getBoolean();

						System.out.println("Enter the salary: ");
						salary = ConsoleInput.getFloat();

						System.out.println("Enter the hra: ");
						float overTime = ConsoleInput.getFloat();

						arrEmployee[count] = new Engineer(name, address, age, gender, salary, overTime);
						count++;
						break;

					case 3:
						System.out.println(" you choose  SalePerson");
						System.out.println("Enter the name: ");
						name = ConsoleInput.getString();

						System.out.println("Enter the age: ");
						age = ConsoleInput.getInteger();

						System.out.println("Enter the adress: ");
						address = ConsoleInput.getString();

						System.out.println("Enter the gender: ");
						gender = ConsoleInput.getBoolean();

						System.out.println("Enter the salary: ");
						salary = ConsoleInput.getFloat();

						System.out.println("Enter the commission: ");
						float commission = ConsoleInput.getFloat();

						arrEmployee[count] = new SalePerson(name, address, age, gender, salary, commission);
						count++;
						break;

					case 4:
						System.out.println(" Exit");
						break;

					}

				} while (subMenu < 4);
				break;

			case 2:// Display
				System.out.println("=========================");
				System.out.println("a.Display Medical ");
				System.out.println("b.Display Sale Person");
				System.out.println("c.Display Engneer");
				System.out.println("======================");
				System.out.println("Enter the  choice: ");
				int choiceDisplay = ConsoleInput.getInteger();
				switch (choiceDisplay) {
				case 'a':
					for (int iTemp = 0; iTemp <= count; iTemp++) {
						if (arrEmployee[iTemp] instanceof Manager) {
							Manager manager = (Manager) arrEmployee[iTemp];
							System.out.println(manager.getName());
							System.out.println(manager.getAge());
							System.out.println(manager.getAddress());
							System.out.println(manager.getSalary());
							System.out.println(manager.isGender());
							System.out.println(manager.getHra());
						}
					}
					break;

				case 'b':
					for (int iTemp = 0; iTemp <= count; iTemp++) {
						if (arrEmployee[iTemp] instanceof SalePerson) {
							SalePerson salePerson = (SalePerson) arrEmployee[iTemp];
							System.out.println(salePerson.getName());
							System.out.println(salePerson.isGender());
							System.out.println(salePerson.getAddress());
							System.out.println(salePerson.getAge());
							System.out.println(salePerson.getSalary());
							System.out.println(salePerson.getCommission());
						}
					}
					break;
				case 'c':
					for (int iTemp = 0; iTemp <= count; iTemp++) {
						if (arrEmployee[iTemp] instanceof Engineer) {
							Engineer engineer = (Engineer) arrEmployee[iTemp];
							System.out.println(engineer.getName());
							System.out.println(engineer.isGender());
							System.out.println(engineer.getAddress());
							System.out.println(engineer.getSalary());
							System.out.println(engineer.getAge());
							System.out.println(engineer.getOverTime());
						}
					}
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
		} while (choiceMenu < 5);

	}
}