package binarytree;

public class SampleTree {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        
        root.left = a;
        root.right = b;
        a.left = c;

    }

}
