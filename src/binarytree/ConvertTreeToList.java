//Given a binary tree convert it to a list of lists.
//CTCI 4.3
package binarytree;

import java.util.LinkedList;
import java.util.List;

public class ConvertTreeToList {
	
	public static int height(Node root) {
		if(root == null)
			return 0;
		return 1+Math.max(height(root.left), height(root.right));
	}
	
	public static List<List<Node>> convertToList(Node root) {
		if(root == null)
			return null;
		List<List<Node>> result = new LinkedList<List<Node>>();
		List<Node> rootList = new LinkedList<Node>();
		rootList.add(root);
		result.add(rootList);
		int h = height(root);
		System.out.println("Height is:"+h);
		int i = 0;
		while(i < h) {
			List<Node> innerList = result.get(i);
			List<Node> levelList = new LinkedList<Node>();
			for(Node n : innerList) {
				if(n.left != null)
					levelList.add(n.left);
				if(n.right != null)
					levelList.add(n.right);	
			}
			result.add(levelList);
			i++;
		}
		return result;
	}

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
        
        List<List<Node>> output = convertToList(root);
        output.forEach(item -> item.forEach(n -> System.out.println(n.data)));

	}

}
