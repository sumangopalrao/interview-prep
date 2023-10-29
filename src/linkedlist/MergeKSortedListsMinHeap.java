// Merge K Sorted lists problem solution but with heap

package linkedlist;
import java.util.PriorityQueue;

class Solution {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Node currA = Node.initializeSample();
        Node currB = Node.initializeSampleB();
        Node currC = Node.initializeSortedSampleC();
        Node currD = Node.initializeSortedSampleD();
        Node[] list = new Node[]{currA, currB, currC, currD};
        Node c = mergeKLists(list);
        Node.printList(c);	
    }
    
    static class NodeTuple implements Comparable<NodeTuple> {
        Node node;
        int listIndex;
        
        NodeTuple(Node node, int listIndex) {
            this.node = node;
            this.listIndex = listIndex;
        }
        
        @Override
        public int compareTo(NodeTuple other) {
            return Integer.compare(this.node.data, other.node.data);
        }
    }
    
    public static Node mergeKLists(Node[] lists) {
        
        if (lists == null || lists.length == 0) {
            return null;
        }
        
        PriorityQueue<NodeTuple> minHeap = new PriorityQueue<>();
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                minHeap.add(new NodeTuple(lists[i], i));
            }
        }
        
        Node dummyHead = new Node(0);
        Node current = dummyHead;
        while (!minHeap.isEmpty()) {
            NodeTuple nodeTuple = minHeap.poll();
            current.link = nodeTuple.node;
            current = current.link;
            
            if (current.link != null) {
                minHeap.add(new NodeTuple(current.link, nodeTuple.listIndex));
            }
        }
        
        return dummyHead.link;
    }
}