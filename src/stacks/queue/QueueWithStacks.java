//Program to implement a myqueue class using stacks.
//CTCI 3.4

package stacks.queue;

public class QueueWithStacks {
	
	Stack<Integer> stA;
	Stack<Integer> stB;
	
	QueueWithStacks() {
		stA = new Stack<Integer>();
		stB = new Stack<Integer>();
	}
	
	public void offer(int val) {
		stA.push(val);
	}
	
	public int peek() {
		if(!stB.isEmpty())
			return stB.peek();
		else {
			while(!stA.isEmpty()) {
				stB.push(stA.pop());
			}
		}
		return stB.peek();
	}
	
	public void poll() {
		if(!stB.isEmpty())
			stB.pop();
		else {
			while(!stA.isEmpty()) {
				stB.push(stA.pop());
			}
		}
	}
	
	public boolean isEmpty() {
		if(stA.isEmpty() && stB.isEmpty())
			return true;
		return false;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueWithStacks q = new QueueWithStacks();
		
		q.offer(1);
		q.offer(4);
		q.offer(3);
		q.offer(2);
		System.out.println(q.peek());
		q.poll();
		q.poll();
		System.out.println(q.peek());

	}

}
