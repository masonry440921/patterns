package adapter.example_2;
//client
public class Captain implements BattleShip{
	private BattleShip battleShip;

	public Captain() {
		// TODO Auto-generated constructor stub
	}
	
	public Captain(BattleShip battleShip) {
		// TODO Auto-generated constructor stub
		this.battleShip = battleShip;
	}
	
	public void setBattleShip(BattleShip battleShip) {
		this.battleShip = battleShip;
	}
	@Override
	public void fire() {
		// TODO Auto-generated method stub
		battleShip.fire();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		battleShip.move();
	}

}
