package by.damenikan.line.action;

import by.damenikan.line.entity.Line;
import by.damenikan.line.entity.Point;

public class Distance {
	
	public static double calculateDistance (Line lineOne, Line lineTwo){
		double distance;
		
		// get vector for line
		Point vectorOne = lineOne.geVector();
		
  		Point startLineOne = lineOne.getStartPoint();
  		Point startLineTwo = lineTwo.getStartPoint(); 
  		
  		// vector from startLineTwo to startLineOne
  		Point vectorP2P1 = new Point(startLineTwo.getX() - startLineOne.getX(),
  									 startLineTwo.getY() - startLineOne.getY(),
  									 startLineTwo.getZ() - startLineOne.getZ() );
		
  		//prepare parameters for vector multiplication
		double l1 = vectorOne.getX();
		double m1 = vectorOne.getY();
		double n1 = vectorOne.getZ();
		
		double l2 = vectorP2P1.getX();
		double m2 = vectorP2P1.getY();
		double n2 = vectorP2P1.getZ();
		
		//Vector multiplication vectorOne * vectorP2P1 
		double i = m1*n2 - n1*m2;
		double j = l1*n2 - n1*l2;
		double k = l1*m2 - m1*l2;
		
		// distance = |vectorOne * vectorP2P1 | / |vectorOne| = |i j k|/|vectorOne|
		distance = Math.sqrt((i*i + j*j +k*k)/(l1*l1 + m1*m1 + n1*n1));
		
		return distance;
	}

}
