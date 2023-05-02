package org.in.cdac;

import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreeLinkedList {
	BinaryNode root;

	public BinaryTreeLinkedList() {
		this.root = null;
	}

	// preOrder Traversal
	public void preOrder(BinaryNode node) {
		if (node == null) {// base condition
			return;
		}
		System.out.print(node.value + "-->"); // first visit the root node

		preOrder(node.left); // time complexity is O(n)
		preOrder(node.right);
	}

	// inOrder Traversal
	public void inOrder(BinaryNode node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.value + "-->");
		inOrder(node.right);
	}

	// postOrder Traversal
	public void postOrder(BinaryNode node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value + "-->");
	}

	// levelOrder Traversal
	public void leverOrder() {
		Queue<BinaryNode> ObjQueue = new LinkedList<BinaryNode>();
		ObjQueue.add(root);
		while (!ObjQueue.isEmpty()) {// time and space complexity is O(n)
			BinaryNode presentNode = ObjQueue.remove();
			System.out.print(presentNode.value + "-->");
			if (presentNode.left != null) {
				ObjQueue.add(presentNode.left);
			}
			if (presentNode.right != null) {
				ObjQueue.add(presentNode.right);
			}
		}
	}

	// insert Node method
	public void insertNode(int value) {
		BinaryNode newNode = new BinaryNode();
		newNode.value = value;
		if (root == null) {
			root = newNode;
			System.out.println("New Node inserted!! ");
			return;
		}
		Queue<BinaryNode> ObjQueue = new LinkedList<BinaryNode>();
		ObjQueue.add(root);
		while (!ObjQueue.isEmpty()) { // time and space complexity is O(n)
			BinaryNode presentNode = ObjQueue.remove();
			if (presentNode.left == null) {
				presentNode.left = newNode;
				System.out.println("Node inserted Successfully");
				break;
			} else if (presentNode.right == null) {
				presentNode.right = newNode;
				System.out.println("Node inserted Successfully");
				break;
			} else {
				ObjQueue.add(presentNode.left);
				ObjQueue.add(presentNode.right);
			}
		}
	}

	// search node
	public void searchNode(int searchValue) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode tempNode = queue.remove();
			if (tempNode.value == searchValue) {
				System.out.println("The Value " + searchValue + " is found in Tree");
				return;
			} else {
				if (tempNode.left != null) {
					queue.add(tempNode.left);
				}
				if (tempNode.right != null) {
					queue.add(tempNode.right);
				}
			}
		}
		System.out.println("The Value " + searchValue + " is not found in Tree");
	}

	//Deepest Node/Leaf Node
	
	
	
	
	
	
	
	
	//Delete the all Nodes
	public void deleteAllNodes() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		root.left=null;
		root.right= null;
		root.value=0;
		System.out.println("All nodes are deleted successfully");
	}
	
	
	
	
}

