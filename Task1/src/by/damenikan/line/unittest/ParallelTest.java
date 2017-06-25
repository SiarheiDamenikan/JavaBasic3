package by.damenikan.line.unittest;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import by.damenikan.line.dataload.*;

@RunWith(Parameterized.class)
public class ParallelTest {
	  	
		private String testData;	
	  	String message2 = "Hello World";
	  	
	  	//final static Logger logger = Logger.getLogger(ParallelTest.class);
	   
	  	
	  	public  ParallelTest (String testData){	 
	  		this.testData = testData;
	  	}
	  	
	  	@Parameters
	  	public static ArrayList<String> data() {
	  		return DataReader.readDataFile(new File("datafiles/line_parallel.txt"));
	    }
	  	
	  	@Test
	   public void testPrintMessage() {	 
	  		
	  		String testLine;
	  		testLine = testData;
	  		//logger.info(testLine);
	  		/*
	  		logger.debug("This is debug");
	  		logger.warn("This is warn" );
			logger.error("This is error" );
			logger.fatal("This is fatal" );
			*/

	      assertEquals("test", "test");
	   }
}

