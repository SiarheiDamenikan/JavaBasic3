package by.damenikan.line.action;

import by.damenikan.line.entity.Line;
import by.damenikan.line.entity.Point;

public class Angle {
	
	public static double calculateAngle (Line lineOne, Line lineTwo){
		
		double angle;
		
		Point vectorOne = lineOne.geVector();
  		Point vectorTwo = lineTwo.geVector();
  		
  		double aX = vectorOne.getX();
  		double aY = vectorOne.getY();
  		double aZ = vectorOne.getZ();
  		
  		double bX = vectorTwo.getX();
  		double bY = vectorTwo.getY();
  		double bZ = vectorTwo.getZ();
  		
  		double skalar = aX*bX + aY*bY + aZ*bZ;
  		double modul = Math.sqrt(aX*aX + aY*aY + aZ*aZ) * Math.sqrt(bX*bX + bY*bY + bZ*bZ);
  		
  		angle = Math.acos(skalar/modul)*180/Math.PI;
		
		return angle;
	}

}
