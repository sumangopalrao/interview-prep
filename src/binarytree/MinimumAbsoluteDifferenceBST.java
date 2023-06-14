// Find the minimum absolute difference between any two nodes in a BST
// https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/

package binarytree;

public class MinimumAbsoluteDifferenceBST {

    static int minDiff = Integer.MAX_VALUE;
    static Node prev = null;

    public static int getMinimumDifference(Node root) {
        inorder(root);
        return minDiff;
    }
    
    private static void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        if (prev != null) {
            minDiff = Math.min(minDiff, node.data - prev.data);
        }
        prev = node;
        inorder(node.right);
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.left = new Node(1);
        System.out.println(getMinimumDifference(head));
    }
}
