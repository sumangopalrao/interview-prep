//Progam to check if tree is height balanced. 
//C10.1 EPI
package binarytree;

public class HeightBalancedTree {
	
	private static boolean isHeightBalanced(Node root) {
		return heightHelper(root) != -1;
	}
	
	private static int heightHelper(Node root) {
		if(root == null)
			return 0;
		int leftHeight = heightHelper(root.left);
		if(leftHeight == -1)
			return -1;
		int rightHeight = heightHelper(root.right);
		if(rightHeight == -1)
			return -1;
		if(Math.abs(leftHeight - rightHeight) > 1)
			return -1;
		int height = Math.max(leftHeight, rightHeight)+1;
		return height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
        root.left  = new Node(2);
        root.right = new Node(3);
        root.left.left= new Node(4);
        root.left.left.left = new Node(5);
        System.out.println(isHeightBalanced(root));
	}

}
