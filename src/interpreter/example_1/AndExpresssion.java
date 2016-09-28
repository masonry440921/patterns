package interpreter.example_1;

public class AndExpresssion implements Expression{
	private Expression exp1;
	private Expression exp2;
	
	public AndExpresssion(Expression exp1,Expression exp2) {
		// TODO Auto-generated constructor stub
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return exp1.interpret(context)&&exp2.interpret(context);
	}

}
