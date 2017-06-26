package by.damenikan.line.creator;

import by.damenikan.line.entity.Line;
import by.damenikan.line.entity.Point;
import by.damenikan.line.entity.Vector;

public class LineCreator {

	public static Line createLine(String pointOneData, String pointTwoData){
		 double x=0, y = 0, z = 0 , t = 0;
		
		//parse string to get coordinates for first point of line 
		Point pointOne = new Point(x, y, z);
		
		//parse string to get coordinates for first point of line 
		Point pointTwo = new Point(x, y, z);
	
		//create line
		Line line = new Line(pointOne, pointTwo, t);
		
		return line;
	}
}
