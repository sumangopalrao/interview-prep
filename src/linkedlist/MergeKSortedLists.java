//WAP to merge a list of k sorted lists and store them in a new list
//LeetCode: https://leetcode.com/problems/merge-k-sorted-lists/description/

package linkedlist;

import java.util.PriorityQueue;

class NodeTuple {
    int value;
    int index;
    
    NodeTuple(int value, int index) {
        this.index = index;
        this.value = value;
    }
}

public class MergeKSortedLists {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Node currA = Node.initializeSample();
        Node currB = Node.initializeSampleB();
        Node currC = Node.initializeSortedSampleC();
        Node currD = Node.initializeSortedSampleD();
        Node[] list = new Node[]{currA, currB, currC, currD};
        Node c = mergeKSortedLists(list);
        Node.printList(c);	
    }
    
    static Node mergeKSortedLists(Node[] lists) {
        int size = lists.length;
        int interval = 1;
        
        while (interval < size) {
            for (int i = 0; i < size - interval; i += 2 * interval) {
                lists[i] = merge(lists[i], lists[i + interval]);
            }
            
            interval *= 2;
        }
        
        return size > 0 ? lists[0] : null;
    }
    
    
    
    static Node merge(Node headA, Node headB)
    {
        if(headA== null && headB == null)
        return null;
        if(headA == null)
        return headB;
        if(headB == null)
        return headA;
        
        Node currA = headA;
        Node currB = headB;
        Node currC = new Node();
        Node headC = currC;
        
        while(currA != null && currB != null)
        {
            if(currA.data <= currB.data)
            {
                currC.link = currA;
                currA = currA.link;
            }
            else if(currA.data > currB.data)
            {
                currC.link = currB;
                currB = currB.link;
            }
            currC = currC.link;
        }
        
        while(currA != null)
        {
            currC.link = currA;
            currC = currC.link;
            currA = currA.link;
        }
        
        while(currB != null)
        {
            currC.link = currB;
            currC = currC.link;
            currB = currB.link;
        }	
        return headC.link;
    }
    
    // PQ
    static Node mergeKSortedListsPQ(Node[] lists) {
        boolean emptyList = true;
        for(int i=0; i<lists.length; i++) {
            if (lists[i] != null) {
                emptyList = false;
                break;
            }
        }
        
        if (emptyList) {
            return null;
        }
        
        PriorityQueue<NodeTuple> lowestHeap = new PriorityQueue<NodeTuple>(lists.length, (a, b) -> a.value - b.value);
        int[] indices = new int[lists.length];
        
        for (int i=0; i<lists.length; i++) {
            Node curr = lists[i];
            int j = indices[i];
            int k = 0;
            while(curr != null && k < j) {
                curr = curr.link;
            }
            lowestHeap.offer(new NodeTuple(curr.data, i));
        }
        
        // Node lowestNode = findLowestNode();
        
        // addNextNode()
        
        return null;
        
    }
    
    static Node findNextLowestNode(PriorityQueue<NodeTuple> pq, int[] indices) {
        NodeTuple lowestTuple = pq.poll();
        indices[lowestTuple.index]++;
        pq.offer(new NodeTuple(0, 0);
        Node sortedList = new Node(lowestTuple.value);
        return sortedList;
    }
    
    static int numOfNodes(Node[] lists) {
        int count = 0;
        for (int i=0; i<lists.length; i++) {
            Node currNode = lists[i];
            while(currNode != null) {
                count++;
                currNode = currNode.link;
            }
        }
        return count;
    }
    
    static int findLowestWithIndex(Node[] lists, int[] indices) {
        int lowestSoFar = Integer.MAX_VALUE;
        int lowestIndex = -1;
        
        for(int i=0; i<lists.length; i++) {
            int index = indices[i];
            if (lists[i] != null) {
                
            }
        }
        return -1;
    }
}
