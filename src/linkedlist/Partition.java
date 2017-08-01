//Given a linkeed list partition it around x, such that values less than x appear before and values equal to x and above appear after.
//CTCI 2.5
package linkedlist;

public class Partition {
	
	private static Node getPartitionList(Node head, int x) {
		Node lesserHead = new Node(1);
		Node lesser = lesserHead;
		Node greaterHead = new Node(0);
		Node greater = greaterHead;
		Node equalHead = new Node(0);
		Node equal = equalHead;
		Node curr = head;
		while(curr != null) {
			if(curr.data < x) {
				lesser.link = curr;
				lesser = lesser.link;
			}
			else if(curr.data > x) {
				greater.link = curr;
				greater = greater.link;
			}
			else {
				equal.link = curr;
				equal = equal.link;
			}
			curr = curr.link;
		}
		Node outHead = null;
		if(lesserHead.link != null) {
			outHead = lesserHead.link;
		}
		else if(equalHead.link != null) {
			outHead = equalHead.link;
		}
		else {
			outHead = greaterHead.link;
		}
		if(lesser != null)
			lesser.link = equalHead.link;
		if(equal != null)
			equal.link = greaterHead.link;
		return outHead;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = Node.initializeRandomSample();
		Node h = getPartitionList(head, 3);
		Node.printList(h);
	}

}