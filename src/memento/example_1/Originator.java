package memento.example_1;

public class Originator {
	private String state;
	
	
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento saveStateToMemento(){
		return new Memento(state);
	}

	public void getStateFromMemento(Memento memento) {
		// TODO Auto-generated method stub
		state = memento.getState();
	}
}
