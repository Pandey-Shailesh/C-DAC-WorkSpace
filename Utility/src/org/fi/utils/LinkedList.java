package org.fi.utils;


public class LinkedList<T> {

	Node<T> start;
	Node<T> end;
	Node<T> current;
	int maxCount;

	public void add(T data) {
		Node<T> tempNode = new Node<>(data);// Type inference
		if (start == null) {
			start = end = current = tempNode;
		} else {
			end.next = tempNode;
			tempNode.previous = end;
			end = tempNode;
		}
		maxCount++;
	}

	public void delete(int index) {
		if (index > maxCount - 1) {
			return;
		}
		if (start == end) {
			start = end = current = null;
		} else if (index == 0) {
			start = start.next;
			start.previous = null;
		} else if (index == maxCount - 1) {
			end = end.previous;
			end.next = null;
		} else {
			Node<T> tempNode = start;
			for (int iTemp = 0; iTemp < index; iTemp++)
				tempNode = tempNode.next;

			tempNode.next.previous = tempNode.previous;
			tempNode.previous.next = tempNode.next;

		}
		maxCount--;
		current = start;
	}

	public T getFirst() {
		if (start == null)
			return null;

		current = start;
		return (T) current.data;
	}

	public T getLast() {
		if (start == null)
			return null;

		current = end;
		return (T) current.data;
	}

	public T getNext() {
		if (start == null || current == end)
			return null;

		current = current.next;
		return (T) current.data;
	}

	public T getPrevious() {
		if (start == null || current == start)
			return null;

		current = current.previous;
		return (T) current.data;
	}

}
