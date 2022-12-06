//Program to implement a hashset in java.
// Leetcode:: https://leetcode.com/explore/learn/card/hash-table/182/practical-applications/1139/

package design;

import java.util.List;

public class HashSet {

    private final int MAX_LEN = 100000; // the amount of buckets
    private List<Integer>[] set;

    public HashSet() {
        set = (List<Integer>[]) new ArrayList[MAX_LEN];
    }

    public void add(int val) {

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
