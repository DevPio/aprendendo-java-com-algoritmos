package src;

public class DoubleLinkedList {

	public  NodeDoublyLinkedList head;
	public  NodeDoublyLinkedList tail;
	
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		
		
		list.insert("A");
		list.insert("B");
		list.insert("C");
		list.insert("D");
		
		list.remove(1);
		list.print();
	
	}
	
	
	
	public  void insert(String value) {
		NodeDoublyLinkedList node = new NodeDoublyLinkedList(value);
		if(this.head == null) {
			
			this.head = node;
		}else {
			NodeDoublyLinkedList currentNode = this.head;
			
			while(currentNode.next != null) {
				
				currentNode = currentNode.next;
			}
			
			
			node.next = currentNode.next;
			
			currentNode.next = node;
			
			node.prev = currentNode;
			//node.next.prev = node;
			
		}
	}
	
	public void remove(int position) {
		NodeDoublyLinkedList currentNode = this.head;
		int iterationPosition = 0;
		
		while(currentNode.next != null && iterationPosition < position -1 ) {
			currentNode = currentNode.next;
			iterationPosition++;
		}
		
		
		
		
		NodeDoublyLinkedList temp = currentNode.next;
		
		
		
		currentNode.next = temp.next.next;
		
		currentNode.next.prev = currentNode;
		
		currentNode.next = null;
		currentNode.prev = null;
		
		
		//currentNode.prev.next = temp;
	}
	public void print() {
		NodeDoublyLinkedList currentNode = this.head;
		NodeDoublyLinkedList prev = null;
		while(currentNode != null) {
			
			System.out.println(currentNode.getData());
			prev = currentNode;
			currentNode = currentNode.next;
		}
		currentNode = prev;
		System.out.println();
		while(currentNode != null) {
			
			System.out.println(currentNode.getData());
			currentNode = currentNode.prev;
		}
	}
}
