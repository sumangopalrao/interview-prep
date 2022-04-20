// Find the intersection of two linked lists
// TODO:: Add the other approach which is simpler code but not intuitive

package linkedlist;

public class FindIntersection {
    
    public Node getIntersectionNode(Node headA, Node headB) {
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        Node currA = headA;
        Node currB = headB;
        int diff = 0;
        if (lengthA > lengthB) {
            diff = lengthA - lengthB;
            currA = moveNNodes(headA, diff);
        } else if(lengthB > lengthA) {
            diff = lengthB - lengthA;
            currB = moveNNodes(headB, diff);
        }
        while (currA != null && currB != null) {
            if (currA == currB) {
                return currA;
            }
            currA = currA.link;
            currB = currB.link;
        }
        return null;
    }
    
    private Node moveNNodes(Node head, int count) {
        Node curr = head;
        while (count > 0 && curr != null) {
            curr = curr.link; 
            count--;
        }
        return curr;
    }
    
    private int getLength(Node head) {
        if (head == null) return 0;
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.link;
        }
        return count;
    }
}