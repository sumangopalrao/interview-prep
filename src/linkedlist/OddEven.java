// LC Odd Even Linked List
// Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
package linkedlist;

public class OddEven {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node currA = Node.initializeSample();
		Node c = oddEvenList(currA);
	    Node.printList(c);	
	}


    public static Node oddEvenList(Node head) {
        if(head == null) {
            return null;
        }
        if (head.link == null) {
            return head;
        }
        Node oddHead = head;
        Node evenHead = head.link;
        Node oddCurr = head;
        Node evenCurr = head.link;
        while (oddCurr != null && oddCurr.link != null && evenCurr != null && evenCurr.link != null) {
            oddCurr.link = oddCurr.link.link;
            evenCurr.link = evenCurr.link.link;
            oddCurr = oddCurr.link; 
            evenCurr = evenCurr.link; 
        }
        oddCurr.link = evenHead;
        return oddHead; 
    } 
}
