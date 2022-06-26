// Leetcode: Flatten a Multilevel Doubly Linked List
package linkedlist;

public class FlattenMultiLevelLinkedList {
    DoublyLinkedListNodeWithChild tail = null;
    public DoublyLinkedListNodeWithChild flatten(DoublyLinkedListNodeWithChild head) {
        if(head == null) return null;
        
        head.prev = tail;
        tail = head;
        
        DoublyLinkedListNodeWithChild nextNode = head.next;
        
        head.next = flatten(head.child);
        head.child = null;
        
        tail.next = flatten(nextNode);
        
        return head;
    }
    static class DoublyLinkedListNodeWithChild {
        public int val;
        public DoublyLinkedListNodeWithChild prev;
        public DoublyLinkedListNodeWithChild next;
        public DoublyLinkedListNodeWithChild child;
    };
}
