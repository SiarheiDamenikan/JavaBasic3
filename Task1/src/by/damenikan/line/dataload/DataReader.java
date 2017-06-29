package by.damenikan.line.dataload;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DataReader {
	
	private static Logger logger = LogManager.getLogger(DataReader.class.getName());
	
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
			logger.error("FILE READING ERROR " + file.getName());
		}finally {		
			try {
				reader.close();
			} catch (IOException e) {				
				logger.error("FILE ACESS ERROR " + file.getName());
			}
		}
		
		return fileRows;
	}
}
