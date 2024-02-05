// Program to print the right side view of a binary tree
// https://leetcode.com/problems/binary-tree-right-side-view/description/

package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class RightSideView {
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

        rightSideView(root, 5);
    }

    private List<Integer> rightSideView(Node root) {

        List<Integer> res = new ArrayList<Integer>();

        if(root == null) {
            return res;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while( !q.isEmpty()) {
            int qLength = q.size();

            for(int i=0; i<qLength; i++) {

            Node n = q.poll();

            if (i == qLength - 1) {
                res.add(n.data);
            }
            // System.out.println(n.data);
            if(n.left != null) {
                q.add(n.left);
            }
            if(n.right != null) {
                q.add(n.right);
            }
        }
        }
        return res;
    }
}
