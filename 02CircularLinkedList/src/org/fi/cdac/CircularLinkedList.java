package org.fi.cdac;

public class CircularLinkedList {
	public Node head;
	public Node tail;
	public int size;

	// creating a node
	public Node addNode(int nodeValue) {
		head = new Node();
		Node newNode = new Node(); // creating a new node
		newNode.value = nodeValue;

		newNode.next = newNode;
		head = newNode;
		tail = newNode;
		size = 1;

		return head;
	}

	// insert node at the particular position
	public void insertCirLinkedList(int location, int nodeValue) {
		Node newNode = new Node();
		newNode.value = nodeValue;

		if (head == null) {
			addNode(nodeValue);
		}

		else if (location == 0) {
			newNode.next = head;
			head = newNode;
			tail.next = head;
		}

		else if (location >= size) {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}

		else {
			Node tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			newNode.next = tempNode.next;
			tempNode.next = newNode;
		}
		size++;
	}

	// visit all the nodes of Circular Linked List

	public void visitNode() {
		if (head == null) {
			System.out.println("Circulr Linked list is empty");
		} else {
			Node currentNode = head;
			for (int iTemp = 0; iTemp < size; iTemp++) {
				System.out.print(currentNode.value + "  ");
				currentNode = currentNode.next;
			}

		}
	}
	
	
	//delete all node
	
	public void deleteAllNode() {
		if (head == null) {
			System.out.println("Circulr Linked list is empty");
		} 
		else {
			head= null;
			tail=null;
			size=0;
			
			System.out.println("\nCircular Linked List is deleted.");
			
		}	
	
	
	}
	
	
	
	
}
