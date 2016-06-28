package binarytree;

public class HeightOfTree {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Node root = new Node(1);
        root.left  = new Node(2);
        root.right = new Node(3);
        root.left.right= new Node(4);
        //root.left.right.right= new Node(5);
        
        System.out.println("Height of the tree is"+ height(root));
    }
    
    public static int height(Node root)
    {
//        if(root == null)
//            return 0;
//        
//        if(root.left == null && root.right == null)
//        {
//            return 1;
//        }
//        
//        if(root.left != null)
//            return 1+height(root.left);
//        
//        if(root.right != null)
//            return 1+height(root.right);
//        return 0;
        
          if(root == null)
              return 0;
          
          int leftmax = height(root.left);
          
          int rightmax = height(root.right);

          return Math.max(leftmax, rightmax) + 1;
        
    }

}
