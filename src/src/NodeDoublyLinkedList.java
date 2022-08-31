package src;

public class NodeDoublyLinkedList {

	public String data = null;
	public NodeDoublyLinkedList next;
	public NodeDoublyLinkedList prev;
	
	public NodeDoublyLinkedList(String data) {
		this.data = data;
	}
	
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getData() {
		return this.data;
	}
}
