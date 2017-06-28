package test.damenikan.line;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import by.damenikan.line.creator.LineCreator;
import by.damenikan.line.entity.Line;
import by.damenikan.line.entity.Point;


@RunWith(Parameterized.class)
public class ParallelTest {
	  	
		
	  	private Point startLineOne;
	  	private Point endLineOne;
	  	private Point startLineTwo;
	  	private Point endLineTwo;
	  	
	  	//final static Logger logger = Logger.getLogger(ParallelTest.class);
	   
	  	
	  	public  ParallelTest (Point startLineOne, Point endLineOne, Point startLineTwo, Point endLineTwo){	 
	  		this.startLineOne = startLineOne;
	  		this.endLineOne = endLineOne;
	  		this.startLineTwo = startLineTwo;
	  		this.endLineTwo = endLineTwo;
	  	}
	  	
	  	@Parameters
	  	public static Collection<Object[]> data() {
	  		return Arrays.asList(new Object[][]{
	  			{new Point(1,1,1), new Point(2,2,2), new Point(1,1,2), new Point(2,2,3)}
	  		});
	    }
	  	
	  	@Test
	   public void testParalleLine() {	 
	  		
	  		Line lineOne = LineCreator.createLine(this.startLineOne, this.endLineOne);
	  		Line lineTwo = LineCreator.createLine(this.startLineTwo, this.endLineTwo);
	  		
	  		Point vectorOne = lineOne.geVector();
	  		Point vectorTwo = lineTwo.geVector();

	  		int retvalXY = Double.compare(vectorOne.getX()/vectorTwo.getX(), vectorOne.getY()/vectorTwo.getY());
	  		int retvalXZ = Double.compare(vectorOne.getX()/vectorTwo.getX(), vectorOne.getZ()/vectorTwo.getZ());

	  		assertEquals(retvalXY, retvalXZ);
	  		
  	
	   }
}

