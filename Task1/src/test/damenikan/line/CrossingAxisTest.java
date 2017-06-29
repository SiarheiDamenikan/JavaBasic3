package test.damenikan.line;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import by.damenikan.line.action.Angle;
import by.damenikan.line.creator.LineCreator;
import by.damenikan.line.entity.Line;
import by.damenikan.line.entity.Point;

	@RunWith(Parameterized.class)
	public class CrossingAxisTest {
		  	
		  	private Point startLineOne;
		  	private Point endLineOne;
		  	private Point startLineTwo;
		  	private Point endLineTwo;
		  	private int expectedAngle;
		  	
		  	public  CrossingAxisTest (Point startLineOne, Point endLineOne, Point startLineTwo, Point endLineTwo, int angle){	 
		  		this.startLineOne = startLineOne;
		  		this.endLineOne = endLineOne;
		  		this.startLineTwo = startLineTwo;
		  		this.endLineTwo = endLineTwo;
		  		this.expectedAngle = angle;
		  	}
		  	
		  	@Parameters
		  	public static Collection<Object[]> data() {
		  		return Arrays.asList(new Object[][]{
		  		   //for simply test I set crossing line with axis OX on angle 45 degrees. Line in plane XY
		  			{new Point(1,1,0), new Point(2,2,0), new Point(1,0,0), new Point(2,0,0), 45 } 
		  		});
		    }
		 
		  	@Test
		   public void testCrossingAxis() {	 
		  		
		  		Line lineOne = LineCreator.createLine(this.startLineOne, this.endLineOne);
		  		Line axis = LineCreator.createLine(this.startLineTwo, this.endLineTwo);
		  		
		  		double angleCalc = Angle.calculateAngle(lineOne, axis);
		  		
		  		assertEquals(expectedAngle, (int)angleCalc);

		   }
	}
