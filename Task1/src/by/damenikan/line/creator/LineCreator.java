package by.damenikan.line.creator;

import by.damenikan.line.entity.Line;
import by.damenikan.line.entity.Point;

public class LineCreator {
	
	

	public static Line createLine(Point startPoint, Point endPoint){

		 double x=0, y = 0, z = 0 , t = 3;

		Line line = new Line(startPoint, endPoint, t);
		
		return line;
	}
}
