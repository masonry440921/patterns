package flyweight.example_2;

public class HolyWaterPotion implements Potion {

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("you feel holy.(Potion = " + System.identityHashCode(this) + ")");
	}

}
