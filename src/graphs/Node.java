package graphs;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	int data;
	List<Node> children;
	boolean visited;
	
	Node(int data) {
		this.data = data;
		this.visited = false;
		children = new ArrayList<Node>();
	}
	
	public void addChildren(Node child) {
		this.children.add(child);
	}

}
