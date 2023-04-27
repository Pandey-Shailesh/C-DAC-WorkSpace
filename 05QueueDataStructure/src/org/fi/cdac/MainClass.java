package org.fi.cdac;

public class MainClass {
public static void main(String[] args) {
	QueueArray objQueueArray = new QueueArray(5);
	System.out.println(	objQueueArray.isEmpty());
	System.out.println(	objQueueArray.isFull());
	
	
	objQueueArray.enQueue(10);
	objQueueArray.enQueue(20);
	objQueueArray.enQueue(30);
	objQueueArray.enQueue(40);
	objQueueArray.enQueue(50);
	objQueueArray.enQueue(60);
	

	objQueueArray.displayElements();
	System.out.println("--------");
	 System.out.println(objQueueArray.deQueue());
	 objQueueArray.deleteQueue();
	 objQueueArray.displayElements();
}
}
