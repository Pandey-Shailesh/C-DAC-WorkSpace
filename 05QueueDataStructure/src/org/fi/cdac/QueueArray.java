package org.fi.cdac;

public class QueueArray {

	int[] arr;
	int front;
	int rear;

	public QueueArray(int size) {
		arr = new int[size];
		front = rear = -1;
		System.out.println("The queue is created of the size: " + size);
	}

	// check the queue is empty
	public boolean isEmpty() {
		if (front == -1) {
			return true;
		} else {
			return false;
		}
	}

	// check the queue is full
	public boolean isFull() {
		if (rear == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void enQueue(int element) {
		if (isFull()) {
			System.out.println("The Queue is Full.");
		} else if (isEmpty()) {
			front = 0;
			rear = 0;
			arr[rear] = element;
			System.out.println(element + " is inserted in Queue successfully");
		} else {
			rear++;
			arr[rear] = element;
			System.out.println(element + " is inserted in Queue Successfully");
		}
	}

	// display all the elements of Queue
	public void displayElements() {
		try {
			for (int iTemp = 0; iTemp < arr.length; iTemp++) {
				System.out.print(arr[iTemp] + "  ");
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Queue is not exit");
		}

	}

	// deleting the element from the queue
	public int deQueue() {
		if (isEmpty()) {
			System.out.println("the Queue is empty");
			return -1;
		} else {
			int result = arr[front];
			front++;
			if (front > rear) {
				front = rear = -1;
			}
			return result;

		}
	}

	// delete the queue
	public void deleteQueue() {
		arr = null;
		System.out.println("Queue is deleted Successfully");
	}
}
