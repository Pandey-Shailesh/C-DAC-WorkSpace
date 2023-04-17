package org.fi.files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Scanner;

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

		// System.out.println("==================================");

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

		// System.out.println("==================================");

//		try {
//			File objFile = new File("E:\\demo\\a.txt");
//			//objFile.createNewFile();
//			//objFile.delete();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// System.out.println("==================================");

		// read TO File.....
//		readFile();

		// writeTo file....
//		writeToFile();

		//read Data Input Stream
		//readDOS();
				
		//write Data output Stream
		//writeDOS();
		
		
		
		//use to deSerialized to object
		//deserializeObject();
		
		
		//use to Serialized to object
	    //serializeObject();
		
		

	

	}

	private static void serializeObject() {
		Scanner scanner =null;
		FileOutputStream fileOutputStream =null;
		ObjectOutputStream objectOutputStream=null;
		
		
		
		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter the name: ");
			String name =scanner.next();
			
			System.out.println("Enter the Age: ");
			int age = scanner.nextInt();
			
			System.out.println("Enter the gender: ");
			boolean gender = scanner.nextBoolean();
			
			//Serialization
			
			Data objData = new Data(name,age,gender);
			fileOutputStream =new  FileOutputStream("E:\\demo\\a.txt");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(objData);
			System.out.println("Data saved...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (scanner!=null) {
					scanner.close();
				}
				if (objectOutputStream!=null) {
					objectOutputStream.close();
				}
				if (fileOutputStream!=null) {
					fileOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void deserializeObject() {
		FileInputStream fileInputStream =null;
		ObjectInputStream objectInputStream=null;
		
		try {
			fileInputStream= new FileInputStream("E:\\demo\\a.txt");
			objectInputStream= new ObjectInputStream(fileInputStream);
			
			Object data = objectInputStream.readObject();
			Data objData =(Data)data;
			System.out.println(objData.getName());
			System.out.println(objData.getAge());
			System.out.println(objData.isGender());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
		 try {
			if (objectInputStream!=null) 
				 objectInputStream.close();
			 if (fileInputStream!=null) 
				 fileInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		 }
	}

	private static void writeDOS() {
		DataOutputStream dataOutputStream = null;
		FileOutputStream fileOutputStream = null;
		Scanner scanner = null;
		

		try {
			fileOutputStream = new FileOutputStream("E:\\demo\\text.txt",true);
			dataOutputStream = new DataOutputStream(fileOutputStream);
			scanner= new Scanner(System.in);

			
			System.out.println("Enter name");
			String name = scanner.next();
			
			System.out.println("Enter age");
			int age = scanner.nextInt();
			
			System.out.println("Enter gender");
			boolean gender = scanner.nextBoolean();
			
			dataOutputStream.writeUTF(name);
			dataOutputStream.writeInt(age);
			dataOutputStream.writeBoolean(gender);
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(dataOutputStream!=null)
					dataOutputStream.close();
				if(fileOutputStream!=null)
					fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void readDOS() {
		DataInputStream dataInputStream = null;
		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream("E:\\demo\\text.txt");
			dataInputStream = new DataInputStream(fileInputStream);

			String name;
			try {
				while (true) {
					name = dataInputStream.readUTF();
					int age = dataInputStream.readInt();
					boolean gender = dataInputStream.readBoolean();

					System.out.println("Name: " + name);
					System.out.println("age: " + age);
					System.out.println("gender: " + gender);
				}
			} catch (EOFException e) {
				System.out.println("finish statements");
				//e.printStackTrace();===>it used to write the exception.
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(dataInputStream!=null)
					dataInputStream.close();
				if(fileInputStream!=null)
					fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void readFile() {
		FileInputStream fileInputStream = null;
		try {
			File objFile = new File("E:\\demo");
			fileInputStream = new FileInputStream(objFile);
			// byte [] data = fileInputStream.readAllBytes();
			byte[] data = new byte[(int) objFile.length()];
			fileInputStream.read(data);
			String objString = new String(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null)
					fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void writeToFile() {
		FileOutputStream fileOutputStream = null;
		try {
			File objFile = new File("E:\\demo\\text.txt");
			fileOutputStream = new FileOutputStream(objFile);
			String data = " hello everone i am shailesh...i am chemical eng.";
			fileOutputStream.write(data.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileOutputStream != null)
					fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
