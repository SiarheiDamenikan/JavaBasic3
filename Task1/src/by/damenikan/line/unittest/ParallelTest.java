package by.damenikan.line.unittest;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParallelTest {
	  	String message1 = "Hello World";	
	  	String message2 = "Hello World";
	  	final static Logger logger = Logger.getLogger(ParallelTest.class);
	   
	  	
	  	public  ParallelTest (String input_data){
	  		
	  	}
	  	
	  	@Parameters
	  	public static String data() {
	        return "Test Parameter";
	    }
	  	
	  	@Parameter
	  	public String v_fisrst;
	  	
	  	
	  	@Test
	   public void testPrintMessage() {	 
	  		
	  		logger.info(v_fisrst);
	  		logger.info("This is info");
	  		logger.debug("This is debug");
	  		logger.warn("This is warn" );
			logger.error("This is error" );
			logger.fatal("This is fatal" );

	      assertEquals(message1, message2);
	   }
}

