package chain.example_1;

public class Request {
	private String requestDesc;
	private RequestType type;
	public Request() {
		// TODO Auto-generated constructor stub
	}
	
	public Request(RequestType type,String desc){
		
	}

	public String getRequestDesc() {
		return requestDesc;
	}

	public void setRequestDesc(String requestDesc) {
		this.requestDesc = requestDesc;
	}

	public RequestType getType() {
		return type;
	}

	public void setType(RequestType type) {
		this.type = type;
	}
	
}
