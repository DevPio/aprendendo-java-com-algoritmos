package src;

public class LinkList {
	public Node head;
	public Node tail;

	public static void main(String[] args) {
		LinkList list = new LinkList();

		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		
		list.remove(1);
		
		list.print();
	}

	public void insert(int value) {
		Node node = new Node(value);

		if (this.head == null) {
			this.head = node;
		} else {
			Node currentNode = this.head;

			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}

			currentNode.next = node;
			this.tail = currentNode.next;
		}
	}

	public void remove(int removePosition) {
		Node currentNode = this.head;
		
		if(removePosition - 1 == 0) {
			
			Node temp = currentNode.next;
			this.head = temp;
			return;
		}
		int i = 0;
		Node prev = null;
		while (currentNode != null && i < removePosition - 1) {
			prev = currentNode;
			currentNode = currentNode.next;
			i++;
		}
		
		Node temp = currentNode.next;
		
		prev.next = temp;
		
		
	}

	public void print() {
		Node currentNode = this.head;

		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
}
