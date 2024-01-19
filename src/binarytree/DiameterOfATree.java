package binarytree;

public class DiameterOfATree {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        // System.out.println("Height of the tree is" + height(root));
        System.out.println("Diameter of tree is" + diameterOfBinaryTree(root));
    }

    public static int diameterOfBinaryTree(Node root) {
        if (root == null)
            return 0;
        if (root.left == null || root.right == null) {
            return 1;
        }
        return getDiameter(root, 0);
        // int leftDepth = height(root.left);
        // int rightDepth = maxLeft = diameterOfBinaryTree(root.left);
        // int diameter = maxLeft + maxRight;
        // return diameter;
    }

    public static int getDiameter(Node root, int maxDiameterSoFar) {
        if (root == null)
            return 0;

        if (root.left == null || root.right == null) {
            return 1;
        }

        int leftmax = height(root.left);

        int rightmax = height(root.right);

        return Math.max(leftmax, rightmax) + 1;
    }

    public static int height(Node root) {
        if (root == null)
            return 0;

        int leftmax = height(root.left);

        int rightmax = height(root.right);

        return Math.max(leftmax, rightmax) + 1;
    }
}
