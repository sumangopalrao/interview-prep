// Given a linked list find the maximum sum of an element in the linked list along with its twin which is at the same index from the end of the list.
// Leetcode: https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/

package linkedlist;

public class MaximumTwinSum {

    public static void main(String[] args) {
        Node head = Node.initializeRandomSample();
        Node a = new Node(1);
		Node b = new Node(2);
        a.link = b;
        Node.printList(head);
        System.out.println("Maximum Sum is" + maximumSum(head));
        System.out.println("Maximum Sum is" + maximumSum(a));
    }

    private static int maximumSum(Node head) {
        if (head.link == null) {
            return head.data;
        }
        int maxSum = Integer.MIN_VALUE;
        Node mid = getMid(head);
		Node revCurr = reverse(mid);
		Node curr = head;
		while(curr != revCurr) {
            int sum = curr.data + revCurr.data;
            if (sum > maxSum) {
                maxSum = sum;
            }
            curr = curr.link;
			if(revCurr.link != null) {
				revCurr = revCurr.link;
			}
		}
        return maxSum;
    }
	
	private static Node reverse(Node head) {
		Node curr = head;
		Node prev = null;
		while(curr != null) {
		    Node next = curr.link;
		    curr.link = prev;
		    prev = curr;
		    curr = next;
		}
		return prev;
	}
	
	private static Node getMid(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.link != null) {
			fast = fast.link.link;
			slow = slow.link;
		}
		return slow;
	}
}
