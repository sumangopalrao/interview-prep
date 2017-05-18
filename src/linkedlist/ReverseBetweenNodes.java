package linkedlist;

public class ReverseBetweenNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
        Node curr = Node.initializeSample();
        int m = 2;
        int n = 4;
        Node prev = null;
        while(curr != null && i<m-1) {
            prev = curr;
            curr = curr.link;
            i++;
        }
        System.out.println("The value of i:"+i);
        Node temp_prev = prev;
        Node temp_curr = curr;
        Node next = null;
        while(i<=n && curr != null) {
            next = curr.link;
            curr.link = prev;
            prev = curr;
            curr = next;
            i++;
        }
        temp_prev.link = next;
        next.link = temp_curr;
     //   System.out.println("The prev and curr values:"+prev.val+","+curr.val);
        System.out.println("Head value:"+curr.data);
        //   return head;
	}

}
