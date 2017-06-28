package test.damenikan.line;

import static org.junit.Assert.assertNotEquals;

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
public class TwoPointForLineTest {
  	private Point startLine;
  	private Point endLine;
   
  	public  TwoPointForLineTest (Point startLine, Point endLine){
  		this.startLine = startLine;
  		this.endLine = endLine;
  	}
  	
  	@Parameters
  	public static Collection<Object[]> data() {
  		return Arrays.asList(new Object[][]{
  			{new Point(1,1,1), new Point(2,2,2)}
  		});
    }
 
  	@Test
   public void testTwoPointForLine() {	 
  		
  		Line line = LineCreator.createLine(this.startLine, this.endLine);
  		
  		Point vector = line.geVector();
  		
  		int compareX = Double.compare(vector.getX(), 0d);
  		int compareY = Double.compare(vector.getY(), 0d);
  		int compareZ = Double.compare(vector.getZ(), 0d);

  		assertNotEquals(compareX, 0);
  		assertNotEquals(compareY, 0);
  		assertNotEquals(compareZ, 0);
  		
   }
}
