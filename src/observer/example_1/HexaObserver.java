package observer.example_1;

public class HexaObserver extends Observer{
	public HexaObserver(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(Integer.toHexString(subject.getState()));
	}

}
