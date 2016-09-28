package visitor.example_1;

public class App {
	
	//核心数据基础类有个方法接受访问者，将自身引用转给访问这，accept(visitor  v){v.visit(this)}
	public static void main(String[] args) {
		ComputerPart computer = new Computer();
	    computer.accept(new ComputerPartDisplayVisitor());
	}
}
