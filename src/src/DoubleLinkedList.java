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
}
