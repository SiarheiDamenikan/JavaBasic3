package by.damenikan.line.entity;

public class Line {
	private Point startPoint;
	private Point endPoint;
	private double t;
	private double x;
	private double y;
	private double z;	
	
	public Line(){
	}
	
	public Line(Point startPoint, Point endPoint, double t)
	{
		this.x = (this.endPoint.getX() - this.startPoint.getX()) * t - this.startPoint.getX();
	
		this.y = (this.endPoint.getY() - this.startPoint.getY()) * t - this.startPoint.getY();
		
		this.z = (this.endPoint.getZ() - this.startPoint.getZ()) * t - this.startPoint.getZ();

	}
	
	public void setStartPoint(Point point){
		this.startPoint = point;
	}
	
	public Point getStartPoint(){
		return this.startPoint;
	};
	
	public void setEndPoint(Point point){
		this.startPoint = point;
	}
	
	public Point getEndPoint(){
		return this.startPoint;
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
}
