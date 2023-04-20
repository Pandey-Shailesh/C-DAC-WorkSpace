package org.fi.synchro;

public class Point {

	int xPoint;
	double yPoint;
	
	public Point(int xPoint, double yPoint) {
		super();
		this.xPoint = xPoint;
		this.yPoint = yPoint;
	}
	public int getxPoint() {
		return xPoint;
	}
	public void setxPoint(int xPoint) {
		this.xPoint = xPoint;
	}
	public double getyPoint() {
		return yPoint;
	}
	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}
}
