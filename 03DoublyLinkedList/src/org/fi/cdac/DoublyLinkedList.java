package org.fi.cdac;

public class DoublyLinkedList {
	Node head;
	Node tail;
	public int size;

//create the node
	public Node createNode(int nodeValue) {
		head = new Node(); // this is for head node
		Node newNodeObj = new Node();
		newNodeObj.value = nodeValue;
		newNodeObj.next = null;
		newNodeObj.prev = null;

		head = newNodeObj;
		tail = newNodeObj;
		size = 1;
		return head;
	}

// insert the node 
	public void insertNode(int location, int nodeValue) {
		Node newNodeObj = new Node();
		newNodeObj.value = nodeValue;

		if (head == null) {
			createNode(nodeValue);
		}

		else if (location == 0) {
			newNodeObj.next = head;
			newNodeObj.prev = null;
			head.next = newNodeObj;
			head = newNodeObj;
		} else if (location >= size) {
			newNodeObj.next = null;
			tail.next = newNodeObj;
			newNodeObj.prev = tail;
			tail = newNodeObj;
		}

		else {
			Node tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			newNodeObj.prev = tempNode;
			newNodeObj.next = tempNode.next;
			tempNode.next = newNodeObj;
			newNodeObj.next.prev = newNodeObj;
		}
		size++;
	}

//forward traversal

	public void forwardTraversal() {
		if (head != null) {
			Node currentNode = head;
			for (int jTemp = 0; jTemp < size; jTemp++) {
				System.out.print(currentNode.value);
				if (jTemp != size - 1) {
					System.out.print("-->");
					currentNode = currentNode.next;
				}
			}
		} else {
			System.out.println("Dublly linked list is empty");
		}
	}

//Backward traversal
	public void backwardTraversal() {
		if (head != null) {
			Node currentNode = tail;
			for (int iTemp = 0; iTemp < size; iTemp++) {
				System.out.print(currentNode.value);
				if (iTemp != size) {
					System.out.print("<----");
					currentNode = currentNode.prev;
				}
			}
		} else {
			System.out.println("Dublly linked list is empty");
		}
	}

//Search node
	public boolean searchDoubleLinkedList(int nodeValue) {
		if (head == null) {
			System.out.println("Doubly linked list is empty");
		} else {
			Node currentNode = head;
			for (int iTemp = 0; iTemp < size; iTemp++) {
				if (currentNode.value == nodeValue) {
					System.out.println("Node found at the location of " + iTemp);
					return true;
				}
				currentNode = currentNode.next;

			}
		}
		System.out.println("node not found");
		return false;
	}

//delete node at the particular position 
	public void deleteNode(int location) {
		if (head ==null) {
			System.out.println("Doubly linked list not exit");
			return;
		} else if(location == 0) {
			if(size == 1) {
				head = null;
				tail = null;
				size--;
				return;
			}
			else {
				head = head.next;
				head.prev = null;
				size--;
			}
		}
		else if (location >= size) {
			if(size == 1) {
				head = null;
				tail = null;
				size--;
			}
		}
		else {
			Node tempNode = head;
			for (int i = 0; i < location-1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			tempNode.next.prev = tempNode;
			size--;
		}
	}
		
//delete entire node
	public void deleteAllNodes() {
		head =null;
		tail = null;
		System.out.println("The enterire node is delete");
	}
	
}
