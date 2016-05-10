//WAP to detect a loop in a linked list.
package linkedlist;

public class DetectLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		a.link = b; b.link = c; c.link=d; d.link = e; e.link = null;
		System.out.println(checkLoop(a));

	}
	
	static Boolean checkLoop(Node head)
	{
		Node slower = head;
		Node runner = head.link;
		
		while(slower != null && runner != null && runner.link != null)
		{
			if(slower == runner)
				return true;
			slower = slower.link;
		    runner = runner.link.link;
		}
		return false;
		
	}

}
