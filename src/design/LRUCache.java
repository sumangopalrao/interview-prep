//Program to implement a LRU cache in Java.   
//LC:https://leetcode.com/problems/lru-cache/

package design;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
	
	HashMap<Integer, Integer> map;
	Deque<Integer> list;
	int size;
	
	LRUCache(int size) {
		this.size = size;
		list = new LinkedList<Integer>();
		map = new HashMap<Integer, Integer>();
	}
	
	public void put(int key, int value) {
		if (map.containsKey(key)) {
            list.remove(key);
        } else if (list.size() == size) {
			// If cache is full, remove the LRU item
			int removeKey = list.pollLast();
			map.remove(removeKey);
		}
        // Add the new/updated item to the front of the list and to the map
		list.addFirst(key);
		map.put(key, value);
	}
	
	public int get(int key) {
		if (map.containsKey(key)) {
			list.remove(key);
			list.addFirst(key);
			return map.get(key);
		}
		return -1;
	}
	
	public void print() {
		for(Map.Entry<Integer, Integer> i: map.entrySet()) {
			System.out.println(i.getKey() + ":" + i.getValue());
		}
		
		System.out.println("Queue is:");
		for(Integer i : list) {
			System.out.print(i + "-->");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache cache = new LRUCache(3);
		cache.put(3, 3);
		cache.put(1, 1);
		cache.put(2, 2);
		cache.put(4, 4);
		cache.print();
		System.out.println(cache.get(1));
		cache.print();
		cache.get(4);
		cache.print();
	}

}
