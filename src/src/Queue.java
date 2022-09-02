package src;

public class Queue {
	
	public QueueNode head;
	public QueueNode tail;
	public int size = 0;

	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.offer("A");
		queue.offer("B");
		
		queue.print();
		
	}
	
	private void print() {
		QueueNode currentNode = this.head;
		
		while(currentNode != null) {
			System.out.println(currentNode.getData());
			
			currentNode = currentNode.prev;
		}
		
	}

	public void offer(String data) {
		
		if(this.head == null) {
			this.head = new QueueNode(data);
			
			this.tail = this.head;
		}else {
			QueueNode node = new QueueNode(data);
			
			node.next = tail;
		
			tail.prev = node;
			tail = node;
		}
		this.size++;
	}
}
