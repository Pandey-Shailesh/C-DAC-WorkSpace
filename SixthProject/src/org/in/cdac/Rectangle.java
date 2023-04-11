package org.in.cdac;

public class Rectangle {
public double length;
public double breath;
public Rectangle(){
	
}
public double area(double length,double breath) {
	double area=length*breath;
	return area;
}
public double perimeter(double length,double breath) {
	double perimeter=2*(length+breath);
	return perimeter;
}
}