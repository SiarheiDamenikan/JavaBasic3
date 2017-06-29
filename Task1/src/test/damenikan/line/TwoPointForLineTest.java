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
  			{new Point(1,1,1), new Point(2,2,1)}
  		});
    }
 
  	@Test
   public void testTwoPointForLine() {	 
  		
  		Line line = LineCreator.createLine(this.startLine, this.endLine);
  		
  		Point vector = line.geVector();
  		
  		assertNotEquals(0d, vector.getX(), 0);
  		assertNotEquals(0d, vector.getY(), 0);
  		assertNotEquals(0d, vector.getZ(), 0);

  		
   }
}
