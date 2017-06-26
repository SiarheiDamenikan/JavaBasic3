package by.damenikan.line.dataload;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataReader {
	public static ArrayList<String> readDataFile(File file) {
		
		ArrayList<String> fileRows  = new ArrayList<String>();
		String row;
		BufferedReader reader = null; 
				
		try {
			reader = new BufferedReader(new FileReader(file));
			
			while ((row = reader.readLine()) != null) {
				fileRows.add(row);
			} 
		}catch (IOException e) {
			e.printStackTrace();
		}finally {		
			try {
				reader.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		
		return fileRows;
	}
}
