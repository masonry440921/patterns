package flyweight.example_2;

public class HealingPotion implements Potion {

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("you feel healing.(Potion = " + System.identityHashCode(this) +")");
	}

}
