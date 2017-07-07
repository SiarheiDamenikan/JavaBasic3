package by.damenikan.string.dataload;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class FileReader {
 
		public static String readDataFile(Path path) throws IOException {
			
			//String contents = new String(Files.readAllBytes(file.toPath())); 
			String contents = new String(Files.readAllBytes(path));
			return contents;
			
		}
}
