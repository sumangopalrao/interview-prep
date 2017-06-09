//Program to create a BST given a sorted array. 
//CTCI 4.2
package binarytree;

public class CreateMinimalTree {
	
	private static Node createMinimal(int[] arr) {
		int low = 0;
		int high = arr.length-1;
		return createNodes(arr, low, high);
	}
	
	private static Node createNodes(int[] arr, int low, int high) {
		if(low > high)
			return null;
		int mid = (low+high)/2;
		Node root = new Node(arr[mid]);
		root.left = createNodes(arr, low, mid-1);
		root.right = createNodes(arr, mid+1, high);
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{2, 5, 8, 10, 65, 79};
		
		Node root = createMinimal(arr);
		printInOrder(root);
	}
	
	public static void printInOrder(Node root)
    {
        if(root == null)
            return;
        
        printInOrder(root.left);
        System.out.println(root.data + ",");
        printInOrder(root.right);
    }

}
