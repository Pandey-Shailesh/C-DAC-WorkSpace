package org.fi.utils;

//Generics

public class Node<T> {

	Node<T> previous;
	Node<T> next;
	Object data;

	public Node(T data) {
		this.data = data;
	}
}
