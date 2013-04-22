
public class Node<T> {

	private T data;
	private Node next;
	public Node(T entry, Node top) {
		this.data=entry;
		this.next=top;
	}

	public T getData() {
		
		return data;
	}

	public Node traverseNode() {
		
		return next;
	}

}
