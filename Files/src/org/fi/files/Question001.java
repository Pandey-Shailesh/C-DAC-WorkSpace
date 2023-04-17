package org.fi.files;

import java.io.File;

public class Question001 {

	public static void main(String[] args) {
		File objFile =new File("E:\\demo");
		if (objFile.isDirectory()) {
			String [] arr =objFile.list();
			for (String nameOfList : arr) {
				System.out.println(nameOfList);
			}
		}
	}
}
