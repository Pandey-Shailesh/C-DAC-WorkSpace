package org.fi.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Program {

public static void main(String[] args) {
	try(Scanner scanner = new Scanner(System.in)) {
		System.out.println("Enter the name of the class to load ");
		String className = scanner.next();
		Class<?> refClass = Class.forName(className);
		
//		Class x = Program.class;
//		Program objProgram;
//		objProgram.getClass();
//		
		
		System.out.println("Indormation for"+className);
		Method arrMathods [] = refClass.getMethods();
		for (Method objMethod : arrMathods) {
			System.out.println(objMethod);
		}
		System.out.println("========================================");
		Field [] arrFields = refClass.getFields();
		for (Field objField : arrFields) {
			System.out.println(objField.getName());
			System.out.println(objField.getType());
		}
		
		//Constructor ctor = refClass.getConstructor(null);
		Constructor ctor = refClass.getConstructor(String.class);
		//Object obj = ctor.newInstance(null);
		Object obj = ctor.newInstance("Shailesh");
		Field valueField = refClass.getField("value");
		valueField.set(obj, 99);
		System.out.println(obj);
		Method methodDisplay = refClass.getMethod("display", null);
		methodDisplay.invoke(obj, null);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
