// WAP to swap the nodes of a linked list based on the index k. 
// K determines the index of node from the beginning and the index of the node from the end.
// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/

package linkedlist;

public class SwappingNodes {
    
    public static Node swapNodes(Node head, int k) {

        Node leftCurr = head;
        int i = 1;
        while (leftCurr != null && i < k) {
            leftCurr = leftCurr.link;
            i++;
        }
        
        Node rightCurr = head;
        Node rightEnd = head;
        for (int j=0; j<k; j++) {
            rightEnd = rightEnd.link;
        }

        while (rightEnd != null) {
            rightCurr = rightCurr.link;
            rightEnd = rightEnd.link;
        }
        swapNodes(leftCurr, rightCurr);
        return head;
        
    }

    public static void swapNodes(Node a, Node b) {
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }

    public static void main(String[] args) {
        Node head = Node.initializeSampleB();
        System.out.println("BEFORE::-----");
        Node.printList(head);
		Node newHead = swapNodes(head, 2);
        System.out.println("AFTER::-----");
        Node.printList(newHead);
    }
}
