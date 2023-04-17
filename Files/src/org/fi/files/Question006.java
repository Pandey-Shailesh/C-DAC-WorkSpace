package org.fi.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Question006 {
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
public static void main(String[] args) {
	readFile();
}

}
