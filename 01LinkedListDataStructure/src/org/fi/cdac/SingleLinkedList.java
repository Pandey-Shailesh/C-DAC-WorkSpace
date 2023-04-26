package org.fi.cdac;

public class SingleLinkedList {

	public Node head;
	public Node tail;
	public int size;

	// creating new node
	public Node createNewNode(int nodeValue) {
		head = new Node();
		Node newNode = new Node();
		newNode.next = null;
		newNode.value = nodeValue;

		head = newNode;
		tail = newNode;
		size = 1;
		return head;
	}

	// insert new node at the particular position
	public void insertLinkedList(int location, int nodeValue) {
		Node newNode = new Node();
		newNode.value = nodeValue;

		if (head == null) {
			createNewNode(nodeValue);
		}

		else if (location == 0) {
			newNode.next = head;
			head = newNode;
		}

		else if (location >= size) {
			newNode.next = null;
			tail.next = newNode;
			tail = newNode;
		}

		else {
			Node tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			Node nextNode = tempNode.next;
			tempNode.next = newNode;
			newNode.next = nextNode;
		}
		size++;
	}

	// Visit all the the node of Linked list

	public void visitLinkedListNode() {
		if (head == null) {
			System.out.println("Linked List is empty.");
		} else {
			Node currentNode = head;
			for (int temp = 0; temp < size; temp++) {
				System.out.print(currentNode.value + " -- ");
				currentNode = currentNode.next;
			}

		}
	}

	// Search all the the node of Linked list
	public void searchLinkedListNode(int nodeValue) {
		if (head == null) {
			System.out.println("Linked List is empty.");
		} else {
			Node currentNode = head;
			for (int temp = 0; temp < size; temp++) {
				if (currentNode.value == nodeValue)
					System.out.println("It is in List at position " + temp);

				currentNode = currentNode.next;
			}
		}

	}

	// delete all the the node of Linked list
	public void deleteLinkedListNode() {

		head = null;
		tail = null;
		size = 0;
		System.out.println("the linked list deleted");
	}

	// delete node at location of the Linked list
	public void deleteNode(int location) {
		if (head == null) {
			System.out.println("Linked List is empty");
		} else if (location == 0) {
			head = head.next;
			size--;
			if (size == 0) {
				tail = null;
			}
		} else if (location >= size) {
			Node currentNode = head;
			for (int temp = 0; temp < size - 1; temp++) {
				currentNode = currentNode.next;
			}
			if (currentNode == head) {
				head = tail = null;
				size--;
				return;
			}
			currentNode.next = null;
			tail = currentNode;
			size--;

		}

		else {
			Node currentNode = head;
			for (int temp = 0; temp < location - 1; temp++) {
				currentNode = currentNode.next;
			}
			currentNode.next = currentNode.next.next;
			size--;

		}
	}

//		// delete particular node 
//		public void deleteNode(int location) {
//			
//			if(head == null) {
//				System.out.println("Linked List is empty");;
//			}
//			
//			else if(location == 0) {
//				head = head.next;
//				size--;
//				if(size==0)
//					tail=null;
//			}
//			
//			else if(location > size) {
//				System.out.println("Location entered is more than size");
//			}
//			
//			else {
//				Node tempNode = head;
//				int index = 0;
//				while( tempNode!=null && index < location-1 ) {
//					tempNode = tempNode.next;
//					index++;
//				}
//				Node nextNode = tempNode.next;
//				tempNode.next = nextNode.next;
//				size--;
//			}
//		
//		}

}