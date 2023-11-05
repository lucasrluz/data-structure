package datastructure.app;

public class CircularSinglyLinkedList {
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
		if (this.head == null) {
			Node newNode = new Node(data);

			this.head = newNode;

			return;
		}
		
		// Caso tenha um ou mais elementos na lista.
		Node current = this.head;

		while(true) {
			// caso tiver 1 elemento na lista
			if (current.next == null) {
				Node newNode = new Node(data);

				current.next = newNode;
				current.next.next = this.head;

				break;
			}
			
			// Quando chega no final da lista.
			if (current.next == this.head) {
				Node newNode = new Node(data);

				current.next = newNode;
				current.next.next = this.head;

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

		// Caso tenha um elemento na lista e seja o que queremos remover.
		if (this.head.next == null && this.head.data == data) {
			this.head = null;
			return;
		}

		// Caso queremos remover o primeiro elemento da lista e tenha mais de um elemento adicionado. 
		if (this.head.next != null && this.head.data == data) {
			// Encontra o último Node e aponta ele para o novo Node do head.
			Node current = this.head;

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

		// Caso tenha dois elementos na lista e queremos remover o último elemento.
		if (this.head.next.next == this.head && this.head.next.data == data) { 
			this.head.next = null;
			return;
		}

		// Caso tenha mais de dois elementos na lista e queremos remover um elemento depois do segundo.
		Node current = this.head;

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
		// Caso a lista esteja vazia.
		if (this.head == null) {
			return false;
		}

		// Caso tenha um elemento na lista.
		if (this.head.data == data) {
			return true;
		}

		// Caso tenha mais de um elemento na lista.
		Node current = this.head;	

		while(true) {
			// Caso tenha dois elemento na lista e queremos remover o último elemento.
			if (current.next == this.head && current.data == data) {
				return true;
			}	

			// Caso tenha dois elementos na lista e não encontre o elemento para remover.
			if (current.next == this.head && current.data != data) {
				return false;
			}

			// Caso tenha mais de dois elementos na lista e encontre o elemento para remover.
			if (current.next.data == data) {
				return true;
			}

			current = current.next;
		}
	}

	public String get() {
		// Caso a lista esteja vazia.
		if (this.head == null) {
			return "";
		}

		String circularSinglyLinkedList = this.head.data + " ";

		// Caso tenha um elemento na lista.
		if (this.head.next == null) {
			return circularSinglyLinkedList;
		}

		Node current = this.head.next;	
	
		// Caso tenha mais de um elemento na lista.
		while(true) {
			circularSinglyLinkedList += current.data + " ";

			current = current.next;

			if (current == this.head) {
				break;
			}
		}

		return circularSinglyLinkedList;
	}
}
