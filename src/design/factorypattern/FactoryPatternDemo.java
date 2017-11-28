package design.factorypattern;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		int r = 12;
		Shape circle = ShapeFactory.getShape("CIRCLE", r);
		Shape square = ShapeFactory.getShape("SQUARE", r);
		System.out.println(circle.area());
		System.out.println(square.area());
	}
}
