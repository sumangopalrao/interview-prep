//WAP to remove duplicates in a linked list.
package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	    
	    Set<Integer> values = new HashSet<Integer>();
	    Node prev = null;
	    start = a;
	    while (start != null)
	    {
	    	if(values.contains(start.data))
	    	{
	    		prev.link = start.link;
	    	}
	    	else {
	    		values.add(start.data);
     	    	prev = start;
	    	}
	    	start = start.link;
	    }
	    System.out.println("Output");
	    Node.printList(a);

	}

}
