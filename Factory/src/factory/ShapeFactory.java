package factory;

public class ShapeFactory {
	public Shape getShape(String type) {
		if(type.equals("Rectangle")) {
			return new Rectangle();
		}else {
			return new Circle();
		}
	}
}
