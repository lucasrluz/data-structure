package datastructure.app;

public class CircularSinglyLinkedList {
	public SinglyNode head;

	public void add(String data) {
		if (this.head == null) {
			SinglyNode newNode = new SinglyNode(data);

			this.head = newNode;

			return;
		}

		SinglyNode current = this.head;

		while(true) {
			// caso tiver 1 elemento na lista
			if (current.next == null) {
				SinglyNode newNode = new SinglyNode(data);

				current.next = newNode;
				current.next.next = this.head;

				break;
			}

			if (current.next == this.head) {
				SinglyNode newNode = new SinglyNode(data);

				current.next = newNode;
				current.next.next = this.head;

				break;
			}

			current = current.next;
		}
	}

	public void remove(String data) {
		if (this.head == null) {
			return;
		}	

		if (this.head.next == null && this.head.data == data) {
			this.head = null;
			return;
		}

		if (this.head.next != null && this.head.data == data) {
			SinglyNode current = this.head;

			while(true) {
				if (current.next == this.head) {
					this.head = this.head.next;
					current.next = this.head;

					break;
				}

				current = current.next;
			}

			return;
		}

		if (this.head.next.next == this.head && this.head.next.data == data) { 
			this.head.next = null;
			return;
		}

		SinglyNode current = this.head;

		while(true) {
			if (current.next == this.head) {
				break;
			}

			if (current.next.data == data) {
				current.next = current.next.next;

				break;
			}

			current = current.next;
		}
	}

	public boolean get(String data) {
		return true;
	}

	public String get() {
		return "";
	}
}
