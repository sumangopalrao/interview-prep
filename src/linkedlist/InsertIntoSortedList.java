// WAP to insert a node in a sorted linked list
package linkedlist;

public class InsertIntoSortedList {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.link = b; b.link = c; c.link=d; d.link = e; e.link = a;
        System.out.println(insert(a, 10));
        
    }
    
    static public Node insert(Node head, int insertVal) {
        if(head == null) {
            Node newNode = new Node(insertVal);
            newNode.link = newNode;
            return newNode;
        }
        Node node = head;
        
        while(node.link != head) {
            if(node.data <= node.link.data) {
                if(insertVal >= node.data && insertVal <= node.link.data) {
                    break;
                }
            } else {
                if(insertVal >= node.data || insertVal <= node.link.data) {
                    break;
                }
            }
            node = node.link;
        }
        
        Node next = node.link;
        node.link = new Node(insertVal);
        node.link.link = next;
        return head;
    }
}
