package by.damenikan.line.line;

public class Vector {
	private Point pointOne;
	private Point pointTwo;
	private double a;
	private double b;
	private double c;
	
	
	public Vector(){
	}
	
	public Vector(Point pointOne, Point pointTwo){
	
		double x1 = pointOne.getX();
		double y1 = pointOne.getY();
		double z1 = pointOne.getZ();
		
		double x2 = pointTwo.getX();
		double y2 = pointTwo.getY();
		double z2 = pointTwo.getZ();
		
		this.a = x2 - x1;
		this.b = y2 - y1;
		this.c = z2 - z1;
	}
	
	public void setPointOne(Point point) {
		this.pointOne = point; 
	}
	
	public Point getPointOne() {
		return this.pointOne;
	}
	
	public void setPointTwo(Point point) {
		this.pointTwo = point; 
	}
	
	public Point getPointTwo() {
		return this.pointTwo;
	}
	
    public double getA() {
		return this.a;
	}
    
    public double getB() {
		return this.b;
	}
	
	public double getC() {
		return this.c;
	}
}
