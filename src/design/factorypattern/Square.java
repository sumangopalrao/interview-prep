package design.factorypattern;

public class Square implements Shape{
	int length;
	
	Square(int l) {
		this.length = l;
	}
	
	public double area(){
		return length*length;
	}
}
