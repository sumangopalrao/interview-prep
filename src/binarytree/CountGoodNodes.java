// Count the number of good nodes in a binary tree
// A node is a good node if all the parent nodes are less than or equal to given tree node value
// https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/

package binarytree;

public class CountGoodNodes {

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

        System.out.println(dfs(root, Integer.MIN_VALUE));
    }

    private static int dfs(Node root, int maxSoFar) {
        if(root == null) {
            return 0;
        }
        if (root.data < maxSoFar) {
            return dfs(root.left, maxSoFar) + dfs(root.right, maxSoFar);
        }

        return 1 + dfs(root.left, root.data) + dfs(root.right, root.data);

    }
}
