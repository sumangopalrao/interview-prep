package linkedlist;

public class Node {
	int data;
	Node link;
	
	public Node(int data)
	{
		this.data = data;
		this.link = null;
	}
	
	public static void printList(Node head)
	{
		while(head != null)
		{
			System.out.print(head.data + "--->");
			head = head.link;
		}
	}
	
	public static Node initializeSample()
	{
		Node a = new Node(5);
		Node b = new Node(4);
		Node c = new Node(2);
		Node d = new Node(6);
		Node e = new Node(4);
		a.link = b; b.link = c; c.link=d; d.link = e; e.link = null;
	    Node start= a;	
	    while (start!= null)
	    {
	    	System.out.print(start.data + "---->");
	    	start = start.link;
	    }
	    return a;
	}
	
}
