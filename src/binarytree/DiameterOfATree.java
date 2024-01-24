// Find the diameter of the binary tree
// https://leetcode.com/problems/diameter-of-binary-tree/

package binarytree;

public class DiameterOfATree {

    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        getHeight(root);
        System.out.println("Max diameter of tree is" + max);

    }

    public static int getHeight(Node root) {
        if (root == null)
            return -1;

        int leftmax = getHeight(root.left);

        int rightmax = getHeight(root.right);

        max = Math.max(max, (leftmax + rightmax + 2));

        return Math.max(leftmax, rightmax) + 1;
    }
}
