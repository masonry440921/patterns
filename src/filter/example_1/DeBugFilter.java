package filter.example_1;

public class DeBugFilter implements Filter{

	@Override
	public void execute(String request) {
		// TODO Auto-generated method stub
		System.out.println("DeBug" + request);
	}

}
