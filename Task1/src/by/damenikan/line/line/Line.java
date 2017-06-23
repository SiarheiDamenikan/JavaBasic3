package by.damenikan.line.line;

public class Line {
	private Point startPoint;	
	private Vector vector;
	private double t;
	private double coordX;
	private double coordY;
	private double coordZ;
	private Point nextPoint = new Point();
	
	public Line(){
		
		
		this.coordX = this.vector.getA() * this.t - this.startPoint.getX();
		nextPoint.setX(this.coordX);
		
		this.coordY = this.vector.getB() * this.t - this.startPoint.getY();
		nextPoint.setX(this.coordY);
		
		this.coordZ = this.vector.getC() * this.t - this.startPoint.getZ();
		nextPoint.setX(this.coordZ);
	}
	
	public void setPoint(Point point){
		this.startPoint = point;
	}
	
	public Point getPoint(){
		return this.startPoint;
	};
	
	public void setVector(Vector vector){
		this.vector = vector;
	}
	
	public Vector getVector(){
		return this.vector;
	}
	
	public void setAnyT(double t){
		this.t= t;
	}

	public double getAnyT(){
		return this.t;
	}
	
}
