package org.fi.cdac;

public class MainClass {

	public static void main(String[] args) {
		CircularQueue objCircularQUeue = new CircularQueue(5);
		objCircularQUeue.enQueue(10);
		objCircularQUeue.enQueue(20);
		objCircularQUeue.enQueue(30);
		objCircularQUeue.enQueue(40);
		objCircularQUeue.enQueue(50);
		objCircularQUeue.enQueue(60);
		
		objCircularQUeue.dispalyElements();
		System.out.println("\n");
		System.out.println(objCircularQUeue.peek());
		
		System.out.println("\n");
		System.out.println(objCircularQUeue.deQueue());
		objCircularQUeue.dispalyElements();
	}
}
