package interpreter.example_1;

public class OrExpression implements Expression{
	private Expression expr1 = null;
	private Expression expr2 = null;
	
	public OrExpression(Expression expr1,Expression expr2) {
		// TODO Auto-generated constructor stub
		this.expr1 = expr1;
		this.expr2 = expr2; 
	}
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return expr1.interpret(context)||expr2.interpret(context);
	}

}
