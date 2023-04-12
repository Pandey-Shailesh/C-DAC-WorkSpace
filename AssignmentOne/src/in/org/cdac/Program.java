package in.org.cdac;
import org.cdac.delhi.ConsoleInput;

public class Program {
	public static void main(String[] args) {

		System.out.println("Enter the day: ");
		int temDay = ConsoleInput.getInteger();

		System.out.println("Enter the month: ");
		int temMonth = ConsoleInput.getInteger();

		System.out.println("Enter the year: ");
		int temYear = ConsoleInput.getInteger();

		Date objDate = new Date();
		objDate.setDate(temDay, temMonth, temYear);
		System.out.println(objDate.getDay() + "/" + objDate.getMonth() + "/" + objDate.getYear());

		while (true) {
			System.out.println("===========================================");
			System.out.println("1. Add Days to Date ");
			System.out.println("2. Add Months to Date ");
			System.out.println("3. Add Year to Date ");
			System.out.println("===========================================");
			System.out.println("Select the Option(1/2/3): ");

			int input = ConsoleInput.getInteger();

			if (input == 1) {
				System.out.println("Enter the days you want to add: ");
				int num1 = ConsoleInput.getInteger();
				objDate.addDay(num1);
				System.out.println(objDate.getDay() + "/" + objDate.getMonth() + "/" + objDate.getYear());	
			}
			else if (input == 2) {
				System.out.println("Enter the months you want to add: ");
				int num2 = ConsoleInput.getInteger();
				objDate.addMonth(num2);
				System.out.println(objDate.getDay() + "/" + objDate.getMonth() + "/" + objDate.getYear());
			} 
			else if (input == 3) {
				System.out.println("Enter the years you want to add: ");
				int num3 = ConsoleInput.getInteger();
				objDate.addyear(num3);
				System.out.println(objDate.getDay() + "/" + objDate.getMonth() + "/" + objDate.getYear());
			} 
			else {
				System.out.println("Program Ends");
				break;
			}
		}

	}
}
