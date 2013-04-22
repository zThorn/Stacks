
public class Stack<T>
{
	private Node top;
	
	public Stack()
	{
		top=null;
	}
	
	public void push(T entry)
	{
		Node temp = new Node(entry,top);
		top = temp;
	}
	
	public T pop()
	{
		T temp = peek();
		if(temp!=null)
			top = top.traverseNode();
		return temp;
	}

	public T peek() {
		T temp = null;
		if(top != null)
			temp=(T) top.getData();
		return temp;
	}
	
	public boolean isEmpty()
	{
		return top == null;
	}
	
	public void clear()
	{
		top = null;
	}
	
}
