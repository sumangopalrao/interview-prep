package stacks.queue.animalQ;

public abstract class Animal {
	
	String name;
	private int count;
	Type type;
	
	Animal(String name) {
		this.name = name;
	}
	
	public String name() {
		return this.name;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public Type getType() {
		return this.type;
	}
	
	public int getCount() {
		return this.count;
	}
	
	
}
