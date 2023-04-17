package org.in.cdac;

public class DummyCode {

	
	
//	package org.fi.utils;
//
//	public class LinkedList<T> 
//	{
//		Node<T> start;
//		Node<T> end;
//		Node<T> current;
//		int maxCount;
//		
//		public void add(T data)
//		{
//			Node<T> tmpNode = new Node<>(data);
//			
//			if(start == null)
//				start = end = current = tmpNode;
//			
//			else
//			{
//				end.next = tmpNode;
//				tmpNode.previous = end;
//				end = tmpNode;
//			}
//			maxCount++;
//		}
//		
//		public T getFirst()
//		{
//			if(start == null)
//				return null;
//			
//			current = start;
//			return current.data;
//		}
//		
//		public T getLast()
//		{
//			if(start == null)
//				return null;
//			
//			current = end;
//			return current.data;
//		}
//		
//		public T getNext()
//		{
//			if(start == null || current == end) // current.next == null  and current == end  are same 
//				return null;
//			
//			current = current.next;
//			return current.data;
//		}
//		
//		public T getPrevious()
//		{
//			if(start == null || current == start) // current.previous == null  and current == start  are same 
//				return null;
//			
//			current = current.previous;
//			return current.data;
//		}
//
//		@Override
//		public String toString()
//		{
//			StringBuffer buffer = new StringBuffer("LinkedList[");
//			T data = getFirst();
//			while(data!=null)
//			{
//				buffer.append(data.toString());
//				buffer.append(",\n");
//				data = getNext();
//			}
//			buffer.append("]");
//			return buffer.toString();
//		}
//		
//
//	}
	
	
	//======================================================================================================
	
	
//	
//	package in.cdac2.utils;
//
//	public abstract class Employee {
//		protected String name;
//		protected String address;
//		protected int age;
//		protected char gender;
//		protected float basicSalary;
//
//		public Employee(String name, String address, int age, char gender, float basicSalary) {
//			super();
//			this.name = name;
//			this.address = address;
//			this.age = age;
//			this.gender = gender;
//			this.basicSalary = basicSalary;
//		}
//
//		public String getName() {
//			return name;
//		}
//
//		public void setName(String name) {
//			this.name = name;
//		}
//
//		public String getAddress() {
//			return address;
//		}
//
//		public void setAddress(String address) {
//			this.address = address;
//		}
//
//		public int getAge() {
//			return age;
//		}
//
//		public void setAge(int age) {
//			if (age < 20 || age > 60)
//				this.age = 20;
//			else
//				this.age = age;
//		}
//
//		public float getBasicSalary() {
//			return basicSalary;
//		}
//
//		public char getGender() {
//			return gender;
//		}
//
//		public void setGender(char gender) {
//			this.gender = gender;
//		}
//
//		public void setBasicSalary(float basicSalary) {
//			if (basicSalary < 20_000 || basicSalary > 1_00_00_000)
//				this.basicSalary = 20_000;
//			else
//				this.basicSalary = basicSalary;
//		}
//
//		@Override
//		public String toString() {
//			return "[name=" + name + ", address=" + address + ", age=" + age + ", gender=" + gender + ", basicSalary="
//					+ basicSalary;
//		}

//========================================================================================================
	
//	package in.cdac2.utils;
//	import org.fi.utils.LinkedList;
//
//	import in.cdac.utils.ConsoleInput;
//
//	public class Program 
//	{
//		
//		
////		public static void show(LinkedList objList)
////		{
////			System.out.println("Name = "+objList.getName());
////			System.out.println("Address = "+objList.getAddress());
////			System.out.println("Age = "+objList.getAge());
////			if(objList.getGender()=='M' || objList.getGender() == 'm')
////					System.out.println("Gender = Male");
////			else if(objList.getGender()=='F' || objList.getGender() == 'f')
////					System.out.println("Gender = Female");
////			else
////				System.out.println("Gender = Transgender");
////			System.out.println("BasicSalary = "+objList.getBasicSalary());	
////		}
//
//
//		public static void main(String[] args) 
//		{
//			int choice = -1;
//			
//			//Employee[] arrEmployee = new Employee[100];
//			LinkedList<Employee> objList = new LinkedList<>();
//			
//			
//			int count = 0;
//			
//			while(choice != 6)
//			{
//				System.out.printf("\nWelcome to Employee data management \n"
//						+ "*************\n"
//						+ "1) Add \n"
//						+ "2) Display \n"
//						+ "3) Search \n"
//						+ "4) Save \n"
//						+ "5) Load \n"
//						+ "6) Exit \n");
//				
//				System.out.println("");
//				System.out.print("Enter your choice : ");
//				choice = ConsoleInput.getInteger(); 
//				
//				switch (choice)
//				{
//				case 1: //Add
//				{
//					char subChoice = ' ';
//					
//					while (subChoice != 'd')
//					{
//						System.out.printf("\nJob title of Employee \n"
//								+ "*******\n"
//								+ "a) Manager \n"
//								+ "b) Engineer \n"
//								+ "c) Sales Person \n"
//								+ "d) Return to Main Menu\n\n");
//						
//						System.out.print("Enter your choice : ");
//						subChoice = ConsoleInput.getChar ();
//						System.out.println("");
//						
//						switch (subChoice)
//						{
//						
//						case 'a':
//						case 'b':
//						case 'c':
//						{
//							Employee objEmployee = null;
//						
//							System.out.print("Enter the name = ");
//							String name = ConsoleInput.getString();
//							
//							System.out.print("Enter the address = ");
//							String address = ConsoleInput.getString();
//							
//							System.out.print("Enter the age = ");
//							int age = ConsoleInput.getInteger();
//							
//							System.out.print("Enter the gender( Male = M , Female = F , Transgender = T ) = ");
//							char gender = ConsoleInput.getChar();
//							
//							System.out.print("Enter the basicSalary = ");
//							float basicSalary = ConsoleInput.getFloat();
//							
//							if(subChoice == 'a')
//							{						
//								System.out.print("Enter the HRA = ");
//								float hra = ConsoleInput.getFloat();
//								
//								objEmployee = new Manager(name, address, age, gender, basicSalary, hra);
//							}
//							else if(subChoice =='b')
//							{
//								System.out.print("Enter the OverTime = ");
//								float overTime = ConsoleInput.getFloat();
//								
//								objEmployee = new Engineer( name, address, age, gender, basicSalary, overTime);
//
//							}
//							else
//							{
//								System.out.print("Enter the Commission = ");
//								float commission = ConsoleInput.getFloat();
//								
//								objEmployee = new SalesPerson( name, address, age, gender, basicSalary, commission);
//							}
//							
//							objList.add(objEmployee);
//							
//						}
//						break;
//						}
//					}
//					
//				}
//				break;
//				
//				case 2: 
//				{
//					System.out.println(objList);
//					
//					Employee data =  objList.getFirst();
//					
//					while(data!=null)
//					{
//						//System.out.println(data);
//						/*
//						 * System.out.println("Name = "+data.getName());
//						 * System.out.println("Address = "+data.getAddress());
//						 * System.out.println("Age = "+data.getAge()); if(data.getGender()=='M' ||
//						 * data.getGender() == 'm') System.out.println("Gender = Male"); else
//						 * if(data.getGender()=='F' || data.getGender() == 'f')
//						 * System.out.println("Gender = Female"); else
//						 * System.out.println("Gender = Transgender");
//						 * System.out.println("BasicSalary = "+data.getBasicSalary());
//						 * 
//						 * //RTTI if(data instanceof Manager) { Manager objManager = (Manager)data;
//						 * System.out.println(objManager.getHra()); } else if(data instanceof Engineer)
//						 * { Engineer objEngineer = (Engineer) data;
//						 * System.out.println(objEngineer.getOverTime()); } else if(data instanceof
//						 * SalesPerson) { SalesPerson objSalesPerson= (SalesPerson) data;
//						 * System.out.println(objSalesPerson.getCommission()); }
//						 */
//						System.out.println(data);
//						data =  objList.getNext();
//					}
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
