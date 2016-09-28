package adapter.example_1;

public class App {
	public static void main(String[] args) {
		Shape shape = new Shape(new TextShape());
		shape.BoundingBox();
		shape.CreateManipulator();
	}
}
