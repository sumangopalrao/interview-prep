//In order traversal of binary tree.
package binarytree;

public class InOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = new Node(1);
        root.left  = new Node(2);
        root.right = new Node(3);
        root.left.right= new Node(4);
        
        inorder(root);

	}
	
	private static void inorder(Node root) {
		if(root == null)
			return;
		inorder(root.left);
		System.out.println(root.data+",");
		inorder(root.right);
	}

}
