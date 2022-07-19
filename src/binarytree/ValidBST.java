//Leetcode: Program to check if BST is valid
package binarytree;

public class ValidBST {

	static boolean isValidBST(Node root) {
		if (root == null)
			return false;
		if (root.left == null && root.right == null)
			return true;
		return isValidHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}
	
	static boolean isValidHelper(Node root, long min, long max) {
		if(root == null)
			return true;
		if(root.data <= min || root.data >= max) {
			return false;
		}
		return isValidHelper(root.left, min, root.data) && isValidHelper(root.right, root.data, max);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(2);
		node.left = new Node(2);
		node.right = new Node(2);
		System.out.println(isValidBST(node));
		System.out.println(isValidBST(new Node(2147483647)));
	}
}
