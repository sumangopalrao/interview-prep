package linkedlist;

public class Node {
	int data;
	Node link;
	
	public Node(int data)
	{
		this.data = data;
		this.link = null;
	}
	
	public static void printList(Node head)
	{
		while(head != null)
		{
			System.out.print(head.data + "--->");
			head = head.link;
		}
	}
	
}
