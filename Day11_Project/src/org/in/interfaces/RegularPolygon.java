package org.in.interfaces;

public interface RegularPolygon {

	public int getNumSides();
	public int getSideLength();
	
	public default int getPerimeter(int side ,int num) {
		int n=side;
		int length=num;
		int perimeter =n*length;
		return perimeter;
	}
	public default double getInteriorAngle(int side) {
		int n=side;
		double interiorAngle =(n-2)*Math.PI/n;
		return interiorAngle;
	}
	public static int getSumOfSide(int side,int num) {
		int n=side;
		int length =num;
		int sumOfSide =n*length;
		return sumOfSide;
	}
	
	
}
