// Print the binary tree elements in level order
package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderTraversal {

    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Node root = new Node(1);
        root.left  = new Node(2);
        root.right = new Node(3);
        root.left.right= new Node(4);
        
//        System.out.println("Height of the tree is"+ height(root));
        int d = height(root);
        levelOrderTraversal(root, d);


        List<List<Integer>> res = levelOrderUsingIteration(root);
        System.out.println(res);
    }

    public static List<List<Integer>> levelOrderUsingIteration(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> vals = new ArrayList<>();
        if(root == null) {
            return list;
        }

        LinkedList<Node> current = new LinkedList<>();
        LinkedList<Node> next = new LinkedList<>();
        current.add(root);

        while( !current.isEmpty()) {
            Node curr = current.remove();
            if(curr.left != null) {
                next.add(curr.left);
            }
            if(curr.right != null) {
                next.add(curr.right);
            }

            vals.add(curr.data);
            if (current.isEmpty()) {
                current = next;
                next = new LinkedList<>();
                list.add(vals);
                vals = new ArrayList<>();
            }
        }
        return list;
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
        
        if (level == 1) {
            System.out.println(root.data);
        }

        else if(level > 1) {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }
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
