//Program to find the kth to last in a linked list.
//CTCI 2.2
package linkedlist;

public class KthToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = Node.initializeSample();
		System.out.println(getKthNode(head, 3).data);
	}

	private static Node getKthNode(Node head, int k) {
		// TODO Auto-generated method stub
		Node currA = head;
		Node currB = head;
		while(k >= 0) {
			currB = currB.link;
			k--;
		}
		
		while(currB != null) {
			currA = currA.link;
			currB = currB.link;
		}
		return currA;
	}

}
