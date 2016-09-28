package flyweight.example_1;

public class EnglishTeacher extends Teacher{
	void teach(){
		System.out.println("teach english "+ System.identityHashCode(this));
	}
}
