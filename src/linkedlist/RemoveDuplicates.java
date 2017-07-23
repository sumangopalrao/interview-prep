//WAP to remove duplicates in a linked list.
//CTCI 2.1
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
		
	    Node outA = removeDupsWithSet(a);
	    Node.printList(outA);
	    
	    
	    System.out.println("Output from no space");
	    
	    Node headB = Node.initializeSampleB();
	    Node outB = removeDupsWithoutSpace(headB);
	    Node.printList(outB);
	}

	private static Node removeDupsWithoutSpace(Node a) {
		
		Node head = a;
		Node start = a;
		while(start != null) {
			Node curr = start.link;
			Node prev = start;
			while(curr != null) {
				if(curr.data == start.data) {
					Node next = curr.link;
					prev.link = next;
					curr = next;
				}
				else {
					prev = curr;
					curr = curr.link;
				}
			}
			start = start.link;
		}
		return head;
	}

	private static Node removeDupsWithSet(Node a) {
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
	    return a;
	}

}
