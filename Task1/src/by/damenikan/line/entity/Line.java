package by.damenikan.line.entity;

public class Line {
	private Point startPoint;
	private Point endPoint;
	private Point vector; 
	private double t;
	private double x;
	private double y;
	private double z;	

	
	
	public Line(){
	}
	
	public Line(Point startPoint, Point endPoint, double t)
	{	double p1;
		double p2;
		double p3;
		
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		
		p1 = endPoint.getX() - startPoint.getX();
		p2 = endPoint.getY() - startPoint.getY();
		p3 = endPoint.getZ() - startPoint.getZ();
		
		this.vector = new Point (p1, p2, p3);
				
		this.x = p1 * t - startPoint.getX();
	
		this.y = p2 * t - startPoint.getY();
		
		this.z = p3 * t - startPoint.getZ();

	}
	
	public void setStartPoint(Point point){
		this.startPoint = point;
	}
	
	public Point getStartPoint(){
		return this.startPoint;
	};
	
	public void setEndPoint(Point point){
		this.endPoint = point;
	}
	
	public Point getEndPoint(){
		return this.endPoint;
	};
	
	public void setAnyT(double t){
		this.t= t;
	}

	public double getAnyT(){
		return this.t;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public double geZ(){
		return this.z;
	}
	
	public Point geVector(){
		return this.vector;
	}
}
