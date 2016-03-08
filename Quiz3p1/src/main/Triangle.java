package main;

import static java.lang.Math.sqrt;

public class Triangle extends GeometricObject{
	
	
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public Triangle(){}
	
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	public double getPerimeter(){
		return (this.side1 + this.side2 + this.side3);
	
	}
	public double getArea(){
		double halfPerimeter = getPerimeter() / 2;
		return sqrt(halfPerimeter*(halfPerimeter-this.side1)*(halfPerimeter-this.side2)*(halfPerimeter-this.side3));
	}
	
	@Override
	public String toString(){
		String SIDE1 = Double.toString(this.side1);
		String SIDE2 = Double.toString(this.side2);
		String SIDE3 = Double.toString(this.side3);
		String AREA = Double.toString(getArea());
		String PERIMETER = Double.toString(getPerimeter());
		return "the side lengths of the triangle are " + SIDE1 + ", "+ SIDE2 +" and, " + SIDE3 + 
				",resulting in an area and perimter of " + AREA + " and "  + PERIMETER +" respectively.";
		
			
	}
}
