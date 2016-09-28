package adapter.example_2;
//adapter
public class BallteFishingBoat implements BattleShip{
	private FishingBoat fishingBoat;
	
	public BallteFishingBoat() {
		// TODO Auto-generated constructor stub
		fishingBoat =  new FishingBoat();
	}
	
	
	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("fire");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		fishingBoat.sail();
	}

}
