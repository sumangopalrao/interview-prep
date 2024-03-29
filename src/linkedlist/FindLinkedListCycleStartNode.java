// WAP to detect the node where the loop in a linked list would start. (LinkedList II)
package linkedlist;

public class FindLinkedListCycleStartNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		a.link = b; b.link = c; c.link=d; d.link = e; e.link = null;
		assert getCycleStart(a) != null;
		assert getCycleStart(a) != null;
//		System.out.println(getCycleStart(a).data);

	}

    static Node getCycleStart(Node head) {

        if (head == null || head.link == null) {
            return null;
        }
		Node slower = head;
		Node runner = head;

		slower = slower.link;
		runner = runner.link.link;
        boolean loopPresent = false;
		
		while(runner != null && runner.link != null)
		{
			if(slower == runner) {
                loopPresent = true;
                break;
            }
			slower = slower.link;
		    runner = runner.link.link;
		}

		if (slower != runner) 
		    return null;

        if (loopPresent) {
            Node curr = head;
            while (curr != slower) {
                curr = curr.link;
                slower = slower.link;
            }

            return curr;
        }

        return null;
    }
	
	static Boolean checkLoop(Node head) {
		if (head == null) {
            return false;
        }
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
