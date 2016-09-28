package interpreter.example_1;

public class App {
	
	//终结，非终结
	public static Expression getMaleExpression(){
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}
	
	public static Expression getMarriedExpression(){
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpresssion(julie, married);
	}
	
	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarried = getMarriedExpression();
		System.out.println(isMale.interpret("John"));
		System.out.println(isMarried.interpret("Julie Married"));
		System.out.println(isMale.interpret("Julie"));
		System.out.println(isMarried.interpret("John Married"));
	}
}
