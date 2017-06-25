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
	}
	
	public Line(Point startPoint, Vector vector, double t)
	{
		
		this.coordX = vector.getA() * t - startPoint.getX();
		nextPoint.setX(this.coordX);
		
		this.coordY = vector.getB() * t - startPoint.getY();
		nextPoint.setX(this.coordY);
		
		this.coordZ = vector.getC() * t - startPoint.getZ();
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
	
	public double getCoordX(){
		return this.coordX;
	}
	
	public double getCoordY(){
		return this.coordY;
	}
	
	public double getCoordZ(){
		return this.coordZ;
	}
}
