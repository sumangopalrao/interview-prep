//LeetCode:: Remove node give only access to node.
package linkedlist;

public class RemoveNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node currA = Node.initializeSample();
		Node.printList(currA);
		deleteNode(currA.link.link);
		Node.printList(currA);
	}
	
	static void deleteNode(Node node)
	{
		if((node == null) || (node.link == null))
			return;
	    
		Node next = node.link;
		node.data = next.data;
		node.link = next.link;
	}

}
