package visitor.example_1;

public class App {
	public static void main(String[] args) {
		ComputerPart computer = new Computer();
	    computer.accept(new ComputerPartDisplayVisitor());
	}
}
