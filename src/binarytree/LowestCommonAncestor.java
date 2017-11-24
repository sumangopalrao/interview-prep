//Progam to find the lowest common ancestor of a binary tree.
//CTCI 4.8

package binarytree;

public class LowestCommonAncestor {
	
	private static Node findAnc(Node root, Node l, Node r) {
		if(root == null)
			return null;
		if(root == l || root == r)
			return root;
		Node left = findAnc(root.left, l, r);
		Node right = findAnc(root.right, l, r);
		if(left != null && right != null) 
			return root;
		if(left == null)
			return right;
		return left;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(3);
		node.left = new Node(1);
		node.left.left = new Node(0);
		node.left.right = new Node(2);
		node.right = new Node(5);
		Node anc = findAnc(node, node, node.right);
		System.out.println(anc.data);
	}

}
