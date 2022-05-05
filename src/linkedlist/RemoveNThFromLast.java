// Program to remove the nth from the last of a linked list
package linkedlist;

public class RemoveNThFromLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = Node.initializeSample();
		System.out.println(getKthNode(head, 3).data);
	}

	private static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode currLast = head;
        int i = 0;
        while (curr != null && i<n) {
            curr = curr.next;
            i++;
        }
        if (curr == null) {
            return head.next;
        }

        ListNode prev = head;
        
        while (curr.next != null) {
            curr = curr.next;
            currLast = currLast.next;
        }
        
        currLast.next = currLast.next.next;
        return head;
    }
}
