//Program given a linkedlist to subtract the first and the last the data and so on.
//https://www.interviewbit.com/problems/subtract/
package linkedlist;

public class SubtractList {
	
	public static Node getMiddle(Node head) {
		if(head == null)
			return null;
		Node slower = head;
		Node runner = head;
		while(runner != null && runner.link != null) {
			slower = slower.link;
			runner = runner.link.link;
		}
		return slower;
	}
	
	public static Node reverse(Node head) {
		Node prev = null;
		Node curr = head;
		
		while(curr != null) {
			Node next = curr.link;
			curr.link = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	public static Node subtract(Node head) {
		if(head == null)
			return null;
		Node middle = getMiddle(head);
		System.out.println("Middle value:"+middle.data);
		Node reverseHead = reverse(middle);
		Node curr = head;
		Node revCurr = reverseHead;
		Node prev = null;
		while(curr != middle) {
			prev = curr;
			curr.data = revCurr.data - curr.data;
			curr = curr.link;
			revCurr = revCurr.link;
		}
		if(prev == null)
			return head;
		prev.link = reverse(reverseHead);
		return head;
	}
	
	public static void main(String[] args) {
		
		Node head = Node.initializeSample();
		System.out.println("Input");
		Node sub = subtract(head);
		System.out.println("Output");
	}

}
