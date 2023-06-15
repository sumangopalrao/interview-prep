// Return the smallest level x such that the sum of all the values of nodes at level x is maximal.
// https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/description/

package binarytree;

import java.util.LinkedList;

public class MaximumLevelSumOfLevelOrderTree {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Node root = new Node(1);
        root.left  = new Node(7);
        root.right = new Node(0);
        root.left.right= new Node(-8);
        root.left.left = new Node(7);
        
        System.out.println(findMaximum(root));
    }

    public static int findMaximum(Node root) {
        if(root == null) {
            return 0;
        }

        LinkedList<Node> current = new LinkedList<>();
        LinkedList<Node> next = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        current.add(root);
        int sum = 0;
        int height = 0;
        int maxHeight = 0;

        while( !current.isEmpty()) {
            Node curr = current.remove();
            if(curr.left != null) {
                next.add(curr.left);
            }
            if(curr.right != null) {
                next.add(curr.right);
            }

            sum += curr.data;
            if (current.isEmpty()) {
                height++;
                current = next;
                next = new LinkedList<>();
                if (sum > max) {
                    max = sum;
                    maxHeight = height;
                }
                sum = 0;
            }
        }

        return maxHeight;
    }
}
