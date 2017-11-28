package design.factorypattern;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		int r = 12;
		Shape circle = factory.getShape("CIRCLE", r);
		Shape square = factory.getShape("SQUARE", r);
		System.out.println(circle.area());
		System.out.println(square.area());
	}
}
