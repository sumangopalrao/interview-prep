// Leetcode: Post Order traversal of Tree.
//TODO: Do iterative solution

package binarytree;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Node root = new Node(1);
        root.right = new Node(2);
        root.left = null;
        root.right.left = new Node(3);
        root.right.right= new Node(4);

        List<Integer> res = new ArrayList<>();
        List<Integer> out = postorder(res, root);
        for(Integer i : out) {
            System.out.println(i);
        }
    }

    private static List<Integer> postorder(List<Integer> res, Node root) {
        if(root == null)
            return null;
        postorder(res, root.left);
        postorder(res, root.right);
        res.add(root.data);
        return res;
    }
}
