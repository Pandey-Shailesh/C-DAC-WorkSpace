package org.in.cdac;

public class MainClass {

	public static void main(String[] args) {
		
		BinarySearchTree objBinarySearchTree = new BinarySearchTree();
		objBinarySearchTree.insertNode(52);
		objBinarySearchTree.insertNode(36);
		objBinarySearchTree.insertNode(68);
		objBinarySearchTree.insertNode(24);
		objBinarySearchTree.insertNode(59);
		objBinarySearchTree.insertNode(72);
		objBinarySearchTree.insertNode(70);
		objBinarySearchTree.insertNode(80);
		objBinarySearchTree.insertNode(75);
		
		
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
		
		objBinarySearchTree.deleteNode(objBinarySearchTree.root, 72);
		
		System.out.println();
		
		System.out.println("LEVEL-ORDER TRAVERSAL ");
		objBinarySearchTree.levelOrder();
	}
}
