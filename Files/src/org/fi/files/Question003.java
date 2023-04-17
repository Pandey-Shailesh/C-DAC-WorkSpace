package org.fi.files;

import java.io.File;

public class Question003 {
public static void main(String[] args) {
	

    File file = new File("E:\\demo");
    
  
    if (file.exists()) {
        System.out.println("File  exists.");
    } else {
        System.out.println("File does not exist.");
    }
}
}
