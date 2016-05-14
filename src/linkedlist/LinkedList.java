package linkedlist;

public class LinkedList {
	
	Node head;
	
	
	LinkedList()
	{
		this.head = null;
	}
	
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		Node a = new Node(2);
		Node b = new Node(4);
		Node c = new Node(6);
		Node d = new Node(8);
		Node e = new Node(10);
		a.link = b; b.link = c; c.link=d; d.link = e; e.link = null;
	    
		list.head = a;
		
//		list.printList();
		
		Node first = new Node(100);
		list.insertNodeAtFirst(first);
		
		Node newNode = new Node(200);
//		list.insertNodeAfterGivenNode(e, newNode);
		
		list.insertNodeAtEnd(newNode);
		list.printList();
	}
	
	public void printList()
	{
	    Node curr = head;
	    while(curr != null)
	    {
	    	System.out.print(curr.data + "-->");
	    	curr = curr.link;
	    }
	}
	
	
	public void insertNodeAtFirst(Node a)
	{
	    a.link = head;
	    head = a;
	}
	
	public void insertNodeAfterGivenNode(Node oldNode, Node newNode)
	{
		if(oldNode == null)
		{
			System.out.println("Previous node cannot be null");
			return;
		}

		newNode.link = oldNode.link;
		oldNode.link = newNode;
	    //inserting after a value
//	    while (curr != null) {
//	    	if(curr.data == oldNode.data) {
//	    		Node next = curr.link;
//	    		curr.link = newNode;
//	    		newNode.link = next;
//	    		return;
//	    	}
//	    	curr = curr.link;
//	    }
	}
	
	public void insertNodeAtEnd(Node newNode) {
		if(head== null)
		{
			head = newNode;
			return;
		}
	    Node curr = head;
	    while (curr.link != null) {
	    	curr = curr.link;
	    }
	    curr.link = newNode;
	    return;
	}
	

}
