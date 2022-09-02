package src;

public class QueueNode {

	private String data;
	public QueueNode next;
	public QueueNode prev;
	
	public QueueNode(String data) {
		this.data = data;
	}
	
	public String getData() {
		return this.data;
	}
}
