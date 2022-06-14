package linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

    static  class NodeWithRandom {
        int val;
        NodeWithRandom next;
        NodeWithRandom random;

        public NodeWithRandom(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    static NodeWithRandom copyList(NodeWithRandom head) {

        Map<NodeWithRandom, NodeWithRandom> oldMap = new HashMap<NodeWithRandom, NodeWithRandom>();
        oldMap.put(null, null);

        NodeWithRandom curr = head;
        while (curr != null) {
            NodeWithRandom copiedNode = new NodeWithRandom(curr.val);
            oldMap.put(curr, copiedNode);
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            NodeWithRandom copied = oldMap.get(curr);
            copied.next = oldMap.get(curr.next);
            copied.random = oldMap.get(curr.random);
            curr = curr.next;
        }

        return oldMap.get(head);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        NodeWithRandom currA = new NodeWithRandom(1);
        NodeWithRandom currB = new NodeWithRandom(2);
        NodeWithRandom currC = new NodeWithRandom(3);
        currA.next = currB;
        currB.next = currC;
        currA.random = currC;
        currC.random = currB;
        currB.random = currA;

        NodeWithRandom copiedList = copyList(currA);

        NodeWithRandom curr = copiedList;
        while (curr != null) {
            System.out.println("The value is "+curr.val);
            System.out.println("The random node value is "+curr.random.val);
            curr = curr.next;
        }
//        Node c = rotateList(currA, 2);
//        Node.printList(c);
    }
}
