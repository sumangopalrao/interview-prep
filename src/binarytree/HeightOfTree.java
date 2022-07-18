// LeetCode: Find Max Depth of Binary Tree

package binarytree;

public class HeightOfTree {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Node root = new Node(1);
        root.left  = new Node(2);
        root.right = new Node(3);
        root.left.right= new Node(4);
        System.out.println("Height of the tree is"+ height(root));
    }
    
    public static int height(Node root)
    {
          if(root == null)
              return 0;
          
          int leftmax = height(root.left);
          
          int rightmax = height(root.right);

          return Math.max(leftmax, rightmax) + 1;
    }
}
