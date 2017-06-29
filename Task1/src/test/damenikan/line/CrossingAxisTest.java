package test.damenikan.line;

import static org.junit.Assert.assertEquals;

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
	public class CrossingAxisTest {
		  	
		  	private Point startLineOne;
		  	private Point endLineOne;
		  	private Point startLineTwo;
		  	private Point endLineTwo;
		  	private int angle;
		  	
		  	public  CrossingAxisTest (Point startLineOne, Point endLineOne, Point startLineTwo, Point endLineTwo, int angle){	 
		  		this.startLineOne = startLineOne;
		  		this.endLineOne = endLineOne;
		  		this.startLineTwo = startLineTwo;
		  		this.endLineTwo = endLineTwo;
		  		this.angle = angle;
		  	}
		  	
		  	@Parameters
		  	public static Collection<Object[]> data() {
		  		return Arrays.asList(new Object[][]{
		  		   //for simply test I set crossing line with axis OX on angle 45 degrees
		  			{new Point(1,1,0), new Point(2,2,0), new Point(1,0,0), new Point(2,0,0), 45 } 
		  		});
		    }
		 
		  	@Test
		   public void testCrossingAxis() {	 
		  		
		  		Line lineOne = LineCreator.createLine(this.startLineOne, this.endLineOne);
		  		Line axis = LineCreator.createLine(this.startLineTwo, this.endLineTwo);
		  		
	  		
		  		Point vectorOne = lineOne.geVector();
		  		Point vectorAxis = axis.geVector();
		  		
		  		double aX = vectorOne.getX();
		  		double aY = vectorOne.getY();
		  		double aZ = vectorOne.getZ();
		  		
		  		double bX = vectorAxis.getX();
		  		double bY = vectorAxis.getY();
		  		double bZ = vectorAxis.getZ();
		  		
		  		double skalar = aX*bX + aY*bY + aZ*bZ;
		  		double modul = Math.sqrt(aX*aX + aY*aY + aZ*aZ) * Math.sqrt(bX*bX + bY*bY + bZ*bZ);
		  		
		  		double angleCalc = Math.acos(skalar/modul)*180/Math.PI;
		  		
		  		assertEquals((int)angleCalc, angle);

		   }
	}
