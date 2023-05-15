//Name:- Shailesh Buddthinath Pandey
//PRN:-  230310120029

package cdac.in;

import java.util.Scanner;

class LinkedListNode {
	int value;
	LinkedListNode next;

	public LinkedListNode(int value) {// O(1)-->time complexity and space complexity is O(1)
		this.value = value;
		this.next = null;
	}
}

public class Question1 {

	LinkedListNode head;

	public LinkedListNode insertNodeInBeg(int value, LinkedListNode head) {// O(1)-->time complexity and space
																			// complexity is O(1)
		LinkedListNode newNode = new LinkedListNode(value);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		return head;
	}

	public void insertNodeInLast(int value) {// O(1)-->time complexity and space complexity is O(1)
		LinkedListNode newNode = new LinkedListNode(value);
		if (head == null) {
			head = newNode;
			return;
		}
		LinkedListNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	public void insertAtPosition(int value, int position) {// O(n)-->time complexity and space complexity is O(n)
		LinkedListNode newNode = new LinkedListNode(value);
		if (position == 1) {
			newNode.next = head;
			head = newNode;
			return;
		}
		LinkedListNode current = head;
		for (int i = 1; i < position - 1 && current != null; i++) {
			current = current.next;
		}
		if (current == null) {
			System.out.println("Invalid position");
			return;
		}
		newNode.next = current.next;
		current.next = newNode;
	}

	public int lengthOfLinkedList(LinkedListNode head) {// O(n)-->time complexity and space complexity is O(1)
		LinkedListNode temp = head;
		int count = 0;
		if (temp == null) {
			return 0;
		} else {
			while (temp != null) {
				temp = temp.next;
				count++;
			}
		}
		return count;
	}

	public void displayNode(LinkedListNode head) {// O(n)-->time complexity and space complexity is O(1)
		LinkedListNode temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
	}

	public void reverse() {// O(n)-->time complexity and space complexity is O(n)
		LinkedListNode prev = null;
		LinkedListNode current = head;
		LinkedListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public void deleteAtPosition(int location) {// O(n)-->time complexity and space complexity is O(1)
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		if (location == 1) {
			head = head.next;
			return;
		}
		LinkedListNode current = head;
		for (int i = 1; i < location - 1 && current != null; i++) {
			current = current.next;
		}
		if (current == null || current.next == null) {
			System.out.println("Invalid position");
			return;
		}
		current.next = current.next.next;
	}

	public static void main(String[] args) {
		Question1 main = new Question1();
		main.head = null;
		char choice;
		Scanner scr = new Scanner(System.in);

		do {
			System.out.println("********* MENU *********");
			System.out.println("1.Insert node in the Beginning ");
			System.out.println("2.Insert node at the last");
			System.out.println("3.Insert node at a  particular position");//
			System.out.println("4.Delete node at a particular position");
			System.out.println("5.Length of Linked List");
			System.out.println("6.Reverse the Linked List");
			System.out.println("7.Display the Linked List");
			System.out.println("8.EXIT");

			System.out.print("Enter the choice: ");
			int input = scr.nextInt();

			switch (input) {
			case 1:
				System.out.print("Enter the node value: ");
				main.head = main.insertNodeInBeg(scr.nextInt(), main.head);
				break;

			case 2:
				System.out.print("Enter the node value: ");
				main.insertNodeInLast(scr.nextInt());
				break;

			case 3:
				System.out.print("Enter the node value: ");
				int value = scr.nextInt();
				System.out.print("Enter the node position: ");
				int position = scr.nextInt();
				main.insertAtPosition(value, position);
				break;
			case 4:
				System.out.print("Enter the location of node you want to delete : ");
				main.deleteAtPosition(scr.nextInt());
				break;

			case 5:
				System.out.println("Total number of Nodes: " + main.lengthOfLinkedList(main.head));
				break;
			case 6:
				System.out.println("Reverse the LinkedList: ");
				main.reverse();

				break;
			case 7:
				main.displayNode(main.head);
				break;
			case 8:
				System.exit(0);
				break;

			default:
				System.out.println("\nPlease enter the correct choice ");
				break;
			}
			System.out.print("\n Do you want to continue: y/n ");
			choice = scr.next().charAt(0);
			if (choice == 'y' || choice == 'Y') {

			} else {
				System.out.println("Please enter the valid input");
			}

		} while (choice == 'Y' || choice == 'y');

		scr.close();
	}

}
