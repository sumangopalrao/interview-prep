// Given a binary tree, determine if it is a mirror of itself
// TODO:: Add iterative solution

package binarytree;

public class SymmetricTree {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Node root = new Node(1);
        root.left  = new Node(2);
        root.right = new Node(2);
        root.left.left= new Node(3);
        root.left.right= new Node(4);
        root.right.left= new Node(5);
        root.right.right= new Node(3);
        System.out.println(isSymmetricTree(root));
    }

    public static boolean isSymmetricTree(Node root)
    {
        if(root == null)
            return false;

        return checkSymmetry(root.left, root.right);
    }

    public static boolean checkSymmetry(Node left, Node right) {
        if (left == null && right == null)
            return true;

        if (left == null || right == null)
            return false;
        if (left.data != right.data) {
            return false;
        }

        return checkSymmetry(left.left, right.right) && checkSymmetry(left.right, right.left);
    }
}
