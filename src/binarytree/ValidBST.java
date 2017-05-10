//Program to check if BST is valid
package binarytree;

public class ValidBST {

	static int lower = Integer.MIN_VALUE;
	static int higher = Integer.MAX_VALUE;
	
	static boolean isValidBST(Node root) {
		return isValidHelper(root, lower, higher);
	}
	
	static boolean isValidHelper(Node root, int min, int max) {
		if(root == null)
			return true;
		if(root.data < min || root.data > max) {
			return false;
		}
		return isValidHelper(root.left, min, root.data) && isValidHelper(root.right, root.data, max);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		System.out.println(isValidBST(node));
	}

}
