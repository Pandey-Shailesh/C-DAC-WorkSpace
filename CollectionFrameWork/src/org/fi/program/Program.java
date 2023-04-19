package org.fi.program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
//		arraylistPrint();
//		hashSetprint();
//		setPrint();
//		treeSetPrint();
//		hashMap();

		Properties props = new Properties();
		
		try {
			props.load(new FileInputStream("Setting.propertise"));
			
			String username = props.getProperty("database.username");
			String password = props.getProperty("database.password");
			String temp = props.getProperty("size");
			
			
			System.out.println(username);
			System.out.println(password);
			System.out.println(temp);

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	public static void hashMap() {
		HashMap<Integer, String> hashMap = new HashMap<>();
		int id = 1;
		String data = null;
		try (Scanner scr = new Scanner(System.in)) {

//			while (true) {
//				System.out.println("enter the data");
//				data = scr.next();
//				if (data.equals("exit")) {
//					break;
//				}
//				hashMap.put(id++, data);
//			}

			hashMap.put(1, "shailu");
			hashMap.put(12, "vinu");
			hashMap.put(11, "abhu");
			hashMap.put(17, "sid");
			hashMap.put(14, "shailu");
			hashMap.containsKey(1);
			if (hashMap.containsValue("shailu")) {
				System.out.println("its found");
			} else {
				System.out.println("not found");
			}

			Set<Integer> set = hashMap.keySet();
			Iterator<Integer> iter = set.iterator();

			while (iter.hasNext()) {
				int key = iter.next();
				data = hashMap.get(key);
				System.out.println("key = " + key + ",     value= " + data);
			}

			// System.out.println(data);

		}
	}

	public static void treeSetPrint() {
		try (Scanner scr = new Scanner(System.in)) {
			String data = null;
			TreeSet<String> treeSet = new TreeSet<>();

			while (true) {

				System.out.println("Enter the value");
				data = scr.next();

				if (data.equals("exit"))
					break;
				treeSet.add(data);
			}
			// treeSet.add(null);==================>due to that it throws the
			// NULLPOINTEREXCEPTION.
			Iterator<String> iterator = treeSet.iterator();
			while (iterator.hasNext()) {
				String name = iterator.next();
				System.out.println(name);
			}
		}
	}

	public static void setPrint() {
		try (Scanner scr = new Scanner(System.in)) {
			String data = null;
			Set<String> treeSet = new HashSet<>();

			while (true) {

				System.out.println("Enter the value");
				data = scr.next();

				if (data.equals("exit")) {
					break;
				}
				treeSet.add(data);
			}
			treeSet.add(null);
			System.out.println(treeSet);
			// OR
			Iterator<String> iterator = treeSet.iterator();
			while (iterator.hasNext()) {
				String name = iterator.next();
				System.out.println(name);
			}
		}
	}

	public static void hashSetprint() {
		try (Scanner scr = new Scanner(System.in)) {

			String data = null;
			HashSet<String> hashSet = new HashSet<>();

			while (true) {

				System.out.println("Enter the value");
				data = scr.next();

				if (data.equals("exit")) {
					break;
				}
				hashSet.add(data);
			}
			// System.out.println(hashSet); //OR
			Iterator<String> iterator = hashSet.iterator();
			while (iterator.hasNext()) {
				String name = iterator.next();
				System.out.println(name);
				if (name.equals("shailesh")) {
					iterator.remove();
				}
			}

		}
	}

	public static void arraylistPrint() {
		try (Scanner scr = new Scanner(System.in)) {
			String data = null;
			ArrayList<String> arrayList = new ArrayList<>();

			while (true) {

				System.out.println("Enter the value");
				data = scr.next();

				if (data.equals("exit")) {
					break;
				}
				arrayList.add(data);
			}
			// System.out.println(arrayList);
			// OR
			Iterator<String> iterator = arrayList.iterator();
			while (iterator.hasNext()) {
				String name = iterator.next();
				System.out.println(name);
				if (name.equals("shailesh")) {
					iterator.remove();
				}
			}
			System.out.println("====================================================");

			Object[] arraString = (Object[]) arrayList.toArray();

			for (Object info : arraString) {
				System.out.println(info);
			}

			System.out.println("//////////////////////////////////////////////////////");

			for (String info : arrayList) {
				System.out.println(info);
			}

			System.out.println("?????????????????????????????????????????????????????");

			for (int iTemp = 0; iTemp < arrayList.size(); iTemp++) {
				System.out.println(arrayList.get(iTemp));
			}

			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

			ListIterator<String> listIterator = arrayList.listIterator();

			while (listIterator.hasNext()) {
				System.out.println(listIterator.next());
			}
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			while (listIterator.hasPrevious()) {
				System.out.println(listIterator.previous());
			}

			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

		}
	}
}
