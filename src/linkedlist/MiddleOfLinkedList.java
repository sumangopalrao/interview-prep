// Leetcode:: Find the middle of a linked list
// https://leetcode.com/problems/middle-of-the-linked-list/description/

package linkedlist;

public class MiddleOfLinkedList {

    public static void main(String[] args) {
        Node head = Node.initializeRandomSample();
        Node h = getMid(head);
        System.out.println(h.data);

    }

    public static Node getMid(Node head) {

        if (head == null || head.link == null)
            return head;

        Node slower = head;
        Node faster = head.link;

        while (slower != faster && faster != null && faster.link != null) {
            faster = faster.link.link;
            slower = slower.link;
        }

        if (faster != null && faster.link == null)
            return slower.link;

        return slower;
    }
}
