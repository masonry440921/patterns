package observer.example_1;

public class BinaryObserver extends Observer{
	public BinaryObserver(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(subject.getState()));
	}

}
