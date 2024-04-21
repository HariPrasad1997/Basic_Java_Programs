package linkedList;

public class MyLinkedList {

	Node head; // where linkedlist starts

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data; // integer data
			next = null; // reference to the next node in the list
		}
	}

	private static MyLinkedList insertElements(MyLinkedList list, int data) {

		Node newNode = new Node(data);

		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = newNode;
		}

		return list;
	}

	private static void printList(MyLinkedList list) {
		Node currentNode = list.head;
		System.out.println("Linked List");
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		insertElements(list, 1);
		insertElements(list, 2);
		insertElements(list, 3);
		insertElements(list, 4);

		printList(list);

	}

}
