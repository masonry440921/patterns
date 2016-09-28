package visitor.example_1;

public class Computer implements ComputerPart{
	private ComputerPart[] parts;
	
	public Computer() {
		// TODO Auto-generated constructor stub
		parts = new ComputerPart[]{new Monitor(),new Mouse(),new Keyboard()};
	}
	
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		// TODO Auto-generated method stub
		for(ComputerPart p:parts){
			p.accept( computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}

}
