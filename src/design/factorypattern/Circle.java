package design.factorypattern;

public class Circle implements Shape{
	int radius;
	
	Circle(int r) {
		this.radius = r;
	}
	public double area() {
		return 3.14*radius*radius;
	}
}
