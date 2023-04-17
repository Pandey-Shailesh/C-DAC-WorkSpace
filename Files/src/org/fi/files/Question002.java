package org.fi.files;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Question002 {

	 public static void main(String[] args) {
	        
	        // specify the  extension
	        
	        String extension = ".txt";
	        
	        // get all files in the folder
	        File folder = new File("E:\\demo");
	        File[] files = folder.listFiles();
	        
	        // create a list to store files with specified extension
	        List<File> filteredFiles = new ArrayList<>();
	        
	        // loop through all files and add the ones with specified extension to the list
	        for (File file : files) {
	            if (file.isFile() && file.getName().endsWith(extension)) {
	                filteredFiles.add(file);
	            }
	        }
	        
	        // print out the filtered files
	        for (File file : filteredFiles) {
	            System.out.println(file.getName());
	        }
	        
	    }
}
