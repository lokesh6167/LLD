package factory;

public class Client {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape shape = factory.getShape("Rectangle");
		shape.draw();
	}
}
	
	
