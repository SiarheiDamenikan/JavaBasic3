package by.damenikan.string.main;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.damenikan.string.dataload.FileReader;

public class RunTask {

	public static void main(String[] args) {
		
		String content = new String();
		
		try {
			
			content = FileReader.readDataFile(Paths.get("dataFiles/test_text.txt"));
			   
		} catch (IOException e) {
			
			e.printStackTrace();
		}

			ArrayList<String> clearContent = new ArrayList<String>();
			
	        String extartctWordPattern = "[(\\w)]+";
	        Pattern p = Pattern.compile(extartctWordPattern);	        
	        Matcher m = p.matcher(content);
	        String word;
	        
	        while (m.find()) {	 
	        	word = m.group(0);
	        	if (word.matches("(?i)(.).*\\1") &&  !clearContent.contains(word.toLowerCase()) && word.length() > 1) {
	        		clearContent.add(word.toLowerCase());
	        	}
	        }
	        clearContent.forEach((a)->System.out.println(a));
	}

}
