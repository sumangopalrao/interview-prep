package graphs;

public class Graph {
	Node[] nodes;
	int i;
	
	Graph(int n) {
		this.nodes = new Node[n];
		i=0;
	}
	
	public void addNode(Node node) {
		this.nodes[i] = node;
		i++;
	}
}