package datastructure.app;

public class SinglyLinkedList {
	public SinglyNode head;

	public void add(String data) {
		if (this.head == null)	{
			SinglyNode newNode = new SinglyNode(data);

			this.head = newNode;

			return;
		}

		SinglyNode current = this.head;

		while(true) {
			if (current.next == null) {
				SinglyNode newNode = new SinglyNode(data);

				current.next = newNode;

				break;
			}

			current = current.next;
		}
	}

	public void remove(String data) {
		if (this.head == null) {
			return;
		}

		if (this.head.data.equals(data) && this.head.next == null) {
			this.head = null;
			return;
		}

		if (this.head.data.equals(data) && this.head.next != null) {
			this.head = this.head.next;
			return;
		}
		
		SinglyNode current = this.head;

		while(true) {
			if (current.next == null) {
				break;
			}

			if (current.next.data.equals(data)) {
				current.next = current.next.next;	

				break;
			}

			current = current.next;
		}
	}

	public boolean get(String data) {
		SinglyNode current = this.head;	

		while(true) {
			if (current == null) {
				return false;
			}

			if (current.data.equals(data)) {
				return true;
			}

			current = current.next;
		}
	}

	public String get() {
		String linkedList = "";

		SinglyNode current = this.head;

		while(true) {
			if (current == null) {
				return linkedList;
			}

			linkedList += current.data + " ";

			current = current.next;
		}
	}
}
