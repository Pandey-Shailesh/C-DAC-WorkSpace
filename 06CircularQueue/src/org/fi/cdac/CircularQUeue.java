package org.fi.cdac;

public class CircularQUeue {
	int[] arr;
	int front;
	int rear;
	int size;

	public CircularQUeue(int size) {
		arr = new int[size];
		front = rear = -1;
		this.size = size;
		System.out.println("The queue is created of the size: " + size);
	}

	// check the Circular queue is empty
	public boolean isEmpty() {
		if (front == -1) {
			return true;
		} else {
			return false;
		}
	}

	// check the Circular queue is full
	public boolean isFull() {
		if (front + 1 == rear) {
			return true;
		} else if (rear == 0 && front + 1 == size) {
			return true;
		} else if (front == 0 && rear == size - 1) {
			return true;
		} else {
			return false;
		}
	}

	// insert element into the queue
	public void enQueue(int value) {
		if (isFull()) {
			System.out.println("Circular Queue is full");
		} else if (isEmpty()) {
			rear = 0;
			front++;
			arr[front] = value;
			System.out.println(value + " is inserted successfully");
		} else {
			if (front + 1 == size) {
				rear = 0;
			} else {
				front++;
			}
			arr[front]= value;
			System.out.println(value+" is inserted Successfully");
		}
		size++;
	}

	//get the value of top of the queue 
	public int  peek() {
		if (isEmpty()) {
			System.out.println("The queue is empty");
			return -1;
		}
		else {
			return arr[rear];
		}
	}
	
	//display all the elements 
	public void dispalyElements() {
		try {
			for (int iTemp = 0; iTemp < size; iTemp++) {
				System.out.print(arr[iTemp]+" ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void deQueue() {
		
	}
	
	
	
	
	
	
}
