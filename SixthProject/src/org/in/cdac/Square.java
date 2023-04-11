package org.in.cdac;

public class Square extends Rectangle{
	public double side;
	
	public double area(double side) {
		double area=side*side;
		return area;
	}
	public double perimeter(double side) {
		double perimeter=4*(side);
		return perimeter;
	}
}
