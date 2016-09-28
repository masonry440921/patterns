package chain.example_2;

public class DebugLogge extends Abstractlogger{
	public DebugLogge(int level) {
		// TODO Auto-generated constructor stub
		this.level = level;
	}

	@Override
	public void write(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}
}
