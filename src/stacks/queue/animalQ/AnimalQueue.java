// Program to simulate animal queue.
//CTCI 3.7

package stacks.queue.animalQ;

import java.util.LinkedList;
import java.util.List;

public class AnimalQueue {
	
	List<Animal> dog = new LinkedList<Animal>();
	List<Animal> cat = new LinkedList<Animal>();
	int count = 0;
	
	int size() {
		return dog.size() + cat.size();
	}
	
	
	public void enqueue(Animal animal) {
		animal.setCount(count++);
		if(animal.getType().equals(Type.CAT)) {
			cat.add(animal);
		}
		if(animal.getType().equals(Type.DOG)) {
			dog.add(animal);
		}
	}
	
	public Animal dequeueAny() {
		if(dog.isEmpty() && cat.isEmpty())
			return null;
		if(dog.isEmpty())
			return dequeueCat();
		else if(cat.isEmpty()) 
			return dequeueDog();
		if(dog.get(0).getCount() < cat.get(0).getCount()) {
			return dequeueDog();
		}
		return dequeueCat();
	}
	
	public Dog dequeueDog() {
		if(dog.isEmpty()) {
			return null;
		}
		return (Dog) dog.remove(0);
	}
	
	public Cat dequeueCat() {
		if(cat.isEmpty()) {
			return null;
		}
		return (Cat) cat.remove(0);
	}
	
   public static void main(String[] args) {
		AnimalQueue animals = new AnimalQueue();
		animals.enqueue(new Cat("Callie"));
		animals.enqueue(new Cat("Kiki"));
		animals.enqueue(new Dog("Fido"));
		animals.enqueue(new Dog("Dora"));
		animals.enqueue(new Cat("Kari"));
		animals.enqueue(new Dog("Dexter"));
		animals.enqueue(new Dog("Dobo"));
		animals.enqueue(new Cat("Copa"));
		
		System.out.println(animals.dequeueAny().name());	
		System.out.println(animals.dequeueAny().name());	
		System.out.println(animals.dequeueAny().name());	
		
		animals.enqueue(new Dog("Dapa"));
		animals.enqueue(new Cat("Kilo"));
		
		while (animals.size() != 0) {
			System.out.println(animals.dequeueAny().name());	
		}
	}
}
