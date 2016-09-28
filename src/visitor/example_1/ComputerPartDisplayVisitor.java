package visitor.example_1;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{

	@Override
	public void visit(Computer computer) {
		// TODO Auto-generated method stub
		System.out.println("11");
	}

	@Override
	public void visit(Mouse mouse) {
		// TODO Auto-generated method stub
		System.out.println("SSS");
	}

	@Override
	public void visit(Keyboard keyboard) {
		// TODO Auto-generated method stub
		System.out.println("MMM");
	}

	@Override
	public void visit(Monitor monitor) {
		// TODO Auto-generated method stub
		System.out.println("KK");
	}

}
