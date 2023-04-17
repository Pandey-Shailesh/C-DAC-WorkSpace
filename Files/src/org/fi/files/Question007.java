package org.fi.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question007 {
	private static void writeToFile() {
		FileOutputStream fileOutputStream = null;
		try {
			File objFile = new File("E:\\demo\\text.txt");
			fileOutputStream = new FileOutputStream(objFile,true);
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

public static void main(String[] args) {
	writeToFile();
}
}
