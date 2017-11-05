//Program to find inorder successor of node in binary search tree with parent link node.
//CTCI 4.6

package binarytree;

public class InOrderSuccessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NodeWithParent node = new NodeWithParent(15);
		node.left = new NodeWithParent(10);
		node.left.parent =  node;
		node.right = new NodeWithParent(20);
		node.right.parent = node;
		
		
		System.out.println(getSuccessor(node).data);
	}
	
	public static NodeWithParent getSuccessor(NodeWithParent x) {
		if(x.right != null)
			return getLeftMost(x.right);
		NodeWithParent curr = x;
		while(curr.parent != null && curr.data > curr.parent.data) {
			curr = curr.parent;
		}
		return curr.parent;
	}
	
	public static NodeWithParent getLeftMost(NodeWithParent x) {
		if(x.left != null) 
			getLeftMost(x.left);
		return x;
	}
	
	
	public static class NodeWithParent {
	    
	    int data;
	    NodeWithParent left;
	    NodeWithParent right;
	    NodeWithParent parent;
	    
	    public NodeWithParent(int val)
	    {
	        data = val;
	        left = right = null;
	        parent = null;
	    }

	}

}
