// WAP to find out if a tree has a subtree of another tree, a subtree is a tree that consists of a node in a tree and all of its descendents
// https://leetcode.com/problems/subtree-of-another-tree/

package binarytree;

public class IsSubtree {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);

        Node subRoot = new Node(2);
        subRoot.left = new Node(3);
        System.out.println(isSymmetricTree(root, subRoot));
    }

    public static boolean isSymmetricTree(Node root, Node subRoot) {
        if (root == null)
            return false;

        if (isIdentical(root, subRoot))
            return true;

        return isSymmetricTree(root.left, subRoot) || isSymmetricTree(root.right, subRoot);
    }

    public static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null)
            return true;

        if (root == null || root == null)
            return false;

        return root.data == subRoot.data && isIdentical(root.left, subRoot.left)
                && isIdentical(root.right, subRoot.right);
    }
}
