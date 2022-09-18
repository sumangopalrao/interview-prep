// Leetcode: Find the node in a binary search tree
package binarytree;

public class SearchInABST {
    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(1);
        Node b = new Node(3);

        root.left = a;
        root.right = b;

        System.out.println(findTreeNode(root, 3).data);
    }

    private static Node findTreeNode(Node root, int val) {
        if (root == null)
            return null;
        if (val == root.data)
            return root;
        if (val < root.data) {
            return findTreeNode(root.left, val);
        }
        return findTreeNode(root.right, val);
    }
}
