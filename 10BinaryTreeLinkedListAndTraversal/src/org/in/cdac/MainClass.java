package org.in.cdac;

public class MainClass {
	public static void main(String[] args) {
		BinaryTreeLinkedList objBinaryTreeLinkedList= new BinaryTreeLinkedList();
		objBinaryTreeLinkedList.insertNode(10);
		objBinaryTreeLinkedList.insertNode(20);
		objBinaryTreeLinkedList.insertNode(30);
		objBinaryTreeLinkedList.insertNode(40);
		objBinaryTreeLinkedList.insertNode(50);
		objBinaryTreeLinkedList.insertNode(60);
		objBinaryTreeLinkedList.insertNode(70);
		objBinaryTreeLinkedList.insertNode(80);
		objBinaryTreeLinkedList.insertNode(90);
		
		
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
		objBinaryTreeLinkedList.searchNode(10);
		
		objBinaryTreeLinkedList.deleteAllNodes();
	
		
	}
}
