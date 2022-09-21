// Leetcode:: Swap nodes of a linked list in pairs
package linkedlist;

public class SwapNodes {

    public static void main(String[] args) {
//        Node head = Node.initializeSample();
        Node head = Node.initializeRandomSample();
        Node res = swapNodes(head);
        Node.printList(res);
    }

    private static Node swapNodes(Node head) {
        if (head == null) {
            return null;
        }

        if (head.link == null) {
            return head;
        }


        Node next = head.link;
//        Node nextHead = next.link;
//        next.link = head;
        head.link = swapNodes(next.link);
        next.link = head;

        return next;
    }
}
