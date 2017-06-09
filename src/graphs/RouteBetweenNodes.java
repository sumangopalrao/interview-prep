//Program to check if there is a route between two nodes.
//CTCI 4.1
package graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RouteBetweenNodes {
	
	public static boolean routeBetween(Graph g, Node src, Node dest) {
		if(dest == src)
			return true;
		Queue<Node> q = new LinkedList<Node>();
		q.add(src);
		while(!q.isEmpty()) {
			Node node = q.poll();
			node.visited = true;
			List<Node> children = node.children;
			for(Node n : children) {
				if(n == dest)
					return true;
				if(!n.visited)
					q.add(n);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(6);
		Node n0 = new Node(0);
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n0.addChildren(n1);
		n0.addChildren(n4);
		n0.addChildren(n5);
		n1.addChildren(n4);
		n1.addChildren(n3);
		n2.addChildren(n1);
		n3.addChildren(n4);
		n3.addChildren(n2);
		
		g.addNode(n0);
		g.addNode(n1);
		g.addNode(n2);
		g.addNode(n3);
		g.addNode(n4);
		g.addNode(n5);
		
		
		System.out.println(routeBetween(g, n1, n5));
		
	}

}
