package binarytree;

/**
 * Created by sgopalra on 9/21/2016.
 */
public class DFS {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;

        dfs(root, 5);
    }

    private static void dfs(Node root, int key) {
        if(root == null) {
            return;
        }
        if(root.data == key) {
            System.out.println("Found the key");
            return;
        }
        root.visited = true;
        System.out.println(root.data);
        if(root.left != null && root.left.visited == false) {
            dfs(root.left, key);
        }
        if(root.right != null && root.right.visited == false) {
            dfs(root.right, key);
        }

    }
}
