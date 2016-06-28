package binarytree;

public class LevelOrderTraversal {

    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Node root = new Node(1);
        root.left  = new Node(2);
        root.right = new Node(3);
        root.left.right= new Node(4);
        
        System.out.println("Height of the tree is"+ height(root));
        int d = height(root);
        levelOrderTraversal(root, d);
    }
    
    public static void levelOrderTraversal(Node root, int d)
    {
        for(int i=1; i<=d; i++)
            printLevel(root, i);

    }
    
    public static void printLevel(Node root, int level)
    {
        if(root == null)
            return;
        
        if (level == 1)
            System.out.println(root.data);
        
        else if(level > 1)  
            printLevel(root.left, level-1);
            printLevel(root.right, level-1);
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
