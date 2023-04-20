package org.fi.lambda;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Program {
	public static void main(String[] args) {

		
		
		//LinkedList<Integer> list = new LiskedList<>();
//		
//		try (Scanner scr = new Scanner(System.in)) {
//			String[] name = new String[5];
//			
//			for (int iTemp = 0; iTemp <5; iTemp++) {
//				System.out.println("Enter the name :");
//				name[iTemp]=scr.next();
//				}
//			Consumer<String []> array = t1 -> Arrays.sort(name, 0, 5);
//				
//			array.accept(name);
//			
//			for (int i = 0; i < name.length; i++) {
//				System.out.println(name[i]);
//			}
//		}
		
	
	
		
	}

	public static void stsrtWithp() {
		Scanner scanner = new Scanner(System.in);
		String name =null;
		Predicate<String> startwithP = str ->{
			if (str.startsWith("P"))
				return true;
			else
				return false;
		};
		
		System.out.println("Enter the name :");
		name = scanner.next();
		 System.out.println(startwithP.test(name));
	}

	public static void statuscheking() {
		LocalDate txtDate =LocalDate.now(ZoneId.of("America/Chicago"));
		
		Transaction tx1 = new Transaction(2134,454667,false,txtDate);
		//ternary operator
		Function<Transaction,String> statusupdate = tx->tx.isStatus() ? "Transaction Accepted" : "Transaction failed";
		String statusmessage = statusupdate.apply(tx1);
		System.out.println(statusmessage);
	}

	public static void tansitionex() {
		LocalDate txtDate =LocalDate.now(ZoneId.of("America/Chicago"));
			
			Transaction tx1 = new Transaction(2134,454667,true,txtDate);
			Consumer<Transaction> displayTransaction = tx->{
				System.out.println("card no:"+tx.getCardNo());
				System.out.println("Amount:"+tx.getAmount());
				System.out.println("Date:"+tx.getTxtDate());
				System.out.println("status:"+tx.isStatus());
			};
			displayTransaction.accept(tx1);
	}

	public static void localDate2() {
		Supplier<LocalDate> currentDate = ()->LocalDate.now();
		System.out.println(currentDate.get());
	}

	public static void localDatefun() {
		LocalDate txtDate =LocalDate.now(ZoneId.of("America/Chicago"));
		
		Transaction tx1 = new Transaction(2134,454667,true,txtDate);
		Transaction tx2 = new Transaction(2136,345667,false,txtDate);
		Transaction tx3 = new Transaction(2138,3467,true,txtDate);
		
		ArrayList<Transaction> list= new ArrayList<>();
		list.add(tx1);
		list.add(tx2);
		list.add(tx3);
		
		
		
		Comparator<Transaction> amount = (t1,t2) -> {if (t1.amount <t2.amount) 
														 return 1;
														else if (t1.amount > t2.amount) 
														 return-1;
														else
														 return 0;
														};
		
		
		
		
		
		list.sort(amount);
		System.out.println(list);
	}

	public static void ascAndDsce() {
		try (Scanner scr = new Scanner(System.in)) {
			ArrayList<String> list= new ArrayList<>();
			
			String name= null;
			for (int iTemp = 0; iTemp <5; iTemp++) {
				System.out.println("Enter the name :");
				name=scr.next();
				list.add(name);
				}
			
			System.out.println("Original List : "+ list);
			
			Comparator<String> ascOrder = (str1,str2) -> {
															if (str1.compareTo(str2)>0) 
															 return 1;
															else if (str1.compareTo(str2)<0) 
															 return-1;
															else
															 return 0;
															};
			list.sort(ascOrder);
			
			System.out.println("sorted list in asc:"+list);
			
			
			Comparator<String> dscOrder = (str1,str2) -> {
															if (str1.compareTo(str2)>0) 
															 return -1;
															else if (str1.compareTo(str2)<0) 
															 return 1;
															else
															 return 0;
															};
				list.sort(dscOrder);

				System.out.println("sorted list in desc :"+list);
		}
	}

	public static void calculator() {
		Calculator addition = (a, b) -> a + b;
		int result = addition.compute(45, 6);
		System.out.println(result);

		System.out.println("-----------------------------------");

		Calculator multipication = (int a, int b) -> {return a * b;};
		result = multipication.compute(45, 6);
		System.out.println(result);
		
		System.out.println("-----------------------------------");

		Calculator division = (int a, int b) -> {return a / b;};
		result = division.compute(45, 6);
		System.out.println(result);
		
		System.out.println("-----------------------------------");

		Calculator substraction = ( a,  b) ->  a-b;
		result = substraction.compute(45, 6);
		System.out.println(result);
		
		
		System.out.println("-----------------------------------");

		Calculator modulus = ( a,  b) ->  a%b;
		result = modulus.compute(45, 6);
		System.out.println(result);
	}
}