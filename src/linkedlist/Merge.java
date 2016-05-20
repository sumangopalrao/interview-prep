//WAP to do a merge sort on two linked lists and store in a new linked list.
package linkedlist;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node currA = Node.initializeSample();
		Node currB = Node.initializeSampleB();
		Node c = merge(currA, currB);
	    Node.printList(c);	
	}
	
	static Node merge(Node headA, Node headB)
	{
		if(headA== null || headB == null)
			return null;
		
		Node currA = headA;
		Node currB= headB;
		Node currC = new Node();
		Node headC = currC;
		
		while(currA != null && currB != null)
		{
		    if(currA.data <= currB.data)
		    {
		    	currC.link = currA;
		    	currA = currA.link;
		    }
		    else if(currA.data >= currB.data)
		    {
		    	currC.link = currB;
		    	currB = currB.link;
		    }
		    currC = currC.link;
		}
		
		while(currA != null)
		{
			currC.link = currA;
			currC = currC.link;
			currA = currA.link;
		}
		
		while(currB != null)
		{
			currC.link = currB;
			currC = currC.link;
			currB = currB.link;
		}
		
		return headC.link;
		
		
		
	}

}
