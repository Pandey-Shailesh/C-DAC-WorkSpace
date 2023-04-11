package org.cdac.delhi;

public class ConsoleInput {
	public static String getString() {
		try {
		 	byte arrInput [] = new byte[100];
		    int length = System.in.read(arrInput);
		    byte[] arrFinal =new byte[length-2];
		    System.arraycopy(arrInput, 0, arrFinal, 0, length-2);
		    String ObjString = new String(arrFinal);
		    return ObjString;
			}
		catch(Exception objExection) {
			System.out.println(objExection);
			}
		return null;
	}
	public static int getInteger() {
		String objString =getString();
		int value =  Integer.parseInt(objString);
		return value;
	}
	public static float getFloat() {
		String objString =getString();
		float value =  Float.parseFloat(objString);
		return value;
	}
	public static long getLong() {
		String objString =getString();
		long value =  Long.parseLong(objString);
		return value;
	}
	public static double getDouble() {
		String objString =getString();
		double value =  Double.parseDouble(objString);
		return value;
	}
	public static short getShort() {
		String objString =getString();
		short value =  Short.parseShort(objString);
		return value;
	}
	public static boolean getBoolean() {
		String objString =getString();
		boolean value =  Boolean.parseBoolean(objString);
		return value;
	}
	public static char getCharacter() {
		String objString =getString();
		char value =  objString.charAt(0);
		return value;
	}
}
