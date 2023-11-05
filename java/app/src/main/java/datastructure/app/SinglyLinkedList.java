package datastructure.app;

public class SinglyLinkedList {
	public class Node {
		public String data;
		public Node next;

		public Node(String data) {
			this.data = data;
		}
	}

	public Node head;

	public void add(String data) {
		// Caso a lista esteja vazia.
		if (this.head == null)	{
			Node newNode = new Node(data);

			this.head = newNode;

			return;
		}

		// Caso tenha mais de um elemento na lista.
		Node current = this.head;

		while(true) {
			if (current.next == null) {
				Node newNode = new Node(data);

				current.next = newNode;

				break;
			}

			current = current.next;
		}
	}

	public void remove(String data) {
		// Caso a lista esteja vazia.
		if (this.head == null) {
			return;
		}

		// Caso o elemento para remover seja o primeiro e a lista tenha um elemento.
		if (this.head.data.equals(data) && this.head.next == null) {
			this.head = null;
			return;
		}

		// Caso o elemento para remover seja o primeiro e a lista tenha mais de um elemento.
		if (this.head.data.equals(data) && this.head.next != null) {
			this.head = this.head.next;
			return;
		}
		
		// Caso a lista tenha mais de um elemento e vamos remover um elemento do meio ou do final.
		Node current = this.head;

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
		Node current = this.head;	

		while(true) {
			// Caso a lista esteja vazia.
			if (current == null) {
				return false;
			}

			// Caso ache o valor.
			if (current.data.equals(data)) {
				return true;
			}

			current = current.next;
		}
	}

	public String get() {
		String linkedList = "";

		Node current = this.head;

		while(true) {
			// Caso a lista esteja vazia.
			if (current == null) {
				return linkedList;
			}

			linkedList += current.data + " ";

			current = current.next;
		}
	}
}
