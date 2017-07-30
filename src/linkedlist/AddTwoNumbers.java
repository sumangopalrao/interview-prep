/*** Leetcode #2 ***/
//CTCI 2.5

package linkedlist;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node currA = Node.initializeSample();
		Node currB = Node.initializeSampleB();
		Node c = add(currA, currB);
	    Node.printList(c);	

	}
	
	static Node add(Node headA, Node headB) {
	    Node currA = headA;
	    Node currB = headB;
	    Node res_head = null;
	    Node temp = null;
	    Node prev = null;
	    int carry = 0;
	    while(currA != null || currB != null)
	    {
	         int sum = (currA != null ? currA.data : 0) + (currB != null ? currB.data : 0)+ carry;
	         carry = (sum > 10 ? 1: 0);
	         sum = sum % 10;
       	     temp = new Node(sum);
       	     if(res_head == null)
       	    	 res_head = temp;
       	     else 	prev.link = temp;
       	     prev = temp;
       	     
	         if(currA != null)
     	         currA = currA.link;
	         if(currB != null)
     	         currB = currB.link;
	    } 
	    if(carry > 0) {
	         temp.link= new Node(carry);
	    }
	    return res_head;
	}
}
