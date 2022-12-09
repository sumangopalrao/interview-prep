//Program to implement a hashset in java.
// Leetcode:: https://leetcode.com/explore/learn/card/hash-table/182/practical-applications/1139/

package design;

import java.util.List;

public class HashSet {

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private int size;
    private Node[] array;

    public HashSet() {
        this.array = new Node[size];
    }

    public void add(int key) {
        int index = key % this.size;
        if (this.array[index] == null) {
            this.array[index] = new Node(key);
            return;
        } else {
            Node p = this.array[index];
            while (p != null && p.val != key)
                p = p.next;

            if (p != null)
                return;

            Node newHead = new Node(key);
            newHead.next = this.array[index];
            this.array[index] = newHead;
        }
    }

    public void remove(int key) {
        int index = key % this.size;
        if (this.array[index] == null) {
            return;
        } else {
            Node p = this.array[index];

            if (p.val == key) {
                this.array[index] = p.next;
                return;
            }

            while (p.next != null && p.next.val != key)
                p = p.next;
            if (p.next == null)
                return;

            p.next = p.next.next;
        }
    }

    public boolean contains(int key) {
        int index = key % this.size;
        if (this.array[index] == null)
            return false;
        Node p = this.array[index];
        while (p != null && p.val != key)
            p = p.next;
        return p != null;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        HashSet set = new HashSet();
        set.add(1);
        set.add(2);
        System.out.println(set.contains(1));
        System.out.println(set.contains(3));
    }
}
