package flyweight.example_1;

public  abstract class Teacher extends Person{
	private Integer number;
	
	public Teacher(String name,Integer age, Integer sex,Integer number) {
		// TODO Auto-generated constructor stub
		super(name,age,sex);
		this.number = number;
	}
	
	public Teacher() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	 abstract void teach();
		
}
