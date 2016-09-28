package flyweight.example_1;

public class WuliTeacher extends Teacher{
	void teach(){
		System.out.println("teach wuli " + System.identityHashCode(this));
	}
}
