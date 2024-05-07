// Find the maximum path sum in the binary tree
// https://leetcode.com/problems/binary-tree-maximum-path-sum/description/

package binarytree;

public class MaxPathSum {

    static int maxSum = Integer.MIN_VALUE;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;

        maxPathSum(root);
        System.out.println(maxSum);
    }

    private static int maxPathSum(Node root) {
        if(root == null) {
            return 0;
        }

        int leftSum = Math.max(0, maxPathsSum(root.left));
        int rightSum = Math.max(0, maxPathsSum(root.right));
        if (leftSum + rightSum + root.val > maxSum) {
            maxSum = leftSum + rightSum + root.val;
        }

        return root.val + Math.max(rightSum, leftSum);

    }
}
