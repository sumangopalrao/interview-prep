// Print the contents of the binary tree breadth wise
package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

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

        bfs(root, 5);
    }

    private static void bfs(Node root, int key) {

        if(root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while( !q.isEmpty()) {
            Node n = q.remove();
            n.visited = true;
            System.out.println(n.data);
            if(n.left != null && n.left.visited == false) {
                q.add(n.left);
            }
            if(n.right != null && n.right.visited == false) {
                q.add(n.right);
            }
        }
    }
}
