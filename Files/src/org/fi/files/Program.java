package org.fi.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
//		File objFile = new File("E:\\demo");

//		if (objFile.isDirectory()) {
//			System.out.println("The path entered is a directory.");
//		} else if (objFile.isFile()) {
//			System.out.println("The path entered is File.");
//		}

//		if (objFile.isDirectory()) {
//			String []arrFiles = objFile.list();
//			for (String fileName : arrFiles) {
//				System.out.println(fileName);
//			}
//		} 
		
		
		//System.out.println("==================================");
		
		

//		if (objFile.isDirectory()) {
//			File[] arrFiles = objFile.listFiles();
//			for (File entryfile : arrFiles) {
//				System.out.println("Name :" + entryfile.getName());
//				System.out.println("Is file: " + entryfile.isFile());
//				// System.out.println(entryfile.lastModified());
//				Long lastmodified = entryfile.lastModified();
//				Date objDate = new Date(lastmodified);
//				System.out.println("LAst modified " + objDate);
//				System.out.println("===============================");
//			}
//		} else if (objFile.isFile()) {
//			System.out.println("The path entered is File.");
//		}

		
		//System.out.println("==================================");
		
		
//		try {
//			File objFile = new File("E:\\demo\\a.txt");
//			//objFile.createNewFile();
//			//objFile.delete();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		//System.out.println("==================================");
		
		
//		//readTOFile();
//		FileInputStream fileInputStream =null;
//		try {
//			File objFile = new File("E:\\demo");
//			fileInputStream = new FileInputStream(objFile);
//			//byte [] data = fileInputStream.readAllBytes();
//			byte [] data = new byte[(int)objFile.length()];
//			fileInputStream.read(data);
//			String objString = new String(data);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		finally
//		{
//			try {
//				if(fileInputStream!=null)
//				fileInputStream.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		System.out.println("==================================");
		
		writeToFile();
		
	}

	private static void writeToFile() {
		FileOutputStream fileOutputStream =null;
		try {
			File objFile = new File("E:\\demo\\text.txt");
			fileOutputStream = new FileOutputStream(objFile);
			String data = " hello everone i am shailesh...i am chemical eng.";
			fileOutputStream.write(data.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(fileOutputStream!=null)
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
		
	}
}
