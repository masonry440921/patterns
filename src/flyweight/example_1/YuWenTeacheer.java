package flyweight.example_1;

public class YuWenTeacheer extends Teacher{
	void teach(){
		System.out.println("teach yuwen "+ System.identityHashCode(this));
	}
}
