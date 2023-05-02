package org.in.cdac;

public class MainClass {

	public static void main(String[] args) {
		BinaryTreeLinkedList objBinaryTreeLinkedList= new BinaryTreeLinkedList();
		objBinaryTreeLinkedList.insertNode("A");
		objBinaryTreeLinkedList.insertNode("B");
		objBinaryTreeLinkedList.insertNode("C");
		objBinaryTreeLinkedList.insertNode("D");
		objBinaryTreeLinkedList.insertNode("E");
		objBinaryTreeLinkedList.insertNode("F");
		objBinaryTreeLinkedList.insertNode("G");
		
		System.out.println();
		
		System.out.println("PRE-ORDER TRAVERSAL ");
		objBinaryTreeLinkedList.preOrder(objBinaryTreeLinkedList.root);
		
		System.out.println();
		
		System.out.println("IN-ORDER TRAVERSAL ");
		objBinaryTreeLinkedList.inOrder(objBinaryTreeLinkedList.root);
		
		System.out.println();
		
		System.out.println("POST-ORDER TRAVERSAL ");
		objBinaryTreeLinkedList.postOrder(objBinaryTreeLinkedList.root);

		System.out.println();
		
		System.out.println("LEVEL-ORDER TRAVERSAL ");
		objBinaryTreeLinkedList.leverOrder();
		
		
		
		
		System.out.println();
		
		System.out.println("Search Node ");
		objBinaryTreeLinkedList.searchNode("F");
	
		
		objBinaryTreeLinkedList.deleteAllNodes();
		
	}
}
