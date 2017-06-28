package test.damenikan.line;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.Test;

public class CrossingAxisTest {
	final static Logger logger = Logger.getLogger(CrossingAxisTest.class);
  	String message1 = "Hello World";	
  	String message2 = "Hello World";
  	
	@Test
	   public void testPrintMessage() {	 
	  		
	  		logger.info("This is info");
	  		logger.debug("This is debug");
	  		logger.warn("This is warn" );
			logger.error("This is error" );
			logger.fatal("This is fatal" );

	      assertEquals(message1, message2);
	   }
	
}
