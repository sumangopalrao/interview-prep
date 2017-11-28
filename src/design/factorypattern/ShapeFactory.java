package design.factorypattern;

public class ShapeFactory {

	public Shape getShape(String type, int r) {
		if(type.equals("CIRCLE"))
			return new Circle(r);
		if(type.equals("SQUARE"))
			return new Square(r);
		return null;
	}
}
