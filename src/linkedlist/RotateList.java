package linkedlist;

public class RotateList {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Node currA = Node.initializeSample();
        Node c = rotateList(currA, 2);
        Node.printList(c);
    }


    public static Node rotateList(Node head, int k) {
        if(head == null) {
            return null;
        }
        if (head.link == null) {
            return head;
        }

        int n = getLength(head);
        if (k >= n) {
            k = k % n;
        }

        if (k == 0)
            return head;

        Node curr = head;
        while (k-- > 0)
           curr = curr.link;

        Node currHead = head;

        while (curr.link != null) {
            curr = curr.link;
            head = head.link;
        }

        Node newHead = head.link;
        curr.link = currHead;
        head.link = null;

        return newHead;
    }

    private static int getLength(Node head){
        Node curr = head;
        int i = 0;
        while (curr != null) {
            curr = curr.link;
            i++;
        }
        return i;
    }
}
