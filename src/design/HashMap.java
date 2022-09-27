//Program to implement a hashmap in java.
//CTCI 1

package design;

public class HashMap {
	
	static class Node{
		int key;
		int value;
		Node next;
		int hashCode;
		
		Node(int key, int value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
		
		public int getKey() {
			return key;
		}

		public int getValue() {
			return value;
		}

		public void clearNext() {
			this.next = null;
		}
		
		public int hashCode() {
			return hashCode;
		}
		
		public void setHashCode(int value) {
			this.hashCode = value; 
		}
	}
	
	private int initialCapacity = 16;
	Node[] arr = new Node[initialCapacity];
	private float loadFactor = 0.75f;
	int count = 0;

	public HashMap() {}
	

	HashMap(int capacity, float loadFactor) {
		this.initialCapacity = capacity;
		this.loadFactor = loadFactor;
	}
	
	HashMap(int capacity) {
		this.initialCapacity = capacity;
	}

	public boolean put(int key, int value) {
		// the actual capacity check is number of buckets * load factor;
		
		if(arr.length <= this.loadFactor*count) {
			Node[] newArr = new Node[arr.length * 2];

     	    for(Node node : arr) {
     	    	int hashCode = node.hashCode();
     	    	node.clearNext();

     	    	//Doing an bitwise and with the maximum number of one bits gives the number of set bits in the bitwise form, where the maximum will be the array length.
     	    	//This being as good as doing a hashCode & newArr.length;

     	    	int index = hashCode & (newArr.length-1);
     	    	if(newArr[index] == null) {
     	    		newArr[index] = node;
     	    	}
     	    	else {
     	    		Node lastNode = getLast(newArr[index]);
     	    		lastNode.next = node;
     	    	}
     	    }
     	    arr = newArr;
		}

		Node node = new Node(key, value);
		
		//TODO:: this should be a hash code similar to the objects hashcode in java
		node.setHashCode(key & arr.length - 1);
		int index = node.hashCode() & (arr.length-1);
		if(arr[index] == null) {
			arr[index]  = node;
		}
		else {
			Node curr = arr[index];
		    while(curr.next != null) {
		    	if(curr.key == key) {
		    		curr.value = value;
		    		return true;
		    	}
			    curr = curr.next;
		    }
		    curr.next = node;
		}
		count++;
		return true;
	}

	public Integer get(int key) {
		int index = key & (arr.length-1);
		if(arr[index] == null) {
			return null;
		}
		Node curr = arr[index];
		while(curr != null) {
			if(curr.key == key) {
				return curr.value;
			}
			curr = curr.next;
		}
		return null;
	}
	
	private Node getLast(Node head) {
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		return curr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap map = new HashMap();
		map.put(1, 5);
		map.put(2, 10);
		map.put(5, 2);
		System.out.println(map.get(1));
		System.out.println(map.get(2));
	}
}
