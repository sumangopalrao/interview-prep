// Leetcode: Check if the value of a root equals the sum of its children
package binarytree;

public class RootEqualsSumOfChildren {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Node root = new Node(10);
        Node a = new Node(5);
        Node b = new Node(6);
        root.left = a;
        root.right = b;

        System.out.println(checkTree(root));
    }

    private static boolean checkTree(Node root) {
        if(root == null) {
            return false;
        }

        if (root.left == null || root.right == null)
            return false;

        return root.data == root.left.data + root.right.data;
    }
}
