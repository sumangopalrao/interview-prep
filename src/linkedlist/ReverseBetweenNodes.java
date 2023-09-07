package linkedlist;

public class ReverseBetweenNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node head = Node.initializeSample();
        int m = 2;
        int n = 4;
        Node reversedHead = reverse(head, m, n);
        Node.printList(reversedHead);
    }


    static Node reverse(Node head, int m, int n) {
        int i = 1;
        Node prev = null;
        Node curr = head;
        while(curr != null && i<m) {
            prev = curr;
            curr = curr.link;
            i++;
        }
        Node temp_prev = prev;
        Node temp_curr = curr;
        Node next = null;
        prev = null;
        while(i<=n && curr != null) {
            next = curr.link;
            curr.link = prev;
            prev = curr;
            curr = next;
            i++;
        }
        if (temp_prev != null) {
            temp_prev.link = prev; // 'prev' now points to the start of the reversed segment
        } else {
            head = prev; // if 'm' is 1, then update the head of the list
        }
        temp_curr.link = curr; // 'temp_curr' now points to the end of the reversed segment
    
        return head;
	}

    // static Node reverse(Node head, int m, int n) {
    //     if (head == null) return null;
    
    //     Node dummy = new Node(0); // This dummy node will help us in case m is 1
    //     dummy.link = head;
    //     Node prev = dummy;
    
    //     // Traverse the list till position m
    //     for (int i = 0; i < m - 1; i++) {
    //         prev = prev.link;
    //     }
    
    //     Node curr = prev.link;
    //     Node next = null;
    
    //     // Keep reversing the nodes till position n
    //     for (int i = 0; i < n - m + 1; i++) {
    //         next = curr.link;
    //         curr.link = next.link;
    //         next.link = prev.link;
    //         prev.link = next;
    //     }
    
    //     return dummy.link; // If m was 1, the start would have changed, hence return dummy.link
    // }

}
