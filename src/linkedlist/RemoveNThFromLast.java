// Program to remove the nth from the last of a linked list
package linkedlist;

public class RemoveNThFromLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = Node.initializeSample();
        Node res = removeNthFromEnd(head, 3);
		System.out.println(res.data);
	}

	private static Node removeNthFromEnd(Node head, int n) {
        Node curr = head;
        Node currLast = head;
        int i = 0;
        while (curr != null && i<n) {
            curr = curr.link;
            i++;
        }
        if (curr == null) {
            return head.link;
        }

        Node prev = head;
        
        while (curr.link != null) {
            curr = curr.link;
            currLast = currLast.link;
        }
        
        currLast.link = currLast.link.link;
        return head;
    }
}
