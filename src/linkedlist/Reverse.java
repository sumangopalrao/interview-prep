//WAP to reverse a linked list
package linkedlist;

public class Reverse {

	public static void main(String[] args) {
		// TODO:: Implement using recursion
		
		Node curr = Node.initializeSample();
		Node head = curr;
		Node prev = null;
		
		while(curr != null)
		{
			Node next = curr.link;
			curr.link = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		
	    Node.printList(head);
	}
}
