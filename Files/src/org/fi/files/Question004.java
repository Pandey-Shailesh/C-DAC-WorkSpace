package org.fi.files;

import java.io.File;

public class Question004 {
	public static void main(String[] args) {

		File file = new File("E:\\demo");
		if (file.isDirectory()) {
			System.out.println(" It is a directory.");
		} else if (file.isFile()) {
			System.out.println("It is a file.");
		} else {
			System.out.println(" It is neither a file nor a directory.");
		}

	}
}
