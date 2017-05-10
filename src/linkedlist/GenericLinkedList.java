/** Implement a linked list that can store different datatypes using TDD **/
package linkedlist;

public class GenericLinkedList<T> {
	
	Node<T> head;
	
	public boolean isEmpty() {
		if(head == null)
			return true;
		return false;
	}
	
	public void add(T element) {
		Node<T> curr = head;
		Node<T> node = new Node<T>(element);
		if(head == null) {
			head = node;
			return;
		}
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = node;
	}
	
	public boolean remove(T element) {
		if(head == null)
			return false;
		Node<T> curr = head;
		Node<T> prev = null;
		while(curr != null) {
			if(curr.data == element) {
				prev.next = curr.next;
				return true;
			}
			prev = curr;
			curr = curr.next;
		}
		return false;
	}
	
	public boolean contains(T element) {
		Node<T> curr = head;
		System.out.println(element.toString());
		while(curr != null) {
			if(curr.data == element) {
				return true;
			}
		}
		return false;
	}
	
	private static class Node<T> {
		T data;
		Node<T> next;
		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
	
	
}
