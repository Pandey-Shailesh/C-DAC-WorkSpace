package org.fi.cdac;

public class MainClass {
public static void main(String[] args) {
	
	DoublyLinkedList objDoubllyLinkedList = new DoublyLinkedList();
	
	objDoubllyLinkedList.createNode(199);
	System.out.println(objDoubllyLinkedList.head.value);
	objDoubllyLinkedList.insertNode(1,10);
	objDoubllyLinkedList.insertNode(2, 20);
	objDoubllyLinkedList.insertNode(3, 30);
	
	objDoubllyLinkedList.insertNode(2, 50);
	objDoubllyLinkedList.insertNode(3, 80);
	
	objDoubllyLinkedList.backwardTraversal();
	objDoubllyLinkedList.deleteNode(3);
	System.out.println();
	objDoubllyLinkedList.backwardTraversal();
	System.out.println();
	objDoubllyLinkedList.deleteAllNodes();
	objDoubllyLinkedList.backwardTraversal();
}
}
