package org.in.interfaces;

public class Square implements RegularPolygon {
	int length;
	public Square() {
		this.length=5;
	}
	@Override
	public int getNumSides() {
		return 4;	
	}
	@Override
	public int getSideLength() {
		Square variable = new Square();
		int value =variable.length;
		return value;	
	}
	public static void main(String[] args) {
		
		Square objSquare=new Square();
		int num =objSquare.getSideLength();
		  int side =objSquare.getNumSides();
			System.out.println(objSquare.getPerimeter(side,num));
			System.out.println(objSquare.getInteriorAngle(side));
			System.out.println(RegularPolygon.getSumOfSide(side, num));
		
	}
}
