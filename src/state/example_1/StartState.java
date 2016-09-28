package state.example_1;

public class StartState implements State{

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("sss");
		context.setState(this);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Start State";
	}
}
