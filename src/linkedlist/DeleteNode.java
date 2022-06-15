package linkedlist;

public class DeleteNode {

    public static void main(String[] args) {
        // TODO:: Implement using recursion

        Node curr = Node.initializeSample();
        Node head = curr;
        Node prev = null;

        while(curr != null)
        {
            Node next = curr.link;
            curr.link = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

        deleteNode(head);

        Node.printList(head);
    }


    private static void deleteNode(Node node) {
        node.data = node.link.data;
        node.link = node.link.link;
    }
}
