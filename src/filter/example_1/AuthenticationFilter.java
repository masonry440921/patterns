package filter.example_1;

public class AuthenticationFilter implements Filter{

	@Override
	public void execute(String request) {
		// TODO Auto-generated method stub
		System.out.println("Auth" + request);
	}

}
