package chain.example_1;

public enum RequestType {
	DEFEND_CASTLE("defend_castle"),
	TORTURE_PRISONER("toture_prisoner"),
	COLLECT_TAX("collect_tax");
	
	private String type;
	RequestType(String type){
		this.type = type;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return type;
	}
}
