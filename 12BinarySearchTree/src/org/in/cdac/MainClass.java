package org.in.cdac;

public class MainClass {
public static void main(String[] args) {
		
		BinarySearchTree objBinarySearchTree = new BinarySearchTree();
		objBinarySearchTree.insertNode(20);
		objBinarySearchTree.insertNode(10);
		objBinarySearchTree.insertNode(50);
		objBinarySearchTree.insertNode(5);
		objBinarySearchTree.insertNode(15);
		objBinarySearchTree.insertNode(30);
		objBinarySearchTree.insertNode(65);
		objBinarySearchTree.insertNode(25);
		objBinarySearchTree.insertNode(35);
		objBinarySearchTree.insertNode(60);
		objBinarySearchTree.insertNode(70);
		System.out.println();
		
		System.out.println("PRE-ORDER TRAVERSAL ");
		objBinarySearchTree.preOrder(objBinarySearchTree.root);
		
		System.out.println();
		
		System.out.println("IN-ORDER TRAVERSAL ");
		objBinarySearchTree.inOrder(objBinarySearchTree.root);
		
		System.out.println();
		
		System.out.println("POST-ORDER TRAVERSAL ");
		objBinarySearchTree.postOrder(objBinarySearchTree.root);

		System.out.println();
		
		System.out.println("LEVEL-ORDER TRAVERSAL ");
		objBinarySearchTree.levelOrder();
		
		System.out.println();
		
		System.out.println("MINIMUM VALUE ");
		objBinarySearchTree.minimumValue();
		
		System.out.println();
		
		System.out.println("MAXIMUM VALUE ");
		objBinarySearchTree.maximumValue();
		
		System.out.println();
		
		System.out.println("LEVEL-ORDER TRAVERSAL ");
		objBinarySearchTree.levelOrder();
		
		objBinarySearchTree.deleteNode(objBinarySearchTree.root, 70);
		
		System.out.println();
		
		System.out.println("LEVEL-ORDER TRAVERSAL ");
		objBinarySearchTree.levelOrder();
	}
}
