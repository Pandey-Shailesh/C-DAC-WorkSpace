package org.fi.cdac;

import java.util.Iterator;

public class StackInArray {
	int[] arr;
	int topOfStack;

	public StackInArray(int size) {
		arr = new int[size];
		topOfStack = -1;
		System.out.println("The size of the Stack is :" + size);
	}

//check weather stack is empty or not
//create a method called isEmpty()
	public boolean isEmpty() {
		if (topOfStack == -1) {
			return true;
		} else {
			return false;
		}
	}

	//to check the stack is full or not
	//create a method called isFull()
	public boolean isFull() {
		if (topOfStack == arr.length-1) {
			return true;
		} else {
			return false;
		}
	}
	
	
	//implementation of push() method of stack
	public void push(int value) {
		if (isFull()) {
			System.out.println("the stack is full.");
		}
		else {
			arr[topOfStack+1] =value;
			topOfStack++;
			System.out.println("the value is inserted suceessfully");
		}
	}
	
	//implement the pop () method
	
	public int  pop() {
		if (isEmpty()) {
			System.out.println("the stack is Empty.");
			return -1;
		}
		else {
			int topElement =arr[topOfStack];
			topOfStack--;
			return topElement;
		}
	}
	
	//implementation of peek() method
	public int peek() {
		if (isEmpty()) {
			System.out.println("stack is empty.");
			return -1;
		} else {
			return arr[topOfStack];
		}
	}
	
	
	//Display the elements of the stack 
	
	public int printStackData() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		} else {
			for (int iTemp = 0; iTemp <= topOfStack; iTemp++) {
				System.out.println(arr[iTemp]+"  ");
			}
			return 1;
		}
	}
	
	// delete the stack
	
		public void deleteStack() {
			arr=null;
			System.out.println("The stack is deleted");
			
		}
	
	
}
