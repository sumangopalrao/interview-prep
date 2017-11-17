//Program to find the kth largest element in a BST.
// http://blog.gainlo.co/index.php/2016/06/03/second-largest-element-of-a-binary-search-tree/

package binarytree;

public class KthLargestInBST {
	
	static int count = 0;
	static int k = 1;
	
	public static Node findKthLargest(Node node) {
		if(node == null)
			return null;
		Node right = findKthLargest(node.right);
		if(right != null)
			return right;
		count += 1;
		if(count == k)
			return node;
		Node left = findKthLargest(node.left);
		return left;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(3);
		node.left = new Node(1);
		node.left.left = new Node(0);
		node.left.right = new Node(2);
		node.right = new Node(5);
		Node res = findKthLargest(node);
		if(res == null)
			System.out.println("Not found");
		else {
			System.out.println(res.data);
		}
	}

}
