//A Simple Representation of a Node in a linked list.
package linkedlist;

public class Node {
	int data;
	Node link;
	
	public Node ()
	{
		this.link = null;
				
	}
	public Node(int data)
	{
		this.data = data;
		this.link = null;
	}
	
	public static void printList(Node head)
	{
		if(head == null)
		    System.out.println("null");
		while(head != null)
		{
			System.out.print(head.data + "--->");
			head = head.link;
		}
	}
	
	public static Node initializeSample()
	{
		Node a = new Node(2);
		Node b = new Node(4);
		Node c = new Node(6);
		Node d = new Node(8);
		Node e = new Node(10);
		Node f = new Node(12);
		a.link = b; b.link = c; c.link=d; d.link = e; e.link = f;f.link = null;
	    Node start= a;	
	    while (start!= null)
	    {
//	    	System.out.print(start.data + "---->");
	    	start = start.link;
	    }
	    return a;
	}
	
	public static Node initializeSampleB()
	{
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		a.link = b; b.link = c; c.link=d; d.link = e; e.link = null;
	    Node start= a;	
	    while (start!= null)
	    {
//	    	System.out.print(start.data + "---->");
	    	start = start.link;
	    }
	    return a;
	}
	
}
