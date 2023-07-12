// Leetcode:: Reorder the linked list in with alternating between first and last
// https://leetcode.com/problems/reorder-list/description/

package linkedlist;

public class ReorderList {

    public static void main(String[] args) {
        Node head = Node.initializeRandomSample();
        reorderList(head);
        Node.printList(head);
    }

    public static void reorderList(Node head) {

        Node mid = getMid(head);
        System.out.println("Mid is" + mid.data);
        Node reversedMidHead = reverseNode(mid.link);
        mid.link = null;
        Node curr = head;
        Node revCurr = reversedMidHead;
        while (curr != null && revCurr != null) {

            Node currNext = curr.link;
            Node currRevNext = revCurr.link;

            curr.link = revCurr;
            revCurr.link = currNext;

            curr = currNext;
            revCurr = currRevNext;
        }
    }
        


    public static Node getMid(Node head) {

        if (head == null || head.link == null)
            return head;

        Node slower = head;
        Node faster = head.link;

        while (faster != null && faster.link != null) {
            faster = faster.link.link;
            slower = slower.link;
        }
        return slower;
    }

    private static Node reverseNode(Node head) {
		if (head == null) 
			return null;

		if (head.link == null)
			return head;

		Node newHead = reverseNode(head.link);

		head.link.link = head;
		head.link = null;

		return newHead;
	}
}
