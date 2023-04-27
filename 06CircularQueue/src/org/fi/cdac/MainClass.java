package org.fi.cdac;

public class MainClass {

	public static void main(String[] args) {
		CircularQUeue objCircularQUeue = new CircularQUeue(5);
		objCircularQUeue.enQueue(10);
		objCircularQUeue.enQueue(20);
		objCircularQUeue.enQueue(30);
		objCircularQUeue.enQueue(40);
		objCircularQUeue.enQueue(50);
		objCircularQUeue.enQueue(60);
		
		objCircularQUeue.dispalyElements();
		System.out.println("\n");
		System.out.println(objCircularQUeue.peek());
		
		
		
	}
}
