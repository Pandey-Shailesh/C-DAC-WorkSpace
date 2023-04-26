package org.fi.cdac;

public class MainClass {
	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		sll.createNewNode(10);
		sll.insertLinkedList(1, 20);
		sll.insertLinkedList(2, 30);
		sll.insertLinkedList(3, 40);

		System.out.println(sll.head.value);
		System.out.println("Total size = " + sll.size);

		sll.visitLinkedListNode();
//		sll.searchLinkedListNode(20);
//		sll.deleteLinkedListNode();
//		sll.visitLinkedListNode();

		sll.deleteNode(2);
		System.out.println();
		sll.visitLinkedListNode();

	}
}
