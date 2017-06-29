import java.io.File;
import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import by.damenikan.line.action.Distance;
import by.damenikan.line.creator.LineCreator;
import by.damenikan.line.dataload.*;
import by.damenikan.line.entity.Line;
import by.damenikan.line.entity.Point;

public class RunTask {

	static Logger logger = LogManager.getLogger(RunTask.class.getName());
	
	public static void main(String[] args) {
		
		double distance = DistanceBetweenLines();
		logger.info("Distance between two parallel lines = " + distance );
		
	}

	public static double  DistanceBetweenLines(){
		
		ArrayList<String> fileRows = DataReader.readDataFile(new File("dataFiles/line_parallel.txt"));
		
		String lineOneParams = fileRows.get(0) ;
		String lineTwoParams = fileRows.get(1) ;
		
		String[] startLineOne = lineOneParams.split("\\|")[1].split(";");
		String[] endLineOne = lineOneParams.split("\\|")[2].split(";");
		
		String[] startLineTwo = lineTwoParams.split("\\|")[1].split(";");
		String[] endLineTwo = lineTwoParams.split("\\|")[2].split(";");
		
		//create first line
		Point startPointLineOne = new Point(Double.parseDouble(startLineOne[0]), 
				Double.parseDouble(startLineOne[1]), 
				Double.parseDouble(startLineOne[2]));
				
		Point endPointLineOne = new Point(Double.parseDouble(endLineOne[0]), 
				Double.parseDouble(endLineOne[1]), 
				Double.parseDouble(endLineOne[2]));
		
		Line lineOne = LineCreator.createLine(startPointLineOne, endPointLineOne);
	
		//create second line
		Point startPointLineTwo = new Point(Double.parseDouble(startLineTwo[0]), 
				Double.parseDouble(startLineTwo[1]), 
				Double.parseDouble(startLineTwo[2]));
				
		Point endPointLineTwo = new Point(Double.parseDouble(endLineTwo[0]), 
				Double.parseDouble(endLineTwo[1]), 
				Double.parseDouble(endLineTwo[2]));
		
		Line lineTwo = LineCreator.createLine(startPointLineTwo, endPointLineTwo);
		
		//calculate distance between parallel lines
		double distance = Distance.calculateDistance(lineOne, lineTwo);
		
		return distance;
	}
	

}
