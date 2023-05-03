package org.in.cdac;

import java.util.Queue;
import java.util.LinkedList;

public class BinarySearchTree {

	BinaryNode root;

	public BinarySearchTree() {
		root = null;
	}

	// Insert Node
	public BinaryNode insert(BinaryNode currentNode, int value) {// time coplexity is O(log n)
		if (currentNode == null) {
			BinaryNode newNode = new BinaryNode();
			newNode.value = value;
			System.out.println("Node is add in BST ");
			return newNode;
		} else if (value <= currentNode.value) {
			currentNode.left = insert(currentNode.left, value);
			return currentNode;
		} else {
			currentNode.right = insert(currentNode.right, value);
			return currentNode;
		}
	}

	public void insertNode(int value) {
		root = insert(root, value);
	}

	// preOrder Traversal
	public void preOrder(BinaryNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.value + "--->");
		preOrder(node.left);
		preOrder(node.right);
	}

	// inOrder Traversal
	public void inOrder(BinaryNode node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.value + "--->");
		inOrder(node.right);
	}

	// postOrder Traversal
	public void postOrder(BinaryNode node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value + "--->");
	}

	// levelOrder Traversal
	public void levelOrder() {
		Queue<BinaryNode> objQueue = new LinkedList<BinaryNode>();
		objQueue.add(root);
		while (!objQueue.isEmpty()) {// time and space complexity is O(n)
			BinaryNode presentNode = objQueue.remove();
			System.out.print(presentNode.value + "-->");
			if (presentNode.left != null) {
				objQueue.add(presentNode.left);
			}
			if (presentNode.right != null) {
				objQueue.add(presentNode.right);
			}
		}
	}

	// find minimum
	public void minimumValue() {
		int min = Integer.MIN_VALUE;
		Queue<BinaryNode> objQueue = new LinkedList<BinaryNode>();
		objQueue.add(root);
		while (!objQueue.isEmpty()) {// time and space complexity is O(1)
			BinaryNode presentNode = objQueue.remove();
			min = presentNode.value;
			if (presentNode.left != null) {
				objQueue.add(presentNode.left);
			}
		}
		System.out.println("The minimum value is " + min);
	}

	// find maximum
	public void maximumValue() {
		int max = Integer.MAX_VALUE;
		Queue<BinaryNode> objQueue = new LinkedList<BinaryNode>();
		objQueue.add(root);
		while (!objQueue.isEmpty()) {// time and space complexity is O(1)
			BinaryNode presentNode = objQueue.remove();
			max = presentNode.value;
			if (presentNode.right != null) {
				objQueue.add(presentNode.right);
			}
		}
		System.out.println("The maximum value is " + max);
	}

	// maximum value in BST
		public BinaryNode minimumNode(BinaryNode root) {
			if (root.left == null) {
				return root;
			} else {
				return maximumNode(root.left);
			}
		}
	
	
	// maximum value in BST
		public BinaryNode maximumNode(BinaryNode root) {
			if (root.right == null) {
				return root;
			} else {
				return maximumNode(root.right);
			}
		}


	
	
	//delete node
	public BinaryNode deleteNode(BinaryNode root, int value) {
		if (root==null) {
			System.out.println("The value is not found in Binary Search Tree");
			return null;
		}
		if (value <root.value) {
			root.left = deleteNode(root.left,value);
		}
		else if(value> root.value) {
			root.right =deleteNode(root.right,value);
		}
		else {
			if (root.left != null && root.right !=null) {
				BinaryNode temp =root;
				BinaryNode miniNodeForRight = minimumNode(temp.right);
				root.value = miniNodeForRight.value;
				root.right = deleteNode(root.right,miniNodeForRight.value);
			}
			else if(root.left !=null) {
				root =root.left;
			}
			else if(root.right !=null) {
				root =root.right;
			}
			else {
				root =null;
			}
		}
		return root;
	}

}
