package by.damenikan.line.line;

public class LineCreator {

	public static Line createLine(String pointsCoordinate){
		 double x=0, y = 0, z = 0 , t = 0;
		
		//parse string to get coordinates for first point of line 
		Point pointOne = new Point(x, y, z);
		
		//parse string to get coordinates for first point of line 
		Point pointTwo = new Point(x, y, z);
		
		//create vector 
		Vector vector = new Vector(pointOne, pointTwo);		
		
		//create line
		Line line = new Line(pointOne, vector, t);
		
		return line;
	}
}
