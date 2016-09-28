package state.example_1;

public class StopState implements State{

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("dafda");
		context.setState(this);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "stop State";
	}
}
