package org.in.cdac;

class Node{
	String value;
	Node left,right;
	
	public Node(String value) {
		this.value=value;
		left= right=null;
	}
}


public class BinaryTree {
	//Root Node
	Node root;
	
 public BinaryTree() {
		root = null;
	}

 //preOrder Traversal
 public void preOrder(Node node) {
	 if (node == null) {
		return;
	}
	 System.out.print(node.value+"-->"); //first visit the root node
	 
	 preOrder(node.left);
	 preOrder(node.right);
}
 
//inOrder Traversal
public void inOrder(Node node) {
	 if (node == null) {
		return;
	}
	 inOrder(node.left);
	 System.out.print(node.value+"-->");
	 inOrder(node.right);
}

//postOrder Traversal
public void postOrder(Node node) {
	 if (node == null) {
		return;
	}
	 postOrder(node.left);
	 postOrder(node.right);
	 System.out.print(node.value+"-->");
}
 
public static void main(String[] args) {
	
	BinaryTree objBinaryTree= new BinaryTree();
	objBinaryTree.root = new Node("A");
	objBinaryTree.root.left =new Node("B");
	objBinaryTree.root.right =new Node("C");
	objBinaryTree.root.left.left =new Node("D");
	objBinaryTree.root.left.right =new Node("E");
	objBinaryTree.root.right.left =new Node("F");
	objBinaryTree.root.right.right =new Node("G");
	
	System.out.println("Pre-Order Traversal : ");
	objBinaryTree.preOrder(objBinaryTree.root);
	
	System.out.println();
	
	System.out.println("Pre-Order Traversal : ");
	objBinaryTree.inOrder(objBinaryTree.root);
	
	System.out.println();
	
	System.out.println("Pre-Order Traversal : ");
	objBinaryTree.postOrder(objBinaryTree.root);
	
}
}
