package cdac.in;

import java.util.*;

class LinkedListNode {
	int value;
	LinkedListNode next;

	public LinkedListNode(int value) {
		this.value = value;
		this.next = null;
	}
}

public class MainClass {

	LinkedListNode head;

	public LinkedListNode insertNodeInBeg(int value, LinkedListNode head) {
		LinkedListNode newNode = new LinkedListNode(value);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		return head;
	}

	public LinkedListNode insertNodeInLast(int value, LinkedListNode head) {
		LinkedListNode newNode = new LinkedListNode(value);
		LinkedListNode temp = head;
		if (temp == null) {
			head = newNode;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = temp;
		}
		return head;
	}
	
	public int lengthOfLinkedList(LinkedListNode head) {
		LinkedListNode temp = head;
		int count = 0;
		if(temp == null) {
			return 0;
		}
		else {
			while(temp != null) {
				temp = temp.next;
				count++;
			}
		}
		return count;
	}

	public void displayNode(LinkedListNode head) {
		LinkedListNode temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		MainClass main = new MainClass();
		main.head = null;
		char choice;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("************ Main Menu ******************");
			System.out.println("1. Insert Node in the beginning:  ");
			System.out.println("2. Insert Node in the Middle:  ");
			System.out.println("3. Insert Node in the Last:  ");
			System.out.println("4. Delete Node in the LinkedList:  ");
			System.out.println("5. Length of the Linked List:  ");
			System.out.println("6. Display all the nodes:  ");
			System.out.println("7. Close Applications (Exit):  ");
			System.out.print("Enter the choice: ");
			int input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.print("Enter the node value: ");
				main.head = main.insertNodeInBeg(sc.nextInt(), main.head);
				break;

			case 3:
				System.out.print("Enter the node value: ");
				main.head = main.insertNodeInLast(sc.nextInt(), main.head);
				break;
				
			case 5: 
				System.out.println("Total number of Nodes: " + main.lengthOfLinkedList(main.head));
				break;
			case 6:
				main.displayNode(main.head);
				break;
			case 7:
				System.exit(0);
				break;

			default:
				System.out.println("\nPlease enter the correct choice ");
				break;
			}
			System.out.print("\n Do you want to continue: ");
			choice = sc.next().charAt(0);

		} while (choice == 'Y' || choice == 'y');

	}

}
