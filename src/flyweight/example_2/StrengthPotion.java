package flyweight.example_2;

public class StrengthPotion implements Potion {

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("you feel stong.(Potion = " + System.identityHashCode(this) + ")");
	}

}
