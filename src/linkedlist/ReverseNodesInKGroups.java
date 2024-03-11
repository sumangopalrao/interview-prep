// TBR: Reverse nodes of a linked list in K Groups
//  https://leetcode.com/problems/reverse-nodes-in-k-group/

package linkedlist;

public class ReverseNodesInKGroups {

  public static void main(String[] args) {

    System.out.println("Hello World");
  }

  public static Node reverseKGroup(Node head, int k) {

    Node dummyHead = new Node();
    dummyHead.link = head;

    Node groupPrev = dummyHead;

    while (true) {
      Node kthNode = getKth(groupPrev, k);
      if (kthNode == null)
        break;

      Node groupNext = kthNode.link;

      Node prev = kthNode.link;
      Node curr = groupPrev.link;

      while (curr != groupNext) {
        Node next = curr.link;
        curr.link = prev;
        prev = curr;
        curr = next;
      }

      Node tmp = groupPrev.link;
      groupPrev.link = kthNode;
      groupPrev = tmp;

    }
    return dummyHead.link;
  }

  private static Node getKth(Node curr, int k) {
    while (curr != null && k > 0) {
      curr = curr.link;
      k -= 1;
    }

    return curr;
  }

}
