package org.fi.cdac;

public class MainClass {
public static void main(String[] args) {
	
	CircularLinkedList objCirLinkedList = new CircularLinkedList();
	objCirLinkedList.addNode(100);
	
	//System.out.println(objCirLinkedList.head.value);
	objCirLinkedList.insertCirLinkedList(1, 200);
	objCirLinkedList.insertCirLinkedList(2, 300);
	objCirLinkedList.insertCirLinkedList(10, 500);
	objCirLinkedList.insertCirLinkedList(5, 400);
	
	
	
//	System.out.println(objCirLinkedList.head.value);
//	System.out.println(objCirLinkedList.head.next.value);
//	System.out.println(objCirLinkedList.head.next.next.value);
//	System.out.println(objCirLinkedList.head.next.next.next.value);
//	System.out.println(objCirLinkedList.head.next.next.next.next.value);
	
	
	objCirLinkedList.visitNode();
	
	objCirLinkedList.deleteAllNode();
}
}
