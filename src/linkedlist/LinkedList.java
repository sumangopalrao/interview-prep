package linkedlist;

class LinkedList<I extends Number> {
    class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
    
    private Node head;
    private Node tail;
    public int size;
    
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if (index >= size) {
            return -1;
        }
        Node curr = head;
        for(int i=0; i<index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
        
        if (head.next == null) {
            tail = head;
        }
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        
        if (tail == null || size == 0) {
            head = newNode;
            tail = newNode;
            size = 1;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        if (index < 0 || index > size) {
            return;
        }
        
        
        if (index == 0) {
            addAtHead(val);
        } else if(index == size) {
            addAtTail(val); 
        } else {
            int i = 0;
            Node curr = head.next;
            Node prev = head;
            while (curr != null && i<index - 1) {
                System.out.println("Curr" + curr.val);
                prev = curr; 
                curr = curr.next;
                i++;
            }
            newNode.next = prev.next;
            prev.next = newNode;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (size == 0 || index <0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else {
            int i = 0;
            Node curr = head.next;
            Node prev = head;
            while (curr != null && i<index - 1) {
                System.out.println("Curr" + curr.val);
                prev = curr; 
                curr = curr.next;
                i++;
            }
            prev.next = curr.next;
            size--;
            if (prev.next == null) {
                tail = prev;
            }
        }
    }
}
