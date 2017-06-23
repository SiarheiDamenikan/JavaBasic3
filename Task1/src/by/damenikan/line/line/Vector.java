package by.damenikan.line.line;

public class Vector {
	private Point pointOne;
	private Point pointTwo;
	private double a;
	private double b;
	private double c;
	
	
	public Vector(){
		
		double x1 = this.pointOne.getX();
		double y1 = this.pointOne.getY();
		double z1 = this.pointOne.getZ();
		
		double x2 = this.pointTwo.getX();
		double y2 = this.pointTwo.getY();
		double z2 = this.pointTwo.getZ();
		
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
