// Find the maximum depth of a binary tree
// https://leetcode.com/problems/maximum-depth-of-binary-tree

package binarytree;

public class MaxDepth {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Node root = new Node(1);
        root.left  = new Node(2);
        root.right = new Node(3);
        root.right.right= new Node(4);
        System.out.println("Max depth of the tree is"+ maxDepth(root));
    }
    
    public static int maxDepth(Node root)
    {
          if(root == null)
              return 0;

          if (root.left == null && root.right == null)
            return 1;
          
          int leftmax = maxDepth(root.left);
          
          int rightmax = maxDepth(root.right);

          return Math.max(leftmax, rightmax) + 1;
    }
    
}
