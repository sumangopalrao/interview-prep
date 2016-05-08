package linkedlist;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
