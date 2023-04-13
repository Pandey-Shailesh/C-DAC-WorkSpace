package http.in.cdac;


import org.cdac.delhi.ConsoleInput;

import in.org.cdac.Date;

public class Program {
	public static void main(String[] args) {

		Student arrStudent[] = new Student[100];
		Date objDate = new Date();
		int count = 0;
		int choiceMenu = 0;

		do {
			System.out.println("=====Welcome======");
			System.out.println("1.Engneering Student");
			System.out.println("2.Medical Student");
			System.out.println("3.MBA Student");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			System.out.println("======================");
			System.out.println("Enter the  choice: ");

			 choiceMenu = ConsoleInput.getInteger();

			switch (choiceMenu) {

			case 1:// Engineering Student
				System.out.println("=========================");
				System.out.println("Enter the name: ");
				String name = ConsoleInput.getString();

				System.out.println("Enter the adress: ");
				String address = ConsoleInput.getString();

				System.out.println("Enter the gender: ");
				boolean gender = ConsoleInput.getBoolean();

				System.out.println("Enter the electiveOne: ");
				String electiveOne = ConsoleInput.getString();

				System.out.println("Enter the electiveTwo: ");
				String electiveTwo = ConsoleInput.getString();
				
				System.out.println("Enter the day: ");
				int temDay = ConsoleInput.getInteger();

				System.out.println("Enter the month: ");
				int temMonth = ConsoleInput.getInteger();

				System.out.println("Enter the year: ");
				int temYear = ConsoleInput.getInteger();

				
				objDate.setDate(temDay, temMonth, temYear);
				String date =objDate.toString();
				arrStudent[count] = new EngineeringStudent(name, address, gender,date, electiveOne, electiveTwo);
				count++;
				break;

			case 2:// Medical Student
				System.out.println("=========================");
				System.out.println("Enter the name: ");
				name = ConsoleInput.getString();

				System.out.println("Enter the adress: ");
				address = ConsoleInput.getString();

				System.out.println("Enter the gender: ");
				gender = ConsoleInput.getBoolean();

				System.out.println("Enter the specialization: ");
				String specialization = ConsoleInput.getString();
				System.out.println("Enter the day: ");
				 temDay = ConsoleInput.getInteger();

				System.out.println("Enter the month: ");
				 temMonth = ConsoleInput.getInteger();

				System.out.println("Enter the year: ");
				 temYear = ConsoleInput.getInteger();

				
				objDate.setDate(temDay, temMonth, temYear);
				 date =objDate.toString();
				arrStudent[count] = new MedicalStudent(name, address, gender,date, specialization);
				count++;
				break;

			case 3:// MBA Student
				System.out.println("=========================");
				System.out.println("Enter the name: ");
				name = ConsoleInput.getString();

				System.out.println("Enter the adress: ");
				address = ConsoleInput.getString();

				System.out.println("Enter the gender: ");
				gender = ConsoleInput.getBoolean();

				System.out.println("Enter the year : ");
				int year = ConsoleInput.getInteger();

				System.out.println("Enter the electiveOne: ");
				String graduationDetails = ConsoleInput.getString();
				
				System.out.println("Enter the day: ");
				 temDay = ConsoleInput.getInteger();

				System.out.println("Enter the month: ");
				 temMonth = ConsoleInput.getInteger();

				System.out.println("Enter the year: ");
				 temYear = ConsoleInput.getInteger();

				
				objDate.setDate(temDay, temMonth, temYear);
				 date =objDate.toString();

				arrStudent[count] = new MBAStudent(name, address, gender,date, year, graduationDetails);
				count++;
				break;

			case 4:// Display
				System.out.println("=========================");
				System.out.println("1.Display Engneering Student");
				System.out.println("2.Display Medical Student");
				System.out.println("3.Display MBA Student");
				System.out.println("======================");
				System.out.println("Enter the  choice: ");

				int choiceDisplay = ConsoleInput.getInteger();
				switch (choiceDisplay) {
				case 1:
					for (int iTemp = 0; iTemp <= count; iTemp++) {
						if (arrStudent[iTemp] instanceof MBAStudent) {
							MBAStudent mba = (MBAStudent) arrStudent[iTemp];
							System.out.println(mba.getName());
							System.out.println(mba.isGender());
							System.out.println(mba.getYrOfExp());
							System.out.println(mba.getAddress());
							System.out.println(mba.getGraduationDetails());
							System.out.println(mba.getDate());		
						} else if (arrStudent[iTemp] instanceof MedicalStudent) {
							MedicalStudent medical = (MedicalStudent) arrStudent[iTemp];
							System.out.println(medical.getName());
							System.out.println(medical.isGender());
							System.out.println(medical.getAddress());
							System.out.println(medical.getSpecialization());
							System.out.println(medical.getDate());					
						} else if (arrStudent[iTemp] instanceof EngineeringStudent) {
							EngineeringStudent engineer = (EngineeringStudent) arrStudent[iTemp];
							System.out.println(engineer.getName());
							System.out.println(engineer.isGender());
							System.out.println(engineer.getAddress());
							System.out.println(engineer.getElectiveOne());
							System.out.println(engineer.getElectiveTwo());
							System.out.println(engineer.getDate());
						}
					}
				}
				break;
				
			case 5:// Exit
				System.out.println("Thank you for using it...");
				
				break;
			}
		}
		while (choiceMenu <=5);
	}
}
