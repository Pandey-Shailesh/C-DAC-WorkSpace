package org.in.interfaces;

public class EquilateralTriangle implements RegularPolygon{
int length;
public EquilateralTriangle() {
	this.length=5;
}
	@Override
	public int getNumSides() {
		return 3;	
	}
	@Override
	public int getSideLength() {
		EquilateralTriangle variable = new EquilateralTriangle();
		int value =variable.length;
		return value;	
	}
	
	public static void main(String[] args) {
		EquilateralTriangle objEquiTriangle = new EquilateralTriangle() ;
		
		int num =objEquiTriangle.getSideLength();
		  int side =objEquiTriangle.getNumSides();
		System.out.println(objEquiTriangle.getPerimeter(side,num));
		System.out.println(objEquiTriangle.getInteriorAngle(side));
		System.out.println(RegularPolygon.getSumOfSide(side, num));

	}

}
