
public class Program {
public static void main(String[] args) {

	System.out.println("Enter the day: ");
	int temDay=ConsoleInput.getInteger();
	
	System.out.println("Enter the month: ");
	int temMonth=ConsoleInput.getInteger();
	
	System.out.println("Enter the year: ");
	int temYear=ConsoleInput.getInteger();
	
	Date objDate = new Date();
	objDate.setDate(temDay, temMonth, temYear);
	System.out.println(objDate.getDay()+"/"+objDate.getMonth()+"/"+objDate.getYear());
	
	System.out.println("Enter the day you want to add: ");
	int num =  ConsoleInput.getInteger(); 
	objDate.addDay(num);
	
}
}
