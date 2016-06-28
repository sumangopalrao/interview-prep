package binarytree;

public class TreeTraversal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Node root = new Node(1);
        root.left  = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        
        System.out.println("In Order:::");
        printInOrder(root);
        System.out.println("Pre Order:::");
        printPreOrder(root);
        System.out.println("Post Order:::");
        printPostOrder(root);

    }
    
    public static void printInOrder(Node root)
    {
        if(root == null)
            return;
        
        printInOrder(root.left);
        System.out.println(root.data + ",");
        printInOrder(root.right);
    }
    
    
    public static void printPreOrder(Node root)
    {
        if(root == null)
            return;
        
        System.out.println(root.data + ",");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public static void printPostOrder(Node root)
    {
        if(root == null)
            return;
        
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.println(root.data + ",");
    }
}
