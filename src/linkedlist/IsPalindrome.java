//Program to check if a linked list is palindrome
//CTCI 1.8

package linkedlist;

public class IsPalindrome {
	
	public static boolean checkPalindrome(Node head) {
		Node mid = getMid(head);
		Node revCurr = reverse(mid);
		Node curr = head;
		while(curr != revCurr) {
			curr = curr.link;
			if(revCurr.link != null) {
				revCurr = revCurr.link;
			}
			if(curr.data != revCurr.data)
				return false;
		}
		return true;
	}
	
	private static Node reverse(Node head) {
		Node curr = head;
		Node prev = null;
		while(curr != null) {
		    Node next = curr.link;
		    curr.link = prev;
		    prev = curr;
		    curr = next;
		}
		return prev;
	}
	
	private static Node getMid(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.link != null) {
			fast = fast.link.link;
			slow = slow.link;
		}
		return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(3);
		Node e = new Node(2);
		Node f = new Node(1);
		a.link = b; b.link = c; c.link=d; d.link = e; e.link = f; f.link = null;
		System.out.println(checkPalindrome(a));
	}

}
