//A simple implementation of a linked list.
package linkedlist;

public class LinkedList {
	
	Node head;
	
	
	LinkedList()
	{
		this.head = null;
	}
	
	LinkedList(Node head) {
		this.head = head;
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
				list.nodeDeletePosition(3);
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
	
	public void deleteNode(int data) {
		Node node = new Node(data);
        if(head.link== null && head.data == data)
        {
        	head = null;
        	return;
        }
        
		Node curr = head;
		Node prev=null;
		while(curr != null)
		{
			if(curr.data == node.data) {
				prev.link = curr.link;
				return;
			}
			prev = curr;
			curr = curr.link;
		}
		return;
		
	}
	
	
	public void nodeDeletePosition(int pos)
	{
		if(head == null) {
			return;
		}
		if(head.link == null && pos == 1) {
			head = null;
			return;
		}
		if(pos == 1) {
			head = head.link;
			return;
		}
	    int i=1;	
	    Node curr = head;
	    Node prev = null;
	    while(curr != null && i != pos) {
	    	i++;
	    	prev = curr;
	    	curr = curr.link;
	    }
	    if(i == pos) {
	    	prev.link= curr.link;
	    }
	    return;

	}
}